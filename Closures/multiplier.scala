object Demo {
    def main(args: Array[String]){
        println("multiplier(1) value = " + multiplier(1))
        println("multiplier(2) value = " + multiplier(2))
    }

    var factor = 3; // 이거 val로 해도 됨
    val multiplier = (i: Int) => i * factor
}