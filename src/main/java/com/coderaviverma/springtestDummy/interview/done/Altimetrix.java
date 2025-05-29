package com.coderaviverma.springtestDummy.interview.done;

import java.util.*;
import java.util.stream.Collectors;

public class Altimetrix {

    public static void main(String[] args) {

        List<Integer> ls=new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(6);
        ls.add(7);

        List<Integer> l2= Arrays.asList(1,2,3,4,6,7);
//        l2.add(10);
//        System.out.println(ls);
        System.out.println(l2);


        //Collection of integer
        //1,2,3,4,6,7
        //3,4,6,7,1,2
        //O(n)
        //O(1)
        //k
//        int[]

        LinkedList<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(6);
        queue.add(7);
        queue.add(8);

        int k = 2;
        for(int i=0;i< k;i++){
//           Integer val=queue.removeFirst();
//           queue.addLast(val);

            Integer remove = ls.remove(i);
            ls.add(remove);
        }
        System.out.println(queue);


        //Collection String
        List<String> str=new ArrayList<>();
        str.add("Ram");
        str.add("Sham");
        str.add(null);
        str.add(null);
        str.add("Gopal");
        str.add(null);

//        List<String> collect = str.stream().sorted(Comparator.comparing(s -> {
//            if (s == null) {
//                return -1;
//            }else {
//            }
//        })).collect(Collectors.toList());

        Collections.sort(str,Comparator.comparing(s->{
            if (s==null) return -1;
            return 1;
        }));
        System.out.println(str);

        //Spring boot
        //startup
            //config
            //DB - connection
            //Kafka - connection
            //redis - connect
        //devtool


        //2 DB 1 service
        //  1DB 1S -> Kafka.stream -> 1S -> DB2
        //  1DB 1S -> DB2
        //

//        for(int i=0;i<10;){
//            System.out.println();
//        }

    }
}
