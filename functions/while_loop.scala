// while_loop.scala
var x = 0

while(x < 5) {
	println(s"x < ${x+=1}")
}

println("New syntax")
x = 0
while(x < 5) {
	println(s"x < $x")
	x+=1
}