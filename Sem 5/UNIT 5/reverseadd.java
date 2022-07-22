import java.util.*;

public class reverseadd {
  public static long reverse(long num){
    long reverse=0;
    while(num>0){
      reverse=reverse*10+num%10;
      num/=10;
    }
    return reverse;
  }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int testcase=sc.nextInt();
       for(int i=0;i<testcase;i++){
         int count=0;
         long num=sc.nextLong();
         long reversed=reverse(num);
         while(num!=reversed){
           num+=reversed;
           reversed=reverse(num);
           count++;
         }
         System.out.println(count+" " +num);
       }
    }
}
