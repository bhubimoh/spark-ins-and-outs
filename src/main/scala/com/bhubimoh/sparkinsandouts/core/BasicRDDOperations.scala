package com.bhubimoh.sparkinsandouts.core

import org.apache.spark.sql.SparkSession

object BasicRDDOperations {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local[1]").getOrCreate()
    val dataSeq = Seq((100, "Bibhuti"), (101, "Plaban"), (102, "Soumya"))
    val dataRdd = spark.sparkContext.parallelize(dataSeq)
    dataRdd.collect().foreach(println)
  }
}
