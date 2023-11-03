package array;

public class test {

	  void printPat(int n)
	    
	    {   int i,j,m;
	        int k,l;
	         k=n;
	        l=n;
	        for(i=n;i>=1;i--)
	    {
	        for(j=n;j>=1;j--){
	            for(m=k;m>=1;m--){
	                System.out.print(l+" ");
	            }
	            l--;
	        }
	        System.out.print("$");
	        l=n;
	        k--;
	        
	        
	    }
	        
	         // Your code here
	    }
}

