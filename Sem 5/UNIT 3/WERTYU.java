import java.util.*;
public class WERTYU{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s,keyboard;
		int len;
		keyboard="`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		while(sc.hasNext()){
			s=sc.nextLine();
			len=s.length();
			for(int i=0;i<len;i++){
				if(s.charAt(i)==' ')
					System.out.print(" ");
				else
					System.out.print(keyboard.charAt(keyboard.indexOf(s.charAt(i))-1));
			}
			System.out.println();
		}

	}
}