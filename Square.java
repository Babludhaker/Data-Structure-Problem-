import java.util.*;

public class Square {
	public static boolean  Armstrong(int x){
       int n = x;
	   int count = 0;

	   while(n>0){
		     count++;
		   n = n/10;
		 
	   }
       System.out.println(count);
	   int sum = 0;
	   while(n>0){
		   int rem = n%10;
		   sum += (int)(Math.pow(rem, count));
	   }

	   if(sum==x){
		   return true;
	   } else{
		   return false;
	   }
	}
   public static void clc(int x) {
	for(int i=2; i<x; i++){
		System.out.println(i+"="+i*i);

	}
   }
    
		
	5
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
       // ArrayList al = new ArrayList<>();
      //  al.ad
		int x = sc.nextInt();
		// System.out.println(Armstrong(x));
		clc(x);
		
	}
}
