object VariableEvaluation {
  def main(args: Array[String]): Unit = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    val k = 4.3f
    var g = 0.0f // Assuming g needs to be declared

    // Evaluate the expressions

    // a) println( - -b * a + c * d - -);
    // This expression appears to have an error with the final - -. I'll assume it should be -(-b * a) + c * d
    println(-(-b * a) + c * d)  // Corrected expression

    // b) println(a++);
    println({
      val temp = a
      a += 1
      temp
    }) // Scala does not support post-increment (a++), so we use a temporary variable

    // c) println(–2 * ( g – k ) +c);
    // The expression uses en-dash instead of a hyphen for negative sign. I'll correct it.
    println(-2 * (g - k) + c)

    // d) println(c=c++);
    // Scala does not support post-increment (c++), so we use a temporary variable
    println({
      val temp = c
      c += 1
      temp
    })

    // e) println (c=++c*a++);
    // Scala does not support pre-increment (++c) or post-increment (a++), so we use a block
    println({
      c += 1
      val result = c * {
        val temp = a
        a += 1
        temp
      }
      result
    })
  }
}
