//https://codeforces.com/contest/2085/problem/C


import java.util.Scanner;

public class Main{
     
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int t = input.nextInt();
      while(t>0){
        int x=input.nextInt();
        int y=input.nextInt();
        
        long k;
        if((x&y) == 0) k=0;
        else if(x==y) k=-1;
        else{
            int bigger=Math.max(x,y);

            long a = Integer.highestOneBit(bigger)<<1;
             k=a-bigger;
        }
       
        System.out.println(k);

        

        t--;
      }

      input.close();

    }
}
