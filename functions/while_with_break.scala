// while_with_break.scala
println("if( y == 8 ) break")

import util.control.Breaks._

var y = 0

while (y < 10) {
    println(s"y = $y")
    y += 1
    if( y == 8 ) break
}