package org.sample;

public class SampleProgram {
public static void main(String[] args) {
	
	int n = 1234;
	int res = 0,rem=0;
	while(n>0)
	{
	rem=n%10;
	res=(res*10)+rem;
	n=n/10;
	}
	System.out.println(res);
	System.out.println(1);
	System.out.println(2);
	
}
}
