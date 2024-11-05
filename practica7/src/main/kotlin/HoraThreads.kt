import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread
import kotlinx.coroutines.*

fun main() = runBlocking {

    // Llama a una de las funciones según el mecanismo que quieras utilizar
    // startWithThread()
    // startWithTimer()
    val job = launch {
        startWithCoroutine()
    }
    println("desp de ejecutar la corrutina")
    delay(10000)
    println("cancelando desp de 10 segundos")
    job.cancelAndJoin()
}

// Función que imprime la fecha y hora actual
fun printCurrentDate() {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val currentDate = Date()
    val formattedDate = dateFormat.format(currentDate)
    println("Hora actual: $formattedDate")
}

// Opción 1: Usar un hilo
fun startWithThread() {
    thread(start = true) {
        while (true) {
            printCurrentDate()
            TimeUnit.SECONDS.sleep(1)
        }
    }
}

// Opción 2: Usar Timer
fun startWithTimer() {
    val timer = Timer()
    timer.scheduleAtFixedRate(object : TimerTask() {
        override fun run() {
            printCurrentDate()
        }
    }, 0, 1000)
}

// Opción 3: Usar corutinas
suspend fun startWithCoroutine() {
    while (true) {
        printCurrentDate()
        delay(1000)
    }
}
