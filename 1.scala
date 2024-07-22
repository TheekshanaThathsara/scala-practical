object VariableEvaluation {
  def main(args: Array[String]): Unit = {
    var i, j, k = 2
    val m, n = 5
    val f = 12.0f
    val g = 4.0f
    val c = 'X'

    // Evaluate the expressions
    val a = k + 12 * m
    val b = m / j
    val d = m / j * j
    val e = f + 10 * 5 + g
    val fNew = { i += 1; i } * n

    // Print the results
    println(s"a) k + 12 * m = $a")
    println(s"b) m / j = $b")
    println(s"c) n % j = ${n % j}")
    println(s"d) m / j * j = $d")
    println(s"e) f + 10 * 5 + g = $e")
    println(s"f) ++i * n = $fNew")
  }
}
