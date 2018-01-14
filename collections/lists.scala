// collections
val evens = List(2,3,6,8,10)
// List[Int] = List(2, 3, 6, 8, 10)
List(1, 2.2, true)
// res32: List[AnyVal] = List(1, 2.2, true)
evens
// res33: List[Int] = List(2, 3, 6, 8, 10)
evens(0)
// res34: Int = 2

val list2 = List(List(1,2,3), List(4,5,6))
// list2: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6))

println("On list operations")
val list4 = List(5,2,8,1,9,10,3)
list4.max
list4.min
list4.sorted
list4.sum
list4.product

println("Unusual On list operations")
val list5 = List(0,1,2,3,4)
list5.drop(2) // all item right (as tail) from the item in braces
list5.takeright(1) // take the number items you print in 
list5.takeright(4) // return four (4) right items