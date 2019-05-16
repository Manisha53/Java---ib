/*
Wave Array
Asked in:  
Google
Adobe
Given an array of integers, sort the array into a wave like array and return it, 
In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....

Example

Given [1, 2, 3, 4]

One possible answer : [2, 1, 4, 3]
Another possible answer : [4, 1, 3, 2]
 NOTE : If there are multiple answers possible, return the one thats lexicographically smallest. 
So, in example case, you will return [2, 1,4,3]
*/

import java.util.Collections;

public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
       // ArrayList<Integer> res = new ArrayList<Integer>();
        int n= A.size();
        int temp;
        Collections.sort(A);
        for(int i=0;i<n-1;i+=2){
            if(A.get(i)<=A.get(i+1)){
                temp=A.get(i);
                A.set(i,A.get(i+1));
                A.set(i+1,temp);
            }
            
            }
            return A;
        }
    }
