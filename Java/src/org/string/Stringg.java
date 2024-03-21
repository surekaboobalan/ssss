package org.string;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;

public class Stringg {
	public static void main(String[] args) {
//	String s="java";
//	
//String replace = s.replace('j','a');
//System.out.println(replace);
//
//int ss = s.indexOf('a');
//System.out.println(ss);
		// ========================
//mohan raj==>mohan jar
//====================================
		String a = "mohan Raj";

		String substring = a.substring(0, 6);
		System.out.print(substring);

		for (int i = 8; i >= 6; i--) {
			System.out.print(a.charAt(i));

		}
		System.out.println("");
//=================
//===amazon==>amanoz
//================
		String b = "amazon";
		for (int i = 0; i <= 2; i++) {
			char charAt = b.charAt(i);
			System.out.print(charAt);
		}
		for (int j = 5; j >= 3; j--) {
			char charAt1 = b.charAt(j);
			System.out.print(charAt1);
		}
//multidimension array
//without for loop
		System.out.println();
		int[][] a1 = { { 1, 2, 3, 4 }, { 10, 20, 30 }, { 22, 33 } };
		System.out.println(a1[2][1]);
//using for  loop
		for (int i = 0; i < a1.length; ++i) {
			for (int j = 0; j < a1[i].length; ++j) {
				System.out.println("using for loop" + a1[i][j]);

			}

		}
//		//count how many character in a string
//		String o="cocomelon";
//		char[] charArray = o.toCharArray();
//		System.out.println(charArray);
//		Map<Character, Integer> m=new HashMap<Character, Integer>();
//		for (char c : charArray) {
//			int count=0;
//			for (char d : charArray) {
//				if(c==d)
//				{
//					count++;
//				}
//			}
//			m.put(c, count);
//		System.out.println(m);
//
//		}
		
	
	//count character in a string
	
String p="cocomelon";
Map<Character, Integer> countchar= new HashMap<Character, Integer>();
for (int i = p.length()-1; i >=0 ; i--) {
if (countchar.containsKey(p.charAt(i))) {
	Integer integer = countchar.get(p.charAt(i));
	countchar.put(p.charAt(i), ++integer);
}
else {
	countchar.put(p.charAt(i), 1);
}

}

System.out.println(countchar);


	}
	//===========================
	
	
	
}


