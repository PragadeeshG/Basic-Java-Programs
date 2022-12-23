package com.FrequencyOfCharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		String name = "Pragadeesh is a good boy";
		Map<Character, Integer> output = new HashMap<>();
		for (int i = 0; i < name.length(); i++) {
			char abc = name.charAt(i);
			if (output.containsKey(abc)) {
				int val = output.get(abc);
				val = val + 1;
				output.put(abc, val);
			} else {
				output.put(abc, 1);
			}
		}
		System.out.println(output);
	}

	

}
