//wifiscan init

import sys.process._
//import kantan.csv._
//import kantan.csv.ops._

object WifiScan extends App {
  val scanCmd = "/System/Library/PrivateFrameworks/Apple80211.framework/Versions/A/Resources/airport -s"

  case class MacAddress(hex: String) {
    require(hex.matches("[a-fA-F0-9]{12}"))
  }
  case class SsidProbe(ssid: String, bssid: MacAddress, strengthDb: Int, channelBase: Int, channelExtend: String)

  val scanResult = WifiScan.scanCmd.!!
  //println(scanResult)
  val lines = scanResult.split("\n")
  val someScan = lines(2).split(" +") //split multi whitespace
  println(someScan.mkString(" | "))

  val rawDataSrc: java.net.URL = getClass.getResource("/scan_pyramiden.txt")
  val dataFromFile = scala.io.Source.fromURL(rawDataSrc).mkString

}