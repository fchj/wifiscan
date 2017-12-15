class MacAddressSpec {
  //full hex
  val plainMac = "0123456789ab"
  val plain5DashMac = "ab-cd-ef-12-34-56"
  val plain5ColonMac = "a1:b2:c3:d4:e5:f6"
  val plain5DotMac = "a1.b2.c3.d4.e5.f6"

  val plain2DashMac = "abcd-1234-0ae9"
  val plain2ColonMac = "0bcd:1234:0ae9"
  val plain2DotMac = "0bcd.1234.0ae9"

  val plain1DashMac = "abcd12-340ae9"
  val plain1ColonMac = "0bcd12:340ae9"
  val plain1DotMac = "0bcd12.340ae9"


  val plain5NonsuchMac ="ab|cd<ef>12_34!56"
  val plain2NonsuchMac ="abcd<ef12_3456"
  val plain1NonsuchMac ="abcdef_123456"

  //leading zeros removed
  val shortMac = "123456789a" //leading zeros
  val short5DashMac = "ab-d-ef-12-34-6"
  val short5ColonMac = "1:b2:c3:d4:e5:f6"

  val short2DashMac = "abcd-1234-e9"
  val short2ColonMac = "abcd:134:0ae9"

  val short5NonsuchMac ="ab|d<ef>12_34!56"
  val short2NonsuchMac ="bcd<ef12_345"

}
