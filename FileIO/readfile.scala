import scala.io.Source

object Demo {
    def main(args: Array[String]){
        print("Following is the content read: ") // 엔터 안 함

        Source.fromFile("test.txt").foreach { // 있는 파일 재활용...
            print
        }
    }
}