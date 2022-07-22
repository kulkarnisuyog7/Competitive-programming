
import java.util.*;
public class jolly {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			boolean check[] = new boolean[3001];
			int num[] = new int[n];
			boolean jolly = true;
			
			num[0] = sc.nextInt();
			for (int i = 1; i < n; i++) {
				num[i] = sc.nextInt();
				check[Math.abs(num[i] - num[i-1])] = true;
			}
			
			for (int i = 1; i < n; i++) {
				if (!check[i])
					jolly = false;
			}
			
			if (jolly)
				System.out.println("Jolly");
			else
				System.out.println("Not jolly");
		}
	}
}