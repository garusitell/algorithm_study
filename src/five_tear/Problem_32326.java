package five_tear;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem_32326{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int red = Integer.parseInt(br.readLine());
		int green = Integer.parseInt(br.readLine());
		int blue = Integer.parseInt(br.readLine());

		System.out.println((red*3) + (green*4) + (blue*5));


	}
}
