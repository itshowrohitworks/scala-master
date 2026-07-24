@main
def strings():Unit=
  // String: A sequence of characters used to represent text.
  println("Basic String:")
  val firstName = "Johnny"
  val lastName = "Test"

  println(firstName)
  println(lastName)

  // String Concatenation: Joining two or more strings.
  println("\nString Concatenation:")
  println(firstName + " " + lastName) // use +

  // Scala Interpolation: Using Variables btw Strings.
  // s interpolation:
  println("\nString Interpolation:")
  val age = 24
  println(s"His name is $firstName,")
  println(s"and his age is $age.")

  // Expression inside String:
  println("\nExpressions inside String:")
  val a = 20
  val b = 30
  println(s"Sum of $a and $b is ${a + b}")

  // Rule:
  // 1. Variable: $...
  // 2. Expression: ${...}

  // Multi-line Strings in Scala:
  println("\nMulti-line Strings:")
  val multi =
    """
      Welcome to Scala!
      This is line two.
      This is line three.
    """.stripMargin

  println(s"Multi-line: \n$multi")

  // Escape Characters:
  println("\nEscape Characters:")
  println("He said \"Hello!\"")

  // Useful escape sequences:
  // 1. \" - Double Quote
  // 2. \n - New Line
  // 3. \t - Tab
  // 4. \\ - Backslash

  println("Name\t Johnny")
  println("Age \t 24")

  // Useful String Methods: Uses Dot Notation
  println("\nString Methods:")
  val name = "Johnny"
  println(s"Length of Name: ${name.length}")
  // Note: Python uses a function len() while scala uses a property like method.

  val movie = "Batman Returns"
  println(s"Normal: $movie")
  println(s"Uppercase: ${movie.toUpperCase}")
  println(s"Lowercase: ${movie.toLowerCase}")
  println(s"Contains \"Bat\"?: ${movie.contains("Bat")}")
  println(s"Starts with \"Bat\"?: ${movie.startsWith("Bat")}")
  println(s"Ends with \"rns\"?: ${movie.endsWith("rns")}")
  println(s"Replace Bat with Cat: ${movie.replace("Bat","Cat")}")

  // Note: Strings are immutable as well, these methods creates new strings.