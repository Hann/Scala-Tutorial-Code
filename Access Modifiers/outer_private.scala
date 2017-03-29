class Outer{
    class Inner{
        private def f() {
            printf("f")
        }
        class InnerMost {
            f()
        }
    }
    // Error
    (new Inner).f()
}