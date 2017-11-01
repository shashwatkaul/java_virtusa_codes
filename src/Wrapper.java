
public class Wrapper {

	public static void main(String[] args) {
		int a=34;
		Integer obj = new Integer(a);
		String h=obj.toString();
		h=h+"Tushar";
		System.out.println(h);  

Integer fr = new Integer(23);

int g=fr.intValue();


String st = "1234";
int f=Integer.parseInt(st);
System.out.println(f);
String st1="0110";
int l=Integer.parseInt(st1,2);
System.out.println(l);   
		
	}
	

}
