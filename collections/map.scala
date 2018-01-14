val myMap = Map(("a", 1), ("b", 2), ("c", 3))

myMap(a)
myMap("a")
myMap("c")
myMap("d") // error NoSuchElementExeption

myMap.get("a")
myMap get "a"

myMap.get("d")

println("---------")

val mutMap = collection.mutable.Map(("x", 1), ("y", 2), ("z", 3))
mutMap += ("newKey" -> 999)
mutMap += ("newKey", 999) // wrong syntax:  error: type mismatch;

mutMap.keys
mutMap.values