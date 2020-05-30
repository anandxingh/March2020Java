package JavaSession;

public class DataConversion {

	public static void main(String[] args) {
		
	String x= "100";
	System.out.println(x+20);
	
	//String to int parsing
	int i= Integer.parseInt(x);
	System.out.println(i+20);
	
	//String to double parsing
	String y="11.22";
	double d= Double.parseDouble(y);
	System.out.println(d+20);
	
	//int to String
	int p=200;
	String s= String.valueOf(p);
	System.out.println(s+99);
	
	}

}
