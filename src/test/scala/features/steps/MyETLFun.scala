package features.steps

import org.apache.spark.internal.Logging

object MyETLFun extends App with Logging{


  def take_count()={
    val spark= Spark_Main(getClass.toGenericString, "local[*]")

    val file_path="/Users/naval/Documents/Spark-Scala/TestData.txt"
    val file_delimiter=","
    val read_file= spark.read.format("csv").option("multiline", true).option("delimiter",file_delimiter).option("header", true).load(file_path)
    val file_count=read_file.count()
    println("File count is "+ file_count)
  }



}
