import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class StringBuffer {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();


		StringTokenizer st = new StringTokenizer(input);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(a+b +"\n");  //"\n" 추가
		bw.flush();
		bw.close();
	}

}
