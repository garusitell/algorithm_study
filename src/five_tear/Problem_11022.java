package five_tear;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_11022 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);

		int times = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= times; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st2.nextToken());
			int y = Integer.parseInt(st2.nextToken());

			System.out.println("Case #" + i + ": " + x + " + " + y + " = " + (x+y));
		}
	}
}
