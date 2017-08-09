package leetcode.easy;

public class ReverseInteger {

	public int reverse(int x){
		final int INT_MIN=-2147483648;
		final int INT_MAX=2147483647;
		long res=0;
		while(x!=0){
		if( res>INT_MAX/10 | res<INT_MIN/10){
			return 0;
		}
		
			res=res*10+x%10;
			x=x/10;
		}
		return (int) res;
	}
	
	
	public static void main(String[] args) {
		ReverseInteger reverse=new ReverseInteger();
		System.out.println(reverse.reverse(1534236469));
	}
	
}
