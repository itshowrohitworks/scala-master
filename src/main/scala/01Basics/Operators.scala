@main
def operators(): Unit =
  print("Arithmetic Operators:")
  // 1. Arithmetic Operators:
  // Addition:
  print("Addition: ")
  println(10 + 6)

  // Subtraction:
  print("Subtraction: ")
  println(10 - 6)

  // Multiplication:
  print("Multiplication: ")
  println(10 * 6)

  // Division: Normal
  print("Division: ")
  println(10 / 6)

  // Division: Decimal
  print("Division Decimal: ")
  println(10.0 / 3)

  // Modulus:
  print("Modulus: ")
  println(10 % 6)
  print("\n")

  // 2. Assignment Operators:
  println("\nAssignment Operators:")
  val age = 25
  println(s"Age is $age!")
  print("\n")

  // 3. Comparison Operators: Returns a Boolean expression.
  println("\nComparison Operators:")
  println(age == 25) // Equals
  println(age != 25) // Not Equals
  println(age > 18) // Greater than
  println(age < 18) // Smaller than
  println(age >= 18) // Greater than or equal
  println(age <= 18) // Smaller than or equal

  // 4. Logical Operators: Combining Conditions.
  println("\nLogical Operators:")
  val apple = 18
  val banana = 15

  // AND - &&: If all conditions are true.
  println(age >= 18 && banana < 22)

  // OR - ||: If only one condition is true.
  println(age >= 18 || banana < 22)

  // NOT - !: Not equals to.
  val isStudent = true
  println(!isStudent)