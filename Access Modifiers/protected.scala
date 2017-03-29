package p {
    class Super {
        protected def f() { printf("f")}
    }

    class Sub extends Super {
        f()
    }

    class Other {
        (new Super).f // Error임 프로 텍트니깐
    }
}