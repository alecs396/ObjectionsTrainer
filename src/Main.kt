import java.io.FileReader

fun main() {
    readFromFile()
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