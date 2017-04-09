object Demo {
    def main(args: Array[String]){
        println(matchTest(3))
    }

    def matchTest(x: Int): String = x match {
        case 1 => "one"
        case 2 => "two"
        case _ => "many" //이것저것~ 디폴트 같은 개념인듯
    }
}