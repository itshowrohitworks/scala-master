@main
def variablesDemo(): Unit =
  // val : immutable variable
  val name = "Test"
  // name = "Some" will give error: Reassignment to val name
  println(s"Hello, $name!")

  // Real example of val:
  val pi = 3.14159


  // var: mutable variable
  var age = 44
  age = 45
  println(s"Your age is $age!")

  // Real example of var:
  var weight = 65
  print(s"Your weight was $weight kgs,") // for end like python use print only
  weight = 70
  println(s" now it's increased to $weight kgs.")

  // Data Science Examples:
  // Uses of val: values won't change
  val model_name = "RandomForest"
  val learning_rate = 0.0001
  val max_depth = 10
  val num_features = 100

  // Uses of var: values might naturally change
  var epoch = 1
  var total_loss = 0.0
  var accuracy = 0.0