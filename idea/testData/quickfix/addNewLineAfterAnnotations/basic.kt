// "Add new line after annotations" "true"

@Target(AnnotationTarget.EXPRESSION)
annotation class Ann

fun foo(y: Int) {
    var x = 1
    @Ann x<caret> += 2
}
