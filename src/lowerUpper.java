
class Case{
	public static String toLower(String a) {
		String st = new String(a);
		int n=st.length();
		
		char ar[] = new char[n];
		
		for (int i = 0; i < n; i++) 
		{
			ar[i]=st.charAt(i);

		}
		String str="";
		for (int i = 0; i < n; i++) 
		{
			
			if(ar[i]>=65 && ar[i]<=90)
			{
				ar[i]= (char)(ar[i]+32);
			}
			str=str+ar[i];

		}
		return str;

	}
	public static String toUpper(String a) {
		String st = new String(a);
		int n=st.length();
		
		char ar[] = new char[n];
		
		for (int i = 0; i < n; i++) 
		{
			ar[i]=st.charAt(i);

		}
		String str="";
		for (int i = 0; i < n; i++) 
		{
			
			if(ar[i]>=97 && ar[i]<=122)
			{
				ar[i]= (char)(ar[i]-32);
			}
			str=str+ar[i];

		}
		return str;

	}
}

public class lowerUpper extends Case {
	

	public static void main(String[] args) 
	{

		
		System.out.println(toUpper("TusHar"));
		
	
	}

}
