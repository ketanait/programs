package com.program.java;

public class RevreseString {

	public static void main(String[] args) {
		String str="Ketan Dhumalla";
		String reve= "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			
			if (str.charAt(i)!=' ')
			{
			reve=reve+str.charAt(i);
			}
		}
              System.out.println(reve);

              System.out.println("1.indexOf any charc method= "+str.indexOf('K'));
              System.out.println("2.indexOf any charc method= "+str.indexOf('a', 11));
              System.out.println("3.conct method= "+str.concat(reve) +" and "+str+" "+reve);
	}

}
