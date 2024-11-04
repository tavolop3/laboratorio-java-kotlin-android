import kotlinx.coroutines.awaitAll
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

fun main() {
    val exec = Executors.newFixedThreadPool(3)
    val lock = Any()

    print("Cantidad de corredores: ")
    val corredores = readln().toInt()

    var ganador = -1;
    for (i in 1..corredores) {
        exec.execute {
            for (j in 0..100) {
                println("soy corredor n°$i y voy $j metros recorridos")
            }
            synchronized(lock) {
                if (ganador == -1) {
                    ganador = i;
                    println("SOY EL GANADOR, QUE EL MUNDO CONOZCA A $i")
                }
            }
            println("soy corredor n°$i y llegue a la meta")
        }
    }
    exec.shutdown()
    exec.awaitTermination(10,TimeUnit.SECONDS)
    println("El ganador es: $ganador")
}