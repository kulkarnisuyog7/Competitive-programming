import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) {
	while(true){
	long  f1=0,f2=1,count=0;
	long  f3;
    Scanner sc=new Scanner(System.in);
    long  start=sc.nextLong();
    long end=sc.nextLong();
    if(start>0 && end>0){
    while(true){
        if(f1>end){
            break;
        }
        if(f1>start && f1<end ){
            count++;
        }
        f3=f2+f1;
        f1=f2;
        f2=f3;
    }
    System.out.println(count);
	}
	else{
	break;
	}
	}
	}
}

