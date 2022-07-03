package tech.qihaizhi.leetcode;

public class Solution {
    public int nextGreaterElement(int n) {
        char[] nextGreaterArr = String.valueOf(n).toCharArray();
        int i = nextGreaterArr.length - 2;
        while(i>=0 && nextGreaterArr[i] >= nextGreaterArr[i+1]) {
            i--;
        }
        if(i<0){
            return -1;
        }
        int j = nextGreaterArr.length - 1;
        while (j>=0 && nextGreaterArr[i] >= nextGreaterArr[j] ){
            j--;
        }
        swap(nextGreaterArr, i, j);
        reverse(nextGreaterArr, i+1);
        long nextGreaterLong = Long.parseLong(new String(nextGreaterArr));
        if(nextGreaterLong > Integer.MAX_VALUE){
            return -1;
        }else{
            return (int)nextGreaterLong;
        }
    }

    private void reverse(char[] arr, int begin){
        int i = begin;
        int j = arr.length -1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    private void swap(char[] arr, int i, int j) {
        char tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}
