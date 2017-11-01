class except{
	int balance = 500;
	void withdraw(int x)throws fundsException{
		if(x>balance)
		{
			fundsException e = new fundsException();
			throw e;
		}
		
	}
}
class fundsException extends Exception {
	fundsException()
	{
		System.out.println("low on funds");
		
		
	}
	
	
}
public class UDException {

	public static void main(String[] args) throws fundsException {
		
		except f = new except();
		f.withdraw(600);

	}

}
