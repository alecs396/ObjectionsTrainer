import java.io.FileReader
import java.io.FileWriter

fun main() {
    println("OBJECTIONS TRAINER")
    println("===========================")
    println("1) Receive an Objection")
    println("2) Create Custom Objection")
    println("3) Exit")

    var input = readLine()!!.toInt()

    when(input) {
        1 -> {
            getObjection()
        } 2 -> {
            print("Enter Custom Objection:")
            var  str:String = readLine().toString()
            writeObjection(str)
        }
    }
}

fun writeObjection(str:String) {
    try {
        var fo = FileWriter("src\\objections.txt", true)
        fo.write(str + "\n")
        fo.close()
    }catch (ex:Exception) {
        print(ex.message)
    }
}

fun getObjection() {

    //Open File
    var file = FileReader("src\\objections.txt")

    //Read random line from file
    var objection = file.readLines().random()

    println(objection)

    println("\n===========================")
    println("1) Get another objection")
    println("2) Return to Main Menu")
    var input = readLine()!!.toInt()
    when (input) {
        1 -> {
            println("\n")
            getObjection()
        } 2 -> {
            println("\n")
            main()
        }
    }
}