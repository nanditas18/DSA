/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/check-if-a-number-is-divisible-by-83957/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
	public boolean isDivBy8(String s) {
		if (s.length()<3)
			{
			int h = Integer.parseInt(s);
			if (h%8 == 0)
				{
				return true;
			}
		}
		else {
			int sum = 0;
			int digit = 0;
			for (int i = s.length() - 3; i<s.length(); i++)
				{
				char ch = s.charAt(i);
				int h = Integer.parseInt(String.valueOf(ch));
				digit = digit*10 + h;
				
			}
			if (digit%8 == 0)
				{
				return true;
			}
		}
		return false;
	}
}

