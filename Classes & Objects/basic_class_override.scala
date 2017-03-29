import java.io._

class Point(val xc: Int, val yc: Int) {
      var x: Int = xc
      var y: Int = yc

      def move(dx: Int, dy: Int) {
            x = x + dx
            y = y + dy
            println("Point x location" + x)
            println("Point y location" + y)
      }
}

class Location(override val xc: Int, override val yc: Int, val zc: Int) extends Point(xc, yc){
      // 오버라이드라고 쓰는건 일종의 규약이라고 함
      // 그래서 어떤 constructor를 override하는지 적어야하는듯
      var z: Int = zc
      def move(dx: Int, dy: Int, dz: Int){
            x += dx
            y += dy
            z += dz

            println("Point x location" + x)
            println("Point y location" + y)
            println("Point z location" + z)
      }
}

object Demo{
       def main(args: Array[String]){
            var loc = new Location(10, 20, 15);
            loc.move(10, 10, 5);
       }
}