import java.util.*;
public class hartals{
    public static int check(int days,int parties,int[] hartals){
    int daylost=0;
    for(int i=1;i<=days;i++){
    if(i%7==6 || i%7==0)continue;{
        for(int j=0;j<parties;j++){
            if(i%hartals[j]==0){
                daylost++;
                break;
            }
        }
    }
}
return daylost;
}
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
int testcase = sc.nextInt();
for(int i=0;i<testcase;i++){
int days=sc.nextInt();
int parties=sc.nextInt();
int hartals[]=new int [parties];
for(int j=0;j<parties;j++){
hartals[j]=sc.nextInt();
}
System.out.println(check(days,parties,hartals));
}
}
}