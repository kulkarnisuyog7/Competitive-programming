import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    while(sc.hasNext()){
	        int n1=sc.nextInt();
	        int n2=sc.nextInt();
	        if(n1==0 && n2==0){
	            break;
	        }
	        int count=0,carry=0,sum;
	        while(n1!=0  || n2!=0){
	            sum=carry+n1%10+n2%10;
	            if(sum>=10){
	               count++;	  
	               }
	           carry=sum/10;
	           n1/=10;
	           n2/=10;
	        }
	        if(count==0){
	            System.out.println("No carry operation");
	        }
	        else if(count==1){
	            System.out.println("1 carry operation");
	        }
	        else{
	            System.out.println(count+" carry operations");
	        }
	        
	    }
	    
	}
}
