package com.fineconstant

import java.math.BigInteger


object Fibonacci {

    fun apply(n: Int): BigInteger = apply(n, BigInteger.ZERO, BigInteger.ONE)

    private tailrec fun apply(n: Int, nMinusTwo: BigInteger, nMinusOne: BigInteger): BigInteger =
        when (n) {
            0 -> nMinusTwo
            1 -> nMinusOne
            else -> apply(n - 1, nMinusOne, nMinusOne + nMinusTwo)
        }
}
