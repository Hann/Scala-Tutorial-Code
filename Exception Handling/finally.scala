import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object Demo {
    def main(args: Array[String]){
        try{
            val f = new FileReader("input.txt")
        } catch { // 여기가 match라는 말이 없지만 패턴매칭
            case ex: FileNotFoundException => {
                println("Missing file exception")
            }
            case ex: IOException => {
                println("IO Exception")
            }
        } finally {
            println("Exiting fianlly...")
        }
    }
}