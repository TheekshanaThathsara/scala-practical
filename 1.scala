object Main extends App {
  var i, j, m, n, k: Int = 0
  var f, g: Float = 0.0f
  var c: Char = ' '

  // Assign initial values
  k = i = j = 2
  m = n = 5
  f = 12.0f
  g = 4.0f
  c = 'X'

  // Evaluate expressions
  val a = k + 12 * m
  val b = m / j
  val c1 = n % j
  val d = m / j * j
  val e = f + 10 * 5 + g
  val f1 = (++i) * n

  // Print results
  println(s"a) k + 12 * m = $a")
  println(s"b) m / j = $b")
  println(s"c) n % j = $c1")
  println(s"d) m / j * j = $d")
  println(s"e) f + 10*5 + g = $e")
  println(s"f) ++i * n = $f1")
}
