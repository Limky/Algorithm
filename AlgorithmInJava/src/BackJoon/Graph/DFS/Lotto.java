package BackJoon.Graph.DFS;

import java.util.Scanner;

public class Lotto {
	static int[] array;
	static StringBuilder sb = new StringBuilder();
	static int k;
	static int cnt;

	private void solve() {
		Scanner sc = new Scanner(System.in);
		
		while ((k = sc.nextInt()) != 0) {
			array = new int[13];
			
			for (int i = 0; i < k; i++) {
				array[i] = sc.nextInt();
			}

			for (int i = 0; i < k; i++) {
				cnt = 1;
				dfs(i, array[i] + " ");
			}
			
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

	public static void dfs(int v, String str) {
		if (cnt == 6) {
			System.out.println("d");
			sb.append(str + "\n");
		} else {
			for (int i = v + 1; i < k; i++) {
				++cnt;
				dfs(i, str + array[i] + " ");
			}
		}
		--cnt;
	}

	public static void main(String[] args) {

		new Lotto().solve();
	}

}
