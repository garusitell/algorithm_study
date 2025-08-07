package five_tear;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem_29699 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int index = (N-1)%14;
		String[] target = "WelcomeToSMUPC".split("");
		System.out.println(target[index]);
	}
}
