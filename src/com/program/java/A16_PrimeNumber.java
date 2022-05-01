package com.program.java;

public class A16_PrimeNumber {

	   public static void main(String [] arg)
	    {
	    int count=0;
	    {
	        for (int i=1;i<=10;i++)
	        {
	            for (int j=2;j<=i-1;j++)
	            {
	                if (i%j==0)
	                {
	                    count =count+1;
	                }
	            }
	            if (count==0)
	            {
	                System.out.println("Given Number is  Prime Number" +i);
	            }
	            else
	            count=0;
	        }
	        
	    }
	}

}
