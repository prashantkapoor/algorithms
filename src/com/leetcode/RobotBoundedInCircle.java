package com.leetcode;
//1041. Robot Bounded In Circle
import java.util.Arrays;

public class RobotBoundedInCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new RobotBoundedInCircle().isRobotBounded("GLGLGGLGL");
	}

	public boolean isRobotBounded(String instructions) {
		int x = 0, y = 0;
		// 0-north,1-right,2-south,3-left
		int dir = 0;

		for (char step : instructions.toCharArray()) {
			if (step == 'L') {
				dir = (dir + 3) % 4;
			} else if (step == 'R') {
				dir = (dir + 1) % 4;
			}
			if (step == 'G') {
				if (dir == 0) {
					y += 1;
				}
				if (dir == 1) {
					x += 1;
				}
				if (dir == 2) {
					y -= 1;
				}
				if (dir == 3) {
					x -= 1;
				}
			}
		}

		if ((x == 0 && y == 0) || dir != 0) {
			return true;
		} else {
			return false;
		}
	}
}
