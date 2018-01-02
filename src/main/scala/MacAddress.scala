object MacAddress {
  val numberOfHexChars = 12

  case class MacAddress(hex: String) {
    require(hex.matches(s"[a-fA-F0-9]{$numberOfHexChars}"))
  }

  def unapply(raw: String): Option[MacAddress] = Some(MacAddress(sanitizeHex(raw)))

  def sanitizeHex(rawHex: String): String = {
    require(rawHex.length <= 64)
    val regex ="[^a-fA-F0-9]{1,64}"

    val parts = rawHex.split(regex)
    println(parts)
    val res = parts.length match {
      case 1 => "012%x".format(parts(0))
      case 2 => "06%x".format(parts(0))+"06%x".format(parts(1))
      case 3 => "04%x".format(parts(0))+"04%x".format(parts(1))+"04%x".format(parts(2))
      case 4 => "03%x".format(parts(0))+"03%x".format(parts(1))+"03%x".format(parts(2))+"03%x".format(parts(3))
      case 6 => "02%x".format(parts(0))+"02%x".format(parts(1))+"02%x".format(parts(2))+"02%x".format(parts(3))+"02%x".format(parts(4))+"02%x".format(parts(5))
      case _ => "ERROR LOLS"
    }
    res
  }
}
