import java.util.*;

class test {
	int largest(int a ,int b)
	{
		return a>b?a:b;
	}
	int largest(int a,int b,int c)
	{
		return a>b?(a>c?a:c):b>c?b:c;
	}

}

public class polymorphism {

	public static void main(String[] args) {
		test a = new test();
		System.out.print(a.largest(123, 19,1512));

	}

}
