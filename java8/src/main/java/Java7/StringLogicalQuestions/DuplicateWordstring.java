package com.java8.java8.Java7.StringLogicalQuestions;

import java.util.HashMap;
import java.util.Iterator;

//Calculate duplicate words in string
public class DuplicateWordstring {
	static void findDuplicateWord(String str) {
		HashMap<String, Integer> hm = new HashMap<>();
		String[] s = str.split(" ");
		
		for (String tempString : s) {
			if (hm.get(tempString) != null) {
				hm.put(tempString, hm.get(tempString) + 1);
			} else {
				hm.put(tempString, 1);
			}
		}
		
		Iterator<String> tempString = hm.keySet().iterator();
		
		while (tempString.hasNext()) {
			String temp = tempString.next();
			if (hm.get(temp) > 1) {
				System.out.println("the word " + temp + " appeard " + 
				hm.get(temp) + " no of times");
			}
		}		
	}
	
	static void findDuplicateCharacers(String str) {
		HashMap<Character, Integer> hm = new HashMap<>();		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hm.get(c) != null) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
	}

	public static void main(String[] args) {
		findDuplicateWord("I am am am Learning java java am");
		findDuplicateCharacers("Aaabbbcdd");			
	}

}
