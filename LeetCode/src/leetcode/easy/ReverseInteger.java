package leetcode.easy;

import javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener;

public class ReverseInteger {

	public int reverse(int x){
		long res=0;
		while(x!=0){
		if( res>Integer.MAX_VALUE/10 | res<Integer.MIN_VALUE/10){
			return 0;
		}
		
			res=res*10+x%10;
			x=x/10;
		}
		return (int) res;
	}
	/**
	 * To check whether number is palindrome
	 * @param x
	 * @return
	 */
	public boolean isPalindrome(int x){
		int original=x;
		int rev=0;
		while(x!=0){
			if(x<0)
				return false;
			if(rev>Integer.MAX_VALUE/10|| rev<Integer.MIN_VALUE/10){
				return false;
			}
			rev=rev*10+x%10;
			x=x/10;
		}
		System.out.println(rev);
		if(rev==original)
			return true;
		else
			return false;
		
	}
	
	/**
	 * Program to convert Roman number into Integer
	 * @param romanNumber Roman number which will be in range 1 to 3999
	 * @return
	 */
	public int convertRomanToInteger(String romanNumber){
		int value1,value2=0, number=0;
		for (int i=0;i<romanNumber.length();i++){
			
			value1=converCharacterToInt(romanNumber.charAt(i));
			if(i+1<romanNumber.length()){
				value2=converCharacterToInt(romanNumber.charAt(i+1));
				if(value1>=value2)
					 number=number+value1;
					else{
						number=number+value2-value1;
						i++;
					}
				
			}else{
				number=number+value1;
				i++;
			}
			
		}
		
		
		return number;
		
	}
	
	public int converCharacterToInt(char r){
		if (r=='I')
			return 1;
		if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        else return -1;
	}
	
	
	public static void main(String[] args) {
		ReverseInteger reverse=new ReverseInteger();
		//System.out.println(reverse.reverse(1534236469));
		//System.out.println(reverse.isPalindrome(-2147447412));
		System.out.println(reverse.convertRomanToInteger("MCMIV"));
	}
	
	
	
}
