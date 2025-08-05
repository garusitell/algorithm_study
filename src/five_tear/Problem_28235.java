package five_tear;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_28235 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		String sb =  st.nextToken();

		if(sb.equals("SONGDO")){
			System.out.println("HIGHSCHOOL");
		}else if(sb.equals("CODE")){
			System.out.println("MASTER");
		}else if(sb.equals("2023")){
			System.out.println("0611");
		}else {
			System.out.println("CONTEST");
		}
	}
}
