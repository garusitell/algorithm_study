package five_tear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem_28417 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int highScore = 0;

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int run1 = Integer.parseInt(st.nextToken());
			int run2 = Integer.parseInt(st.nextToken());
			int maxRunScore = Math.max(run1, run2);

			int[] trickScores = new int[5];
			for (int j = 0; j < 5; j++) {
				trickScores[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(trickScores);

			int topTwoTrickScore = trickScores[4] + trickScores[3];
			int currentScore = maxRunScore + topTwoTrickScore;

			if (currentScore > highScore) {
				highScore = currentScore;
			}
		}

		System.out.println(highScore);
	}
}