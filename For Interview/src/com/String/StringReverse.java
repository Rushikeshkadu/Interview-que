package com.String;

public class StringReverse {
public static void main(String[] args) {
	String s="javabykiran";  //print in reverse order
	char ch[]=s.toCharArray();
	String res="";
	for(int i=ch.length-1;i>=0;i--) {
		res=res+ch[i];
	}
	System.out.println(res);
}
}
