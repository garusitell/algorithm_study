package five_tear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_27866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String target = br.readLine();
		int targetNum = Integer.parseInt(br.readLine());

		String[] targetArr = target.split("");
		System.out.println(targetArr[targetNum-1]);
	}
}
