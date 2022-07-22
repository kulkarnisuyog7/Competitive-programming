import java.io.*;
import java.util.*;
public class np3{
	public static long ans(long n){
		long count=1;
		while(n!=1){
			if(n%2==0){
				n=n/2;
			}
			else{
				n=3*n+1;
			}
			count++;
		}
		return count;
	}
	public static void main(String[] args)  {
	long i,j,n,count=0;
	Scanner sc=new Scanner(System.in);
	i=sc.nextInt();
	j=sc.nextInt();
	for(n=Math.min(i,j);n<=Math.max(i,j);n++){
		count=Math.max(ans(n),count);
	}
	System.out.print(i+" "+j+" "+count);
	}	
}