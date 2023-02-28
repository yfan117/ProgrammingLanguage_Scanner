package com.Utility;

import java.util.ArrayList;

import com.Bean.Expression;

public class MidService {
	
	public static String URL = "Resource//";
	
	public static String[] keyWords;
	public static String[] operator;
	
	public static ArrayList<Expression> list = new ArrayList<>();

	public static boolean checkValid(String expression) {
		
		String temp = expression;
		
		if(temp.charAt(temp.length()-1) != ';') {
			return false;
		}
		
		if(temp.contains(" ")) {
			
			String parsed[] = temp.split(" ");
			
			for(String element: MidService.keyWords) {
				if(parsed[0].equals(element)) {
					parsed[0] = "";
					break;
				}
			}
			
			if(parsed[0].length() != 0) {
				return false;
			}
						
//			System.out.println(parsed[1]);
			String parsed2[] = new String[]{};
			for(String element: MidService.operator) {
				if(parsed[1].contains(element)) {
//					System.out.println(element);
					parsed2 = parsed[1].split("\\"+element);
					break;
				}
			}
//			System.out.println(Arrays.toString(parsed2));
			if(parsed2.length > 2 || parsed2.length == 1) {
				return false;
			}
			
			if(parsed2.length == 0) {
				return true;
			}
			
			if(Character.isDigit(parsed2[0].charAt(0)) == true) {
				return false;
			}
			else {
				return true;
			}
			

		}
		else {
			String parsed[] = new String[]{};
			for(String element: MidService.operator) {
				if(temp.contains(element)) {
//					System.out.println(temp);
//					System.out.println(element);
					parsed = temp.split("\\"+element);
					break;
				}
			}

			
			if(parsed.length == 0) {
				return false;
			}
			
			if(Character.isDigit(parsed[0].charAt(0)) == true) {
				return false;
			}
			else {
				return true;
			}
			
		}
		
	}
}
