import java.io.FileReader
import java.io.FileWriter

fun main() {
    println("OBJECTIONS TRAINER")
    println("===========================")
    println("1) Receive an Objection")
    println("2) Create Custom Objection")

    var op = readLine()!!.toInt()

    when(op) {
        1 -> {
            readFromFile()
        } 2 -> {
            print("Enter Custom Objection:")
            var  str:String = readLine().toString()
            writeToFile(str)
        }
    }
}

fun writeToFile(str:String) {
    try {
        var fo = FileWriter("src\\objections.txt", true)
        fo.write(str + "\n")
        fo.close()
    }catch (ex:Exception) {
        print(ex.message)
    }
}

fun readFromFile() {

    try {
        var fin= FileReader("src\\objections.txt")
        var c : Int?
        do {
            c = fin.read()
            print(c.toChar())
        } while(c != -1)

    }catch (ex:Exception) {
        print(ex.message)
    }

}