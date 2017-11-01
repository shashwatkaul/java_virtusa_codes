
public class sqrt {

	public static void main(String args[]) {

		int n=6;
		int r=0;
		int i=0;
		int ar[] = new int[25];
		
		while(n!=1)
		{
			if(n%2==0)
			{
				n=n/2;
				ar[i]=2;
				i++;
			}
			else
			{
				n=n/2;
				ar[i]=2;
				r++;
				i++;
			}
			
			
			
		}
		int flag=0;
		for(int j=0;j<25;j++)
		{
			
			if(ar[j]==2)
			{
				flag++;
			}
			
		}
		
		int root=1;
		int flag2=flag/2;
		while(flag2>0)
		{
			root=root*2;
			flag2--;
		}
		
		if(flag%2==0)
		{
			root=root+r/2;
			
			System.out.println(root);
		}
		else
		{
			root=root+2+(r/2);
			
			System.out.println(root);
		}
		
	}
}
