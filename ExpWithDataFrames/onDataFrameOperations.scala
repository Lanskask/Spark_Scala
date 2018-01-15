// onDataFrameOperations.scala

import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()

// val df = spark.read.csv("CitiGroup2006_2008")
val df = spark.read.option("header", true).option("inferSchema", true).csv("CitiGroup2006_2008")

import spark.implicits._

println("--- Scala Notation ---")
df.filter($"Close" > 480).show()

println("--- Spark SQL Notation ---")
df.filter("Close > 480").show()

// println("--- Is Equals? ---")
// df.filter($"Close" > 480).equals(df.filter("Close > 480"))

println("=== Double Filtering ===")
println("--- Scala Notation ---")
df.filter($"Close" < 480 && $"High" < 480).show()
println("--- Spark SQL Notation ---")
df.filter("Close < 480 AND High < 480").show()

println("--- Save result in a val  ---")
val ClHi_coll = df.filter("Close < 480 AND High < 480").collect()
println("ClHi_coll takeRight(11): ")
ClHi_coll.takeRight(11).foreach {println}

println("--- Num of items under filter  ---")
df.filter("Close < 480 AND High < 480").count()

println("=== Equality in filter ===")
println("--- Scala Notation ---")
df.filter($"High" === 484.40).show()
// println(df.filter($"High" === 484.40))
println("--- Spark SQL Notation ---")
df.filter("High = 484.40").show()
// df.filter($"High" === 484.40).equals(df.filter("High = 484.40"))

println("=== Corelation between columns ===")
df.select(corr("High","Low"))