package JavaSession;

public class IncrementalAndDecrementalOperation {

	public static void main(String[] args) {
	int a=1;
	int b=a++;//post increment
	
	System.out.println(a);//2
	System.out.println(b);//1
    
	int m= -1;
	int n=m++;
	System.out.println(m);
	System.out.println(n);
	
	int p=1;
	int q= ++p;//pre increment
	System.out.println(p);
	System.out.println(q);
	
	
	int l= -5;
	int u=++l;
	System.out.println(l);
	System.out.println(u);
	
	int h=2;
	int g=h--;
	System.out.println(h);
	System.out.println(g);
	
	int x=-99;
	int y= --x;
	System.out.println(x);
	System.out.println(y);
	
	int s1=0;
	int s2=--s1;
			System.out.println(s1);
	System.out.println(s2);
	}

}
