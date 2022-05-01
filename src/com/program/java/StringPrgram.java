package com.program.java;

public class StringPrgram {

	public static void main(String[] args) {

String str="The quick brown for jumps over the lazy dog";
char  str1=' ';

for (int i=0;i<str.length();i++)
{

	if((str.charAt(i))!=str1)
	System.out.println("index of "+ str.charAt(i)+ " = "+i);
}


}


	}


