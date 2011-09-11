package com.sample

object Gcd{
    def gcd(a:Int, b:Int):Int = if (b==0) a else gcd(b, a%b)
}


import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers


class GcdTests extends FlatSpec with ShouldMatchers{
    "GCD of 1440, 408" should  "be 24" in {
        Gcd.gcd(1440, 408) should equal (24)
    }
}