//wifiscan init

import sys.process._

object WifiScan {
  val scanCmd = "/System/Library/PrivateFrameworks/Apple80211.framework/Versions/A/Resources/airport -s"
  case class SsidProbe(ssid: String, bssid: String, strengthDb: Int, channelBase: Int, channelExtend: String)
}

class WifiScan {
  val scanResult = WifiScan.scanCmd.!!
  println(scanResult)
}