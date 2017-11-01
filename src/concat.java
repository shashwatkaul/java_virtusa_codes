

public class concat {

	public static String concat1(String a,String b)
	{
		return a+b;
	}
	public static String concat1(int a,String b)
	{
		return a+b;
	}
	public static String concat1(String a,int b)
	{
		return a+b;
	}
	public static String concat1(int a,int b)
	{
		Integer f = new Integer(a);
		
		return f.toString()+b;
	}
	public static void main(String[] args) {
	
		String a=concat1(12,12);	
		
		System.out.println(a);
	}

}
