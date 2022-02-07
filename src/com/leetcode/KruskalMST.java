package com.leetcode;

import java.util.Arrays;

public class KruskalMST {

	public static void main(String[] args) {

		new KruskalMST().findMST();
	}

	void findMST() {
		int node = 7;
		int[][] edges = new int[][] { { 1, 1, 2, 2, 3, 4, 4, 5, 5 }, { 2, 6, 3, 7, 4, 5, 7, 6, 7 },
				{ 25, 5, 12, 10, 8, 16, 14, 20, 18 } };

		int edgesLength = edges.length;

		//set for all the nodes
		int[] set = new int[node + 1];
		Arrays.fill(set, -1);

		//total edges that we have, shows that an edge is included
		int[] included = new int[node + 1];
		Arrays.fill(included, 0);

		// edges in minimum spanning tree are number of nodes-1
		int[][] edgesInc = new int[2][node - 1];

		int edgesFilled = 0;
		while (edgesFilled < node) {
			int minCostIndex = findMinimumEdge(included,edges);
			
			//int edgesFilled = 0;

			int u = edges[0][minCostIndex];
			int v = edges[1][minCostIndex];

			if (findIfSameParent(set, u, v)) {
				// same parent, adding this edge will cause a cycle
			} else {
				union(set, u, v);
				included[u] = 1;
				edgesInc[0][edgesFilled] = u;
				edgesInc[1][edgesFilled] = v;
				edgesFilled++;
			}
		}
	}

	private void union(int[] set, int u, int v) {
		if (set[u] < set[v]) {
			set[u] = set[u] + set[v];
			set[v] = u;
		} else {
			set[v] = set[u] + set[v];
			set[u] = v;
		}
	}

	// find operation
	private boolean findIfSameParent(int[] set, int u, int v) {
		while (set[u] > 0 || set[v] > 0) {
			if (set[u] > 0) {
				u = set[u];
			}
			if (set[v] > 0) {
				v = set[v];
			}
		}
		if (set[u] != -1 || set[v] != -1) {
			return set[u] == set[v];
		} else {
			return false;
		}

	}

	int findMinimumEdge(int[] included, int[][] edges) {
		int minimumIndex = 0;

		int[] cost=edges[2];
		int length = cost.length;
		
		for (int index = 0; index < length; index++) {
			if (included[edges[0][index]]==0&&cost[minimumIndex] > cost[index]) {
				minimumIndex = index;
			}
		}
		return minimumIndex;
	}

}
