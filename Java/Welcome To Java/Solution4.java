import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int var1 = input.nextInt();
        double var2 = input.nextDouble();
        input.nextLine();
        String var3 = input.nextLine();
        
        System.out.println("String: "+var3);
        System.out.println("Double: "+var2);
        System.out.println("Int: "+var1);
    }
}
