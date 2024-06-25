object Main extends App {
  var a, b, c, d: Int = 0
  var k: Float = 0.0f

  // Assign initial values
  a = 2
  b = 3
  c = 4
  d = 5
  k = 4.3f

  // Evaluate expressions
  val expression_a = -(-b) * a + c * d - (-1)
  val expression_b = { val temp = a; a += 1; temp }
  val expression_c = -(2 * (g - k)) + c  // Assuming 'g' is another variable
  val expression_d = { c = c + 1; c }    // Post-increment assignment to 'c'
  val expression_e = { c = c + 1; c * a }

  // Print results
  println(s"a) Result of - -b * a + c * d - -: $expression_a")
  println(s"b) Result of a++: $expression_b")
  println(s"c) Result of –2 * (g – k) + c: $expression_c")
  println(s"d) Result of c=c++: $expression_d")
  println(s"e) Result of c=++c*a++: $expression_e")
}
