package com.program.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class A10_11_12_13_17_ArrayPrograms {

	public static void main(String[] args) {
	int a []= {3,8,7,20,30,5,20,5,26};
   int 	max =a[0];
   int min=a[0];
   	for (int i=0;i<a.length;i++)
	{
		if (max<a[i])
		{
			max=a[i];
		}
		if (min>a[i])
		{
			min=a[i];
		}
		
	}
 System.out.println("Largest number in Array is " + max);
 System.out.println("Smallest number in Array is " + min);
 //Arrays.sort(a);
 System.out.println("2nd Largest number in Array is "+ a[1]);
 System.out.println("3rd Largest number in Array is "+ a[2]);
 System.out.println("4th Largest number in Array is "+ a[3]);
 ArrayList al=new ArrayList();
 LinkedList ll=new LinkedList();
 HashSet hs=new HashSet();
 LinkedHashSet lhs=new LinkedHashSet();
 
    for (int i=0;i<a.length;i++)
    {
    	int count=0;
    	for(int j=2;j<=max;j++)
    	{
    	
    		if(a[i]%j==0)
    		{
    			count=count+1;
    		
    		}
    	}
    	if (count==1)
    	 {
    		 //System.out.println("Prime Number form given Arrys is "+ a[i]);
    		al.add(a[i]);
    		ll.add(a[i]);
    		hs.add(a[i]);
    		lhs.add(a[i]);
    		
    	 }
   
    }
 
 System.out.println("ouput of arryalist= "+al);
 System.out.println("output of linkedList "+ll);
 System.out.println("output of Hashset "+hs);
 System.out.println("output of linkedHashSet "+lhs);
	}

}
