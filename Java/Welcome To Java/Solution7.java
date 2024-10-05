import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int a=0,b=0,n=1;
        if(q>=0 && q<=500){
            for(int i=0; i<q; i++){
                a = sc.nextInt();
                b = sc.nextInt();
                n = sc.nextInt();
            
                if(n>=1 && n<=15){
                    int res1 = (int)Math.pow(2, 0);
                    int res2 = (int)a+res1*b;
                    int sum = res2;
                    System.out.print(res2+" ");
                    for(int j=1; j<n; j++){
                        int res3 = (int)Math.pow(2, j);
                        sum = sum + (res3*b);
                        System.out.print(sum+" ");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}
