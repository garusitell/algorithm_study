package five_tear;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem_2386 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = br.readLine();

			if(line.equals("#")){
				break;
			}
			char targetChar = line.charAt(0);
			String sentence = line.substring(2);
			int count = 0;
			char lowerTarget = Character.toLowerCase(targetChar);

			for(char ch : sentence.toCharArray()){
				if(Character.toLowerCase(ch) == lowerTarget){
					count++;
				}
			}
			System.out.println(targetChar + " " + count);
		}
	}
}