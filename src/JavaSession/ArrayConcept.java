package JavaSession;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//1. int array
		int i[] = new int[5];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
//		System.out.println(i[-1]);// arrayindexoutofbound exception;
		System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		int len=i.length;
		System.out.println("length of the array is:"+ len);
		System.out.println("highest index: "+ (len-1));
		
		//print all
		for(int k=0; k<len; k++) {
			System.out.println(i[k]);
		}
		
		//2. double array
		double []d= new double[2];
		d[0]=10.11;
		d[1]=11.33;
		System.out.println(d[0]);
		System.out.println(d[1]);
		
				
		
		//3. char array
		char c[]= new char[3];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		System.out.println(c[0]+c[1]);
		
		//4. String array;
		String s[]=new String[3];
		s[0]= "anand";
		s[1]= "sam";
		s[2]= "ashi";
		
		System.out.println(s[0] +" "+ s[2]);
		
		//5. Object array;
		
				
		
		}

}
