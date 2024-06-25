object SalaryCalculator extends App {

  // Function to calculate take-home salary
  def calculateTakeHomeSalary(normalHours: Int, otHours: Int): Double = {
    val normalRate = 250   // Rs. per normal working hour
    val otRate = 85        // Rs. per OT hour
    val taxRate = 0.12     // 12% tax rate
    
    // Calculate earnings before tax
    val earningsBeforeTax = normalHours * normalRate + otHours * otRate
    
    // Calculate tax amount
    val taxAmount = earningsBeforeTax * taxRate
    
    // Calculate take-home salary
    val takeHomeSalary = earningsBeforeTax - taxAmount
    
    // Return the take-home salary
    takeHomeSalary
  }

  // Example usage: Calculate take-home salary for an employee with 40 normal hours and 30 OT hours
  val normalHours = 40
  val otHours = 30
  val takeHome = calculateTakeHomeSalary(normalHours, otHours)

  // Print the take-home salary
  println(s"The take-home salary for an employee working $normalHours normal hours and $otHours OT hours is Rs. $takeHome")
}
