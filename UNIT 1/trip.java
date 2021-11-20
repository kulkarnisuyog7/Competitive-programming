import java.util.*;
public class trip{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	while(true){
		int i,n;
		n=sc.nextInt();
		if(n==0){
			break;
		}
		double total=0;
		double student_spent[]=new double[10];
		for(i=0;i<n;i++){
			student_spent[i]=sc.nextDouble();
			total+=student_spent[i];// Calculate Total Sum
		}
		double avg=total/n;
		double t_high=0;
		double t_low=0;
		//calculate avg paid by students
		for(i=0;i<n;i++){
			double diff=student_spent[i]-avg;//calculate diff of each student from avg 
			if(diff>=0){
				t_high+=Math.floor(diff*100)/100;
			}
			else{
				t_low-=Math.ceil(diff*100)/100;
			}
		}
		System.out.println("$"+Math.max(t_low,t_high));
		}	
	}
}