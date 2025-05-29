package com.coderaviverma.springtestDummy.java.dsa.search;

public class RotatedBinarySearch {

    public static void main(String[] args) {

        int[] arr={5,6,7,8,9,1,2,3,4};
        int[] arr2={3,4,5,6,7,8,9,1,2};

        int pivot = findPivot(arr2);
        if (pivot==-1){

        }

    }

    static int binarySearch(int[] arr, int start,int end, int target){

      while (start<=end){
          int mid=start + (end-start)/2;



      }
      return -1;
    }

   static int findPivot(int[] arr){

        int start = 0;
        int end= arr.length-1;

        while (start<=end){

            int mid= start + (end-start)/2;

            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (start < mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]<= arr[start]){
                end=mid-1;
            }else {
                start=mid+1;
            }

        }

        return -1;
    }


}
