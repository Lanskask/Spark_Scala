Set(1,1,2,3,4,4)

var set1 = Set(1,2,3) 
var set2 = collection.mutable.Set(1,2,3)

set1 += 4
set2 += 4

val set3 = Set(1,2,3) 
val set4 = collection.mutable.Set(1,2,3)

set3 += 4 // error couse immutable and val
set4 += 4

val imut_set = collection.mutable.Set(1,2,3,4)
imut_set.add(5)
imut_set
// res7: scala.collection.mutable.Set[Int] = Set(1, 5, 2, 3, 4)
imut_set.min
imut_set.max

println("List to Set")
val myList = List(1,2,3,1,2,3)
myList.toSet
val setFrList = myList.toSet