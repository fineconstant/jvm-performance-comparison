package com.fineconstant

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe

class FibonacciSpec : WordSpec({
    "it" should {
        "0 -> 0"{
            Fibonacci.apply(0).shouldBe(0.toBigInteger())
        }
        "1 -> 1"{
            Fibonacci.apply(1).shouldBe(1.toBigInteger())
        }
        "2 -> 1"{
            Fibonacci.apply(2).shouldBe(1.toBigInteger())
        }
        "3 -> 2"{
            Fibonacci.apply(3).shouldBe(2.toBigInteger())
        }
        "4 -> 3"{
            Fibonacci.apply(4).shouldBe(3.toBigInteger())
        }
        "5 -> 5"{
            Fibonacci.apply(5).shouldBe(5.toBigInteger())
        }
        "6 -> 8"{
            Fibonacci.apply(6).shouldBe(8.toBigInteger())
        }
        "19 -> 4181"{
            Fibonacci.apply(19).shouldBe(4181.toBigInteger())
        }
    }
})
