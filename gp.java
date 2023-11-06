package array;

public class gp {
	public static int Nth_term(int a, int r, int n)
	{ 
	    int p=1;
	    for(int i=1;i<=n-1;i++){
	        p=p*r;
	    }
	    System.out.println(p);
	    int op= a*p;
	    return op;
	    // code here
	}
	public static void main(String args[]) {
		int o=Nth_term(5,9,10);
		System.out.println(o);
	}
}
