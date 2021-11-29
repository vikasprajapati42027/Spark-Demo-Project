package helloworldfirst

import org.apache.spark.sql.SparkSession

object CreatingSparkWithSparkSession {
  def main(args:Array[String]): Unit = {
    val sparkSession = SparkSession.builder()
      .appName("Creating Spark Context With Spark Session")
      .master("local")
      .getOrCreate()

    val array = Array(1,2,3,4,5)

    val arrayRDD = sparkSession.sparkContext.parallelize(array,3)
    arrayRDD.foreach(println)
  }

}
