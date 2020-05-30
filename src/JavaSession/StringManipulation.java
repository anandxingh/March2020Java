package JavaSession;

public class StringManipulation {

	public static void main(String arg[]) {
		String str="This is my first java code and i am so happy";
	
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf("j"));
		System.out.println(str.indexOf("is"));
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("hello"));
		
		String message= "Welcome admin";
		if(message.indexOf("admin")>=0) {
			System.out.println("user is logged in");
		}
		
		String dob="02-01-1987";
		System.out.println(dob.replace("-", "/"));
		System.out.println(dob.replace("01", "jan")+ " " +dob.replace("02", "2nd"));
		
		//contains
		System.out.println(str.contains("java c"));
		
		
		//Reverse sentence of "This is my first java code and i am so happy"
		String st[]= str.split(" ");
		for(int i=st.length-1;i>=0;i--) {
		System.out.print(st[i]+" ");//happy so am i and code java first my is This
		}
		System.out.println("\n");
		//reverse String
		String main= "Selenium";
		String rev="";
		for(int j=main.length()-1;j>=0;j--) {
			rev=rev+ main.charAt(j);
			
		}
		System.out.println(rev);
		 char c[]= main.toCharArray();
		 String re="";
		 for(int k=c.length-1;k>=0;k--) {
			 re=re+ main.charAt(k);
			 
			 
		 }
		 System.out.println(re);
		
		StringBuffer sb= new StringBuffer(main);
		System.out.println(sb.reverse());
		
		//split
		String data= "tom;25;IBM;london;9999";
		String d[]= data.split(";");
		System.out.println(d[2]);
		
		String test= "xXjavaXxXxpythonxXXxXRuby";
		String testArr[]= test.split("xX");
		System.out.println(testArr[3]);
		System.out.println(testArr[4]);
		//sub String
		
		String sc= "my transaction id is 1234";
		System.out.println(sc.substring(4, 10));//10th index will be excluded
		System.out.println(sc.substring(14));//sub String start from 14th index
//		String message= "Welcome admin";
//		System.out.println(message.indexOf("admin"));
		
	}
}
