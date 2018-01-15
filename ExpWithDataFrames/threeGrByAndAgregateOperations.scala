// threeGrByAndAgregateOperations.scala
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()
// val df = spark.read.csv("CitiGroup2006_2008")
val df = spark.read.option("header", true).option("inferSchema", true).csv("Sales.csv")
import spark.implicits._

df.groupBy("Company").mean().show()
df.groupBy("Company").count().show()
df.groupBy("Company").max().show()
df.groupBy("Company").min().show()
df.groupBy("Company").sum().show()

df.groupBy("Sales").mean().show()
df.groupBy("Sales").count().show()
df.groupBy("Sales").max().show()
df.groupBy("Sales").min().show()
df.groupBy("Sales").sum().show()

df.select(countDistinct("Sales")).show() //approxCountDistinct
df.select(sumDistinct("Sales")).show()
df.select(variance("Sales")).show()
df.select(stddev("Sales")).show() //avg,max,min,sum,stddev
df.select(collect_set("Sales")).show()

df.select(sum("Sales") / count("Sales")).show()
math.sqrt(df.select(variance("Sales")).collect()._1)
df.select(stddev("Sales")).show() 

df.orderBy("Sales").show()
df.orderBy($"Sales".desc).show()