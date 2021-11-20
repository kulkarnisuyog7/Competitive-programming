import java.util.*;
public class permutation{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String a=sc.nextLine();
			String b=sc.nextLine();
			String result="";
			int[] aC=new int[26];
			int[] bC=new int[26];

			for(int i=0;i<a.length();i++){
				aC[a.charAt(i)-'a']=+1;
			}		
			for(int j=0;j<b.length();j++){
				bC[b.charAt(j)-'a']=+1;
			}
			for(int k=0; k < 26; k++) {
				for(int m=0; m < aC[k] && m < bC[k]; m++) {
					result+=(char)(k+'a');
				}
			}
			System.out.println(result);
		}
	}
}