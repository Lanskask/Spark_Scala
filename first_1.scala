println("scala 2")
println("as")

var name = "Jose"
var greeting = s"Hello, ${name}"
greeting = s"Hello, $name"
greeting = f"Hello, ${name}"
greeting = f"Hello, $name"
greeting = "Hello, ${name}"

println("-----------")

printf("A str: %s, Int: %d, Float: %f", 
	"Hella", 1, 11)
printf("A str: %s, Int: %d, Float: %f", 
	"Hella", 1.1, 11.1)
printf("A str: %s, Int: %d, Float: %f5.3", 
	"Hella", 1.1, 11.1)
