// fiveWorkWithDateAndTimestamps.scala
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()
// val df = spark.read.csv("CitiGroup2006_2008")
val df = spark.read.option("header", true).option("inferSchema", true).csv("CitiGroup2006_2008")
import spark.implicits._

df.printSchema()

df.select(month(df("Date"))).show()
df.select(year(df("Date"))).show()

val df2 = df.withColumn("Year", year(df("Date")))
val dfAvgs = df2.groupBy("Year").mean()
dfAvgs.select($"Year", $"avg(Close)").show

val dfMins = df2.groupBy("Year").min().sort("Year")
dfMins.show
dfMins.select($"Year", $"min(Close)").show
