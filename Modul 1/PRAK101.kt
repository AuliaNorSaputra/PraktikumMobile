import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

fun main(args: Array<String>){

    val input = Scanner(System.`in`)

    print("Waktu Sekarang: ")
    val waktu = input.nextLine()
    print("Nama Anda: ")
    val nama = input.nextLine()
    print("Umur Anda: ")
    val umur = input.nextLine()
    //print("Suhu Tubuh Anda: ")
    //val suhu = input.nextLine()
    val suhu = String.format(
        "%.1f", ThreadLocalRandom.current().nextDouble(35.0, 37.0))
    println("Selamat $waktu, $nama")
    println("Umur anda $umur Tahun")
    println("Suhu Tubuh anda $suhu derajat Celcius.")
}