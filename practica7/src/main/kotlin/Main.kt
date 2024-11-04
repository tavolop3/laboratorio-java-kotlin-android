import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread
import kotlinx.coroutines.*

fun main() = runBlocking {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

    // Llama a una de las funciones según el mecanismo que quieras utilizar
    // startWithThread(dateFormat)
    // startWithTimer(dateFormat)
    startWithCoroutine(dateFormat)
}

// Función que imprime la fecha y hora actual
fun printCurrentDate(dateFormat: SimpleDateFormat) {
    val currentDate = Date()
    val formattedDate = dateFormat.format(currentDate)
    println("Hora actual: $formattedDate")
}

// Opción 1: Usar un hilo
fun startWithThread(dateFormat: SimpleDateFormat) {
    thread(start = true) {
        while (true) {
            printCurrentDate(dateFormat)
            TimeUnit.SECONDS.sleep(1)
        }
    }
}

// Opción 2: Usar Timer
fun startWithTimer(dateFormat: SimpleDateFormat) {
    val timer = Timer()
    timer.scheduleAtFixedRate(object : TimerTask() {
        override fun run() {
            printCurrentDate(dateFormat)
        }
    }, 0, 1000)
}

// Opción 3: Usar corutinas
suspend fun startWithCoroutine(dateFormat: SimpleDateFormat) {
    while (true) {
        printCurrentDate(dateFormat)
        delay(1000)
    }
}
