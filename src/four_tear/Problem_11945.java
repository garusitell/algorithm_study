package four_tear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_11945 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
			String line = br.readLine();

			StringBuilder reversed = new StringBuilder(line);
			reversed.reverse();

			System.out.println(reversed);

		}
	}
}

