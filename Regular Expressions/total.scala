import scala.util.matching.Regex

object Demo {
    def main(args: Array[String]){
        val pattern = "abl[ae]\\d+".r //이게 \\을 쓰는게 그냥 \ 은 이스케이프라서 그렇다구 함
        val str = "ablaw is able1 and cool"

        println((pattern findAllIn str).mkString(","))
    }
}