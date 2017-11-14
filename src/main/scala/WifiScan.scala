//wifiscan init

import sys.process._

object WifiScan extends App {
  val scanCmd = "/System/Library/PrivateFrameworks/Apple80211.framework/Versions/A/Resources/airport -s"
  case class SsidProbe(ssid: String, bssid: String, strengthDb: Int, channelBase: Int, channelExtend: String)

  val scanResult = WifiScan.scanCmd.!!
  println(scanResult)
}
