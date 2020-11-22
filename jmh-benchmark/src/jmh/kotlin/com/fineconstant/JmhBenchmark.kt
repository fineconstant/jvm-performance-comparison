package com.fineconstant

import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.infra.Blackhole
import java.util.concurrent.TimeUnit


@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.SECONDS)
@State(Scope.Benchmark)
@Warmup(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 20, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(10)
@Threads(1)
open class JmhBenchmark {
    private val fibonacciN = 25

    @org.openjdk.jmh.annotations.Benchmark
    fun fibonacciTailrec(bh: Blackhole) {
        bh.consume(Fibonacci.apply(fibonacciN))
    }
}
