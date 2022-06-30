package tech.qihaizhi.leetcode;

public class MinStackWithOrderedSupportStack {

    private final int[] dataStack;
    private final int[] minStack;
    private int dataTopIndex;
    private int minTopIndex;

    public MinStackWithOrderedSupportStack() {
        int MAX_DEPTH_OF_STACK = 10000;
        dataStack = new int[MAX_DEPTH_OF_STACK];
        dataTopIndex = -1;
        minStack = new int[MAX_DEPTH_OF_STACK];
        minTopIndex = -1;
    }

    public void push(int val) {
        dataTopIndex++;
        minTopIndex++;
        dataStack[dataTopIndex] = val;
        pushDataIntoMinStackAndSort(val);
    }

    private void pushDataIntoMinStackAndSort(int val) {
        minStack[minTopIndex] = val;
        for(int i=minTopIndex;i>=0;i--){
            if(i<1){
                return;
            }
            if(minStack[i]> minStack[i-1]){
                int temp = minStack[i];
                minStack[i] = minStack[i-1];
                minStack[i-1] = temp;
            }
        }
    }

    public void pop() {
        sortMinStackOnPop();
        if(minTopIndex>-1){
            minTopIndex--;
        }
        if(dataTopIndex >-1){
            dataTopIndex--;
        }
    }

    private void sortMinStackOnPop() {
        int topValue = top();
        for(int i=0;i<=minTopIndex;i++){
            if(minStack[i]<topValue){
                int temp = minStack[i-1];
                minStack[i-1] = minStack[i];
                minStack[i] = temp;
            }
        }
    }

    public int top() {
        return dataStack[dataTopIndex];
    }

    public int min() {
        return minStack[minTopIndex];
    }

}
