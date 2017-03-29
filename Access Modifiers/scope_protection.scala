package society {
    package professional {
        class Executive {
            private[professional] var workDetails = null //프로페셔널 패키지까지 접근 가능
            private[society] var friends = null // 소사이어티 까지
            private[this] var secret = null // this 까지
        }

        def help(another: Executive){
            println(another.workDetails)
            println(another.secret) // this까지니깐 에러.
        }
    }
}