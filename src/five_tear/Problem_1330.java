package five_tear;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_1330 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		StringTokenizer st = new StringTokenizer(input);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());



		if (a > b){
			System.out.println(">");
		}else if (a < b){
			System.out.println("<");
		}
		else{
			System.out.println("==");
		}
	}
}
