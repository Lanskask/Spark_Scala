// for_stat.scala
println("List(1,2,3)")
for(num <- List(1,2,3)) {
	println(/*"Hello " + */num)
}

println("Range(1, 15+1, 2)")
for(num <- Range(1, 15+1, 2)) {
	println(/*"Hello " + */num)
}

println("Set(1,2,3,1,2,3)")
for(num <- Set(1,2,3,1,2,3)) {
	println(/*"Hello " + */num)
}

println("\n-----------")
for (num <- Range(0,10)) {
	if (num%2 == 0) {
		println(s"$num is even")
	} else if (num%2 == 1) {
		println(s"$num is odd")
	}
}