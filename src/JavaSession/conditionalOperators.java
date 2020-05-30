package JavaSession;

import javax.sound.midi.SysexMessage;

public class conditionalOperators {

	public static void main(String[] args) {
		
		int a= 30;
		int b= 20;
		
		if(b>a) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("a is greater");
			
		}
		System.out.println(a>b);
		
		int x= 100;
		int y= 100;
		
		if(x==y) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both ar not equal");
			
		}
		
		//> >= < <= == !=
		if (x>= y) {
			System.out.println("hii");
		}
		else {
			System.out.println("bye");
		}
		if(true) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
			
		}
		
		//wap to find gretest number;
		int d=100;
		int e= 200;
		int f= 300;
		
		if(d>e && d>f) {
			System.out.println("d is greatest");
		}
		else if(e>f) {
			System.out.println("e is greatest");
		}
		else {
			System.out.println("f is greatest");
		}
		
		//wap to find greatest number out of four;
		
		int k= 200;
		int l= 350;
		int m= 1150;
		int n= 500;
		
		if((k>l && k>m) && k>n) {
			System.out.println("k is greatest");
		}
		else if(l>m && l>n) {
			System.out.println("l is greatest");
		}
		else if(m>n) {
			System.out.println("m is greatest");
		}
		else {
			System.out.println("n is greatest");
		}
		
		int p= 12;
		int q=14;
		int r=101;
		int s=45;
		int t=22;
		
		if(((p>q && p>r)&& p>s)&& p>t) {
			System.out.println("p is greatest");
		}
		else if((q>r && q>s)&& q>t) {
			System.out.println("q is greatest");
		}
		else if(r>s && r>t) {
			System.out.println("r is greatest");
		}
		else if(s>t){
			System.out.println("s is greatest");
		}
		else {
			System.out.println(" t is greatest");
		}
		
/*		switch(int) {
		case p:
			System.out.println("p is greatest");
		case q:
			System.out.println();
		*/
		
		
	}

}
