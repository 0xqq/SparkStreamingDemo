package cn.itcast.spark.streaming.demo1

import org.apache.log4j.{Level, Logger}
import org.apache.spark.Logging

/**
  * @author y15079
  * @create 2018-03-12 0:10
  * @desc
  **/
object LoggerLevels extends Logging{
  def setStreamingLogLevels(): Unit ={
    val log4jInitialized = Logger.getRootLogger.getAllAppenders.hasMoreElements
    if (!log4jInitialized){
      logInfo("Setting log level to [WARN] for streaming example." + " To override add a custom log4j.properties to the classpath.")
      Logger.getRootLogger.setLevel(Level.WARN)
    }
  }
}
