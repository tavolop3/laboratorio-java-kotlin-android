import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit
import kotlin.random.Random

class CallableRunner(private val id: Int) : Callable<Int> {
    override fun call(): Int {
        for (i in 0..100) {
            if (Random.nextInt(1, 200) == 1) { // Simulamos abandono de carrera
                return -1
            } else if (Random.nextInt(1, 2000) == 1) {
                throw Exception("soy $id y me cansé")
            } else {
                println("soy corredor n°$id y voy $i metros recorridos")
            }
        }
        return id
    }

}

fun main() {
    val exec = Executors.newFixedThreadPool(5)

    print("Cantidad de corredores: ")
//    val n = readln().toInt()
    val n = 5

    val corredores = ArrayList<CallableRunner>()
    for (i in 1..n) {
        corredores.add(CallableRunner(i))
    }

    val futures: List<Future<Int>> = corredores.map { exec.submit(it) }
    futures.forEach {
        try {
            val res = it.get()
            if(res == -1) {
                println("el corredor se deshidrató")
            } else {
                println(res)
            }
        } catch (e: Exception) {
            println("error ${e.message}")
        }
    }

    exec.shutdown()
    exec.awaitTermination(10,TimeUnit.SECONDS)
}