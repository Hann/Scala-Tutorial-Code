// import java.io 하면 안됨
// Console.readLine은 Deprecated 됨

import scala.io.StdIn

object Demo {
    def main(args: Array[String]){
        print("Please enter your input: ") // 엔터 안 함
        val line = StdIn.readLine // input

        println("Thanks, you just typed: " + line)
    }
}