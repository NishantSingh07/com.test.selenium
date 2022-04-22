package com.test.selenium;

import java.util.ArrayList;
import java.util.List;



public class Solution {	
	
		public static void main(String[] args) {	
		
		String str= "Today is January 5th"	;		
		//String  opString = "5thja nu aryisTo day";
		StringBuilder sb = new StringBuilder();
				
		String[] p = str.split(" ");
		int no_of_items= p.length;
		List<Integer> size_list= new ArrayList<Integer>();		
		
		for (String item:p) {			
			int wc= item.length();
			size_list.add(wc);		
			}
		
		for(int i=1;i<=no_of_items;i++) {
		char[] word = p[no_of_items-i].toCharArray();		
				
		for(char c:word) {
			sb.append(c);}
				
		}	
		System.out.println(size_list);
	//	System.out.println(sb.toString().subSequence(0, 5)+" "+sb.toString().subSequence(5, 7)+" "+sb.toString().subSequence(7, 14)+" "+sb.toString().subSequence(14,17));
		
		// [5,2,7,3]	
		
	
		for (int v :size_list) {
			for(int i=0;i<sb.length();i=i+v) {	
				System.out.println(sb.toString().subSequence(i,i+v));
				if(i==v) {
					break;
					}	
//				else {			
//			System.out.println(sb.toString().subSequence(i,i+v));
//		}
		
		}	//		System.out.println(size_list);
}}}


    