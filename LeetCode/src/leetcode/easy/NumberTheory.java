package leetcode.easy;

public class NumberTheory {

	/**
	 * lcm(x,y)=x*(y/gcd(x,y))
	 * @param x
	 * @param y
	 * @return
	 */
	public int findLCM(int x, int y) {
		//multiplicatgion of x and y can lead to large number which can overflow therfore first divide y and then multiply.
		
		return (x*y)/findGCD(x, y);
	}

	/**
	 * gcd(x,0)=x
	 * gcd(x,y)=gcd(y,y%x)
	 * @param x
	 * @param y
	 * @return
	 */
	public int findGCD(int x, int y) {
		if (y == 0)
			return x;
		else
			return findGCD(y, x % y);
	}

	public static void main(String[] args) {
		NumberTheory theory = new NumberTheory();
		System.out.println(theory.findLCM(78477, 15));
	}
}
