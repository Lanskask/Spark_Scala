// fourWorkWithMissingData.scala
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()
// val df = spark.read.csv("CitiGroup2006_2008")
val df = spark.read.option("header", true).option("inferSchema", true).csv("ContainsNull.csv")
import spark.implicits._

df.show()
df.na.drop().show()
df.na.drop(1).show()
// убирает ряды, где 1 или больше не нулевых элементов
// оставляет как минимум 1 пустой
df.na.drop(2).show()
// оставляет как минимум 2 пустых
df.na.drop(3).show()

df.na.fill(100).show()
df.na.fill("Miss Name").show()
df.na.fill("Miss Name",100).show() // error
df.na.fill("Miss Name", Array("Name")).show()
df.na.fill(200, Array("Sales")).show()

println("--- Fill withavg value ---")
df.describe().show
df.describe().mean // error
df.na.fill(df.describe().mean, Array("Sales")).show() // error

val df2 = df.na.fill(405.0, Array("Sales"))
df2.na.fill("Miss Name", Array("Name")).show() 