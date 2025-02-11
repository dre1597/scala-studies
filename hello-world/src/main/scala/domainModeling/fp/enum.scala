val currentCrustSize = Small

enum CrustSize:
  case Small, Medium, Large

enum CrustType:
  case Thin, Thick, Regular

import CrustSize.*

enum Topping:
  case Cheese, Pepperoni, BlackOlives, GreenOlives, Onions

// enums in a `match` expression
currentCrustSize match
  case Small => println("Small crust size")
  case Medium => println("Medium crust size")
  case Large => println("Large crust size")

// enums in an `if` statement
if currentCrustSize == Small then println("Small crust size")
