package com.array;
//Hoe to iterate array
public class IterateArray {
public static void main(String[] args) {
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.println(a[i][j]);
		}
	}
	
	//using for each
	
	for (int[] is : a) {
		for (int is2 : is) {
			System.out.println(is2);
		}
	}
}
}
