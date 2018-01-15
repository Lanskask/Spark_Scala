// sixExcercises.scala
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()
// val df = spark.read.csv("CitiGroup2006_2008")
val df = spark.read.option("header", true).option("inferSchema", true).csv("Netflix_2011_2016.csv")
import spark.implicits._

// df.show()
df.columns
df.printSchema()
df.head(5)
df.describe().show

val df2 = df.withColumn("HV Ratio", df("High") / df("Valume"))
df.orderBy($"High".desc).show

// mean in "Close" column
df.select(mean("Close")).show
// min and max in Volume column
df.select(first(df("Date")), max("Volume")).show
df.select(df("Date"), min("Volume"))).show
df.select(min("Volume"), max("Volume")).show

df.filter($"Close" < 600).count()

df.filter($"High" > 500).count()
df.filter($"High" > 500).count() * 1.0 / df.count() * 100

df.select(corr("High", "Volume")).show

val dfYear = df.withColumn("Year", year(df("Date")))
val yearMaxes = dfYear.select($"Year",$"High").groupBy("Year").max()
yearMaxes.select($"Year", $"max(High)").show
yearMaxes.select($"Year", $"max(High)").orderBy("Year").show
yearMaxes.select($"Year", $"max(High)").sort($"max(High)".desc).show

println("avrg Close for each Calendar Month")
val monthDf = df.withColumn("Month", month(df("Date")))
val monthAvgs = monthDf.select($"Month", $"Close").groupBy("Month").mean() 
monthAvgs.select($"Month", $"avg(Close)").orderBy("Month").show
