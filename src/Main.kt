import java.io.FileReader

fun main() {
    println("OBJECTIONS TRAINER")
    println("===========================")
    println("1) Receive an Objection")

    var op = readLine()!!.toInt()

    when(op) {
        1 -> {
            readFromFile()
        }
    }
}

fun readFromFile() {

    try {
        var fin=FileReader("src\\objections.txt")
        var c : Int?
        do {
            c = fin.read()
            print(c.toChar())
        } while(c != -1)

    }catch (ex:Exception) {
        print(ex.message)
    }

}