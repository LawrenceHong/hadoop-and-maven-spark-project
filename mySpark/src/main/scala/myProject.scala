import org.apache.spark.{SparkConf, SparkContext}
/**
  * Created by hongleyou on 2017/4/21.
  */
object myProject {
  def main(args: Array[String]): Unit = {
    val N = 5;
    val conf = new SparkConf().setMaster("local").setAppName("GetIP")
    val sc = new SparkContext(conf)
    val temp = sc.textFile("input/access.log").flatMap(line=>line.split("\\n")).map(s => s.split("- -")(0))
        .map((_, 1)).reduceByKey(_ + _).filter(s => s._2 > N)


    temp.saveAsTextFile("output/Ip.txt")
    sc.stop()
  }
}
