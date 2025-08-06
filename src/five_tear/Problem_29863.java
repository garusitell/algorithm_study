package five_tear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_29863 	{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		if(b - a < 0){
			System.out.println((24-a)+b);
		}else{
			System.out.println(b-a);
		}
	}
}
