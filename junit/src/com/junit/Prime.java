package com.junit;

public class Prime {
	

	    public boolean pnc(int num) {
	        int count = 0;
	        int j = 1;

	        while(j <= num)
	        {
	            if(num % j == 0)
	            {
	                count++;
	            }
	            j++;
	        }
	        if(count==2)
	        {
	        	return true;
	        }
	        else
	        {
	        	return false;
	        }
	  }
	

}
