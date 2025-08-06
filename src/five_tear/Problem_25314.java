package five_tear;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem_25314 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String target = "";
		int N = Integer.parseInt(br.readLine());

		int Number = N/4;

		for(int i = 0; i < Number; i++){
			target = target + "long ";
		}
		System.out.println(target + "int");
	}
}
