object ProfitCalculator extends App {

  // Function to calculate attendance based on ticket price
  def calculateAttendance(price: Double): Int = {
    if (price == 15.0) {
      120
    } else if (price < 15.0) {
      120 + ((15 - price) / 5 * 20).toInt
    } else {
      120 - ((price - 15) / 5 * 20).toInt
    }
  }

  // Function to calculate profit based on ticket price
  def calculateProfit(price: Double): Double = {
    val attendance = calculateAttendance(price)
    val revenue = price * attendance
    val cost = 500 + (attendance * 3)
    val profit = revenue - cost
    profit
  }

  // Determine the best ticket price that maximizes profit
  def findBestTicketPrice(): Double = {
    val pricesToCheck = Array(10.0, 12.0, 15.0, 17.0, 20.0)  // Example prices to check
    val profits = pricesToCheck.map(price => (price, calculateProfit(price)))
    val bestPrice = profits.maxBy(_._2)._1
    bestPrice
  }

  // Find and print the best ticket price
  val bestPrice = findBestTicketPrice()
  val bestProfit = calculateProfit(bestPrice)

  println(s"The best ticket price to maximize profit is Rs. $bestPrice")
  println(s"At this price, the maximum profit is Rs. $bestProfit")
}
