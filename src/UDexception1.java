
class MyException extends Exception{
	
	MyException()
	{
		
		
		super("lower number Exception");
	}
}
public class UDexception1  {
	static void check(int a,int b) throws MyException
	{
		if(a<b)
			throw new MyException();
		else{
			System.out.println("a is greater");
		}
		
	}

	public static void main(String[] args) throws MyException {
		
	try{
		check(12,13);
	}
	catch(MyException e)
	{
		
		System.out.println("Exception handeled here :");
	}
			
		
		
		

	}

}
