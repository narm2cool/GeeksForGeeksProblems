package array;

import java.util.ArrayList;

public class test {

	   ArrayList<Integer> getTable(int N){
	        ArrayList<Integer> table = new ArrayList<Integer>();
	        // code here
	        for(int i=1;i<=10;i++){
	        table.add(i*N);
	        }
	        return table;
	    }
}

