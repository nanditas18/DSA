/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/check-if-given-four-points-form-a-square3026/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	boolean isSquare(int points[][]) {
		int n1 = getDistance(points[0], points[1]);
		int n2 = getDistance(points[0], points[2]);
		int n3 = getDistance(points[2], points[3]);
		int n4 = getDistance(points[3], points[1]);
		int n5 = getDistance(points[0], points[3]);
		int n6 = getDistance(points[1], points[2]);
		int[] distance = {n1, n2, n3, n4, n5, n6};
		Arrays.sort(distance);
		return distance[0] != 0 && distance[0] == distance[1]
		 && distance[1] == distance[2]
		 && distance[2] == distance[3]
		 && distance[4] == distance[5]
		 && distance[0] < distance[4];
	}
	
	int getDistance(int[] point1, int[] point2) {
		int x = point1[0] - point2[0];
		int y = point1[1] - point2[1];
		return x*x + y*y;
	}
};

