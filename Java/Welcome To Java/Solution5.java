import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.printf("================================\n");
        for(int i=0; i<3; i++){
        String var1 = sc.next();
        int var2 = sc.nextShort();
        System.out.printf("%-15s%03d%n",var1,var2);   
        }
        System.out.printf("================================");
        sc.close();
    }
}
