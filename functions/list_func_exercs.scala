// list_func_exercs.scala
println("------- ifPalindrome ----")
def ifPalindrome(inStr: String) = {
	inStr.equals(inStr.reverse)
}

println(s"ifPalindrome('asd'): ${ifPalindrome("asd")}")
println(s"ifPalindrome('asa'): ${ifPalindrome("asa")}")

println("------- isSplitIntoEquals ----")
def isSplitIntoEquals(inList: List[Int]) = {
	// List(1,2,3,4).splitAt(2)._1.sum == List(1,2,3,4).splitAt(2)._2.sum
	inList.splitAt(inList.length/2)._1.sum == 
		inList.splitAt(inList.length/2)._2.sum
}

println(s"isSplitIntoEquals for (1,7,3,3): ${isSplitIntoEquals(List(1,7,3,3))}")
println(s"isSplitIntoEquals for (1,7,3,3): ${isSplitIntoEquals(List(1,7,5,3))}")
println(s"isSplitIntoEquals for (1,7,3,3): ${isSplitIntoEquals(List(7,4,3))}")
