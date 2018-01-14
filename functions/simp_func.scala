// simp_func.scala
println("\n--- Simp func ----------")
def simple(): Unit = {
	println("simpl funt")
}
simple()

println("\n--- Adder ----------")
def adder(num1: Int, num2: Int): Int = {
	/*return */num1 + num2 // can be with out return statement
}
adder(2,3)
// adder(2.1,3.4) // error - type mismatch
// adder(2,3.0) // error - type mismatch

println("\n--- Funt with Strings ----------")
def greetName(name: String): String = {
	s"Hello $name"
}

val hiJose = greetName("Jose")
println(hiJose)

println("\n--- Prime (simple) number ----------")
def isPrime(numcheck: Int): Boolean = {
	for(n <- Range(2,numcheck)) {
		if(numcheck % n == 0) {
			return false
		} /*else {
			return true
		}*/
	}
	return true
}
println(s"12.prime?: ${isPrime(12)}")
println(s"13.prime?: ${isPrime(13)}")

println("\n--- Func with arrays ----------")
val numbers = List(1,2,4,8)
def checkF(nums: Int): List[Int] = {
	return nums
}
println(checkF(numbers)) // error couse input no one Int
println(checkF(5)) // error couse return not List

def checkF2(nums: List[Int]): List[Int] = {
	return nums
}
println(checkF2(numbers)) // ALL RIGHT
println(checkF2(5)) // error couse input no List