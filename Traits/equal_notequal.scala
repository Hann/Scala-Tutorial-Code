trait Equal {
    def isEqual(x: Any): Boolean
    def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class Point(xc: Int, yc: Int) extends Equal{
    var x: Int = xc
    var y: Int = yc

    def isEqual(obj: Any) = obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == y
}


object Demo {
    def main(args: Array[String]){
        val p1 = new Point(2, 3)
        val p2 = new Point(2, 4)
        var p3 = new Point(3, 3)

        println(p1.isNotEqual(p2)) // p1과 p2가 같은가는 아니네 다만 p2.x == p1.y 확인한다 => !false => true
        println(p1.isNotEqual(p3)) // p2.x == p1.y => !true => false
        println(p1.isNotEqual(2)) // 2 is not instance of Point
    }
}