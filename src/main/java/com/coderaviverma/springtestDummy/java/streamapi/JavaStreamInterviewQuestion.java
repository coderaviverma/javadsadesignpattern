package com.coderaviverma.springtestDummy.java.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamInterviewQuestion {

    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 11, 23);
        Optional<Integer> reduce = ls.stream().reduce((a, b) -> a + b);
        int sum = ls.stream().mapToInt(e -> e).sum();
        System.out.println("Sum of all number " + reduce.get());
        System.out.println("Sum of all number2 " + sum);

        //Average of all the numbers
        double asDouble = ls.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("Average of all Numbers - " + asDouble);

        //Square filter and average
        double asDouble1 = ls.stream().map(e -> e * e).filter(e -> e > 3).mapToInt(e -> e).average().getAsDouble();
        System.out.println(asDouble1);


        System.out.println("print number start with prefix 2 using stream");
        List<Integer> ls2 = Arrays.asList(11, 22, 33, 24, 45, 56, 76, 18, 29, 94, 102, 111, 23);
        List<String> collect = ls2.stream().map(String::valueOf).filter(e -> e.startsWith("2")).toList();
        System.out.println(collect);


        List<Integer> ls3 = Arrays.asList(11, 22, 33, 24, 45, 24, 76, 18, 29, 33, 22, 111, 22);

        System.out.println("Print duplicate number using stream");
        Set<Integer> list = ls3.stream().filter(e -> Collections.frequency(ls3, e) > 1).collect(Collectors.toSet());
        System.out.println(list);

        System.out.println("Find max and min number");
        Integer max = ls3.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("max------" + max);
        Integer min = ls3.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("min------" + min);


        System.out.println("Get/ignore first 5 numbers using Limit & Skip in Streams");
        List<Integer> list1 = ls3.stream().limit(5).skip(2).toList();
        System.out.println(list1);


        System.out.println("Reverse a list using stream");
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> reversed = IntStream.rangeClosed(1, input.size()).mapToObj(m -> input.get(input.size() - m)).toList();
        System.out.println(reversed);


        System.out.println("Write a stream pipeline to find duplicate elements in a list.");
        List<String> names = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        Set<String> duplicate = names.stream().filter(f -> Collections.frequency(names, f) > 1).collect(Collectors.toSet());
        System.out.println(duplicate);


        System.out.println("Group employees by department and count them.");
        //groupingBy and Count

        System.out.println("Can you short-circuit a stream operation?");

        boolean anyMatch = Stream.of(1, 2, -3, 4, 5).anyMatch(x -> x < 0);
        System.out.println("anyMatch "+anyMatch);

        Optional<Integer> first = Stream.of(1, 2, -3, 4, -5).filter(x -> x < 0).findFirst();
        if (first.isPresent()){
            System.out.println("find first negative numer "+ first.get());
        }else {

        }

        System.out.println("Reverse each string in a list using streams");
        List<String> inputreverse = Arrays.asList("abc", "123", "xyz");
        List<String> reverseString = inputreverse.stream().map(m -> new StringBuilder(m).reverse().toString()).toList();
        System.out.println(reverseString);


        System.out.println("Filter strings that contain only alphabets");
        List<String> inputAlpha = Arrays.asList("abc", "123", "xyz","as23");
        List<String> resAlpha = inputAlpha.stream().filter(s -> s.matches("[a-zA-Z]+")).toList();
        System.out.println(resAlpha);

        System.out.println("Find the longest string in a list");
        List<String> inputLongest = Arrays.asList("abcsaf", "123asdas", "xyzasfc","asfankacjs");
        Optional<String> max1 = inputLongest.stream().max(Comparator.comparing(String::length));
        System.out.println(max1.get());


        System.out.println();
        System.out.println("Count character frequency in a string using streams");
        String word = "banana";
        Map<Character, Long> collect1 = word.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);

        System.out.println("Remove duplicates and sort characters of a string");
        String inputDup = "cbacdcbc";
        String resultDup = inputDup.chars().distinct().sorted().mapToObj(String::valueOf).collect(Collectors.joining());
        System.out.println(resultDup);


        System.out.println("Find all palindromes in a list");
        List<String> inputpalind = Arrays.asList("abcdcba", "nitin", "xyzasfc","asfankacjs");
        List<String> resPalind = inputpalind.stream().filter(s -> s.equals(new StringBuilder(s).reverse().toString())).toList();
        System.out.println(resPalind);



    }
}
