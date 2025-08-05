package five_tear;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_27294 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		StringTokenizer st1 = new StringTokenizer(input);
		int time = Integer.parseInt(st1.nextToken());
		int beer = Integer.parseInt(st1.nextToken());

		if (time <= 11){
			System.out.println("280");
		} else if (time >= 12 && time <= 16 && beer == 1){
			System.out.println("280");
		} else if (time >= 12 && time <= 16 && beer == 0){
			System.out.println("320");
		}else{
			System.out.println("280");
		}

	}
}
