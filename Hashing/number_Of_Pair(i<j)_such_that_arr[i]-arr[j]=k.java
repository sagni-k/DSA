import java.util.HashMap;

import java.util.Map;
public class Main{
    public static void main(String[] args) {
        int[] arr={1,5,3,4,2};
        int k=2;

        System.out.println(Solution.countPairs(arr, k));
    }
}

class Solution{
    public static int countPairs(int[] arr,int k){
        int pairs=0;
        Map<Integer,Integer> map = new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]+k)){
                pairs+=map.get(arr[i]+k);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        return pairs;
    }
}
