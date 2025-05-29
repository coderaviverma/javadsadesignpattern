package com.coderaviverma.springtestDummy.interview.done;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class AeriesTest {

    public static void main(String[] args) {
        //int array
        int[] arr = {7, 3, 5, 4, 9, 5, 7, 1, 2}; //
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
            if (hm.get(arr[i]) > 1) {
                System.out.println("Number " + arr[i] + " - count " + hm.get(arr[i]));
            }
        }
        Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect(groupingBy(n -> n, counting()));

//        Arrays.stream(arr).parallel()

        //
        //big file 2 gb
        //process
        //words those repeating
        //100MB -
        //multi  - prallel
        //


        //vechile
            //- start
            //-
        //car
            // - engine
        //bicycle
            // throw

        //Singleton
        //Factory - Abstract

        // - ocrstrator -> payment
        // - Flight + Cab + hotel
        // - paypal ,stripe, jio money

        //Order -> cart -> payment ->

        //caavenue - charging - 5000 - fix
        //rayzorpay - charging - 1.1%

        //Third party - order - trasaction - amount
        // transaction - success - pending - failed
        // kafka -> inventory service -> vendor ->

        //Employee
            //id    name    managerid
            //1     jam     null
            //2     wenky    1
            //3     abc      1
            //4     pqr      2
            //5     xyz      4

        // select * employee e w > ( manger  m ) e.id != m.id;

    }
}
