// SimpDf.scala

import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()

// val df = spark.read.csv("CitiGroup2006_2008")
val df = spark.read.option("header", true).option("inferSchema", true).csv("CitiGroup2006_2008")

println("--- List of column names ---")
df.columns

println("--- Head 5 of data ---")
df.head(5).foreach { println }

println("--- describe().show() ---")
df.describe().show()

println("--- select one column ---")
df.select("Volume").show()

println("--- select several columns ---")
df.select($"Open", $"Close").show()

println("--- create new column based on other ones ---")
val dfHighPlLow = df.withColumn("High+Low", df("High") + df("Low"))
dfHighPlLow.printSchema()

println("--- select with alisas for the column ---")
println("Analog for SQL: select High+Low as HPL, Close from  dfHighPlLow")
dfHighPlLow.select(dfHighPlLow("High+Low").as("HPL"), dfHighPlLow("Close"))