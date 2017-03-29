import java.io._

class Point(val xc: Int, val yc: Int){
    var x: Int = xc;
    var y: Int = yc;

    def move(dx: Int, dy: Int){
        x += dx
        y += dy
    }
}

object Demo {
    def main(args: Array[String]){
        val point = new Point(10, 20)
        printPoint

    }

    def printPoint(){
        //에러남.. 근데 왜 이게 예제지?
        println("Point x location: " + point.x)
        println("Point y location: " + point.y)
    }
}