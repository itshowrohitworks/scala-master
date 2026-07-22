@main
def typeCasting(): Unit =
  // Data Types:
  // 1. Int - Whole Numbers
  val age = 20

  // 2. Double - Decimal Numbers upto 64 bits
  val cgpa = 8.56 // default for double

  // 3. Float - Decimal Numbers upto 32 bits
  val temp = 32.6f // Use f for float

  // 4. String - Stores Text
  // Use Double Quotes for it ( "" )
  val name = "Test"

  // 5. Boolean - Stores only 2 Values
  // true and false
  val isStudent = true

  // 6. Char - Stores a single character
  // Use Single Quotes for it ( '' )
  val grade = 'A'

  // Type Inference or Type Casting
  // Types: Implicit and Explicit
  // 1. Implicit: The compiler auto-detects the dtype.
  val score = 100

  // 2. Explicit: Sometimes we have to specify dtype.
  val weight:Int = 65
  val pokemon:String = "Pikachu"

  // Usage Rule:
  // 1. Use type inference for local variables.
  // 2. Use explicit types when they make APIs or function signatures, and to make complex code easier to understand.