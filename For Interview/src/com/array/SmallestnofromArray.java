package com.array;

public class SmallestnofromArray {
public static void main(String[] args) {
	int a[]= {4,6,7,9,2,34,12};
int min=a.length-1;
for(int i=0;i<a.length;i++) {
	if(a[i]<min)
	min=a[i];
}
System.out.println(min);
}
}
