package leetcode.easy;

public class NumberTheory {

	public int findLCM(int x, int y) {
		return (x * y) / findGCD(x, y);
	}

	public int findGCD(int x, int y) {
		if(x==0||y==0)
			return 0;
		if (x == y)
			return x;
		if (x > y) {
			findGCD(x - y, y);
		}
		return findGCD(x, y - x);
		
	}
	
	public static void main(String[] args) {
		NumberTheory theory=new NumberTheory();
		System.out.println(theory.findLCM(15, 20));
	}
}
