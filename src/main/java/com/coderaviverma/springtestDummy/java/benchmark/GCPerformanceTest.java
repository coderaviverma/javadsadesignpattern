//package com.coderaviverma.springtestDummy.java.benchmark;
//
//@BenchmarkMode(Mode.Throughput)
//@OutputTimeUnit(TimeUnit.MILLISECONDS)
//public class GCPerformanceTest {
//
//    private List<byte[]> memoryList;
//
//    @Setup
//    public void setup() {
//        memoryList = new ArrayList<>();
//    }
//
//    @Benchmark
//    public void allocateMemory() {
//        for (int i = 0; i < 100; i++) {
//            memoryList.add(new byte[1024 * 1024]); // 1MB objects
//        }
//        memoryList.clear(); // allow GC to clean up
//    }
//}
