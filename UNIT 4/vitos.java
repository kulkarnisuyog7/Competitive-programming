import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int i=0;i<testcase;i++){
		    int size=sc.nextInt();
		    int[] values=new int[size];
		    for(int j=0;j<size;j++){
		        values[j]=sc.nextInt();
		    }
		    Arrays.sort(values);
		    int mindiff=Integer.MAX_VALUE;
		    for(int j1=0;j1<size;j1++){
		        int diff=0;
		        for(int j2=0;j2<size;j2++){
		            diff=diff+Math.abs(values[j2]-values[j1]);
		        }
		        mindiff=Math.min(mindiff,diff);
		    }
		    System.out.print(mindiff);
		}
	}
}
S
