class Outer {
    class Inner {
        def f() { println ("ff")}

        class InnerMost {
            f
        }
    }
    def test() {
        (new Inner).f
    }
}

object Main {
    def main(args: Array[String]){
        (new Outer).test
    }
}