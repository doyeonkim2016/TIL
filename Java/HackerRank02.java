import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");

    }
}



Q2.
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        
        
        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for(int i = 1 ; i <= 10; i++){
            System.out.println(N+" x "+ i+" = "+(N*i) );
        }
        
        
        scanner.close();
    }
}

Q3.
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c=a;    
            for(int j=0;j<n;j++){
                c += Math.pow(2, j)*b;
                System.out.printf("%s ",c);
            }
            System.out.println();
        }
        
        
        in.close();
    }
}


Q4.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        for(int i = 1; scan.hasNext()== true; i++){
            System.out.println(i + " " + scan.nextLine());
        }
        
    }
}

Q5.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

//Write your code here

static Scanner input = new Scanner(System.in);
static boolean flag = true;
static int B = input.nextInt();
static int H = input.nextInt();

static{
    try{
        if(B <= 0 || H <= 0){
            flag = false;
            throw new Exception("Breadth and height must be positive");
        }
    }catch(Exception e){
        System.out.println(e);
    }

}
  

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class


