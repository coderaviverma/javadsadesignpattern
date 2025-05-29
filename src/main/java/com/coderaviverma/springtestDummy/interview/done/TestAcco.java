package com.coderaviverma.springtestDummy.interview.done;

public class TestAcco {

    public static void main(String[] args) {
        int a = 50221;

        int[] res = new int[10];
        while (a > 0) {
            int rem = a % 10;
            res[rem]++;
            a = a / 10;
        }
        //[1,1,2,0,0,1]
        int result = 0;
        for (int i = 0; i < res.length; i++) {
            while (res[i] > 0) {
                result = (result*10) + i;//10
                res[i]--;
            }
        }
        System.out.println(result);
    }
    //DB
    //Pagination
    //




    //l1,l2,l3 - 4core
    //a++
    //volatie
    //32 pro 64  break
    //
//    LRU Cache
    //get - O(1)
    //put - O(1)
    //remove O(1)
    //head tail
//    Map<val,Node>
    // top 5
    //
    //head.next Node


}
