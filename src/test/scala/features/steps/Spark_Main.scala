package features.steps

import org.apache.spark.sql.SparkSession

import org.apache.log4j.{Level,LogManager}

//Spark Utils
object Spark_Main {

  def getSession(): Unit =
  {
   SparkSession.builder().getOrCreate()
  }

  def apply(appName: String, master: String)= {
  System.setProperty("current.date", System.currentTimeMillis.toString)
    LogManager.getRootLogger.setLevel(Level.INFO)
    val spark=SparkSession.builder.master(master).appName(appName).getOrCreate()
    spark.conf.set("spark.eventLog.enabled", "true")
    spark.conf.set("spark.sql.shuffle.partitions","10")
    spark.conf.set("spark.sql.session.timeZone", "UTC")
    spark
  }
}
