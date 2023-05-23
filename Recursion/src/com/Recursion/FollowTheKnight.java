package com.Recursion;

import java.util.Scanner;

public class FollowTheKnight {
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		System.out.println("Enter move in x direction");
		int x = fs.nextInt();
		System.out.println("Enter move in y direction");
		int y = fs.nextInt();
		System.out.println("Enter total move avilable");
		int n = fs.nextInt();

		System.out.println(knightMoves(x, y, n));
	}

	public static int knightMoves(int i, int j, int N) {
		boolean[][] visited = new boolean[10][10];
		dfs(i - 1, j - 1, N, visited);
		int count = 0;
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 10; y++) {
				if (visited[x][y]) {
					count++;
				}
			}
		}
		return count;
	}

	private static void dfs(int i, int j, int N, boolean[][] visited) {
		if (N == 0) {
			visited[i][j] = true;
			return;
		}
		int[][] moves = { { -2, -1 }, { -2, 1 }, { -1, -2 }, { -1, 2 }, { 1, -2 }, { 1, 2 }, { 2, -1 }, { 2, 1 } };
		for (int[] move : moves) {
			int x = i + move[0];
			int y = j + move[1];
			if (x >= 0 && x < 10 && y >= 0 && y < 10) {
				dfs(x, y, N - 1, visited);
			}
		}
	}
}
