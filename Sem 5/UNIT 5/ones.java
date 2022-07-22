import java.util.*;
public class ones
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
		    int ones=1;
		    int xyz=1;
		    int number=sc.nextInt();
		    while(xyz!=0){
		        if(number>xyz){
		            ones++;
		    }
		    xyz=number>xyz?xyz*10+1:xyz%number;
		}
		System.out.println(ones);
	}
}
}
