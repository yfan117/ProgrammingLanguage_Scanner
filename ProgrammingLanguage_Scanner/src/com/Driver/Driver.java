package com.Driver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.Bean.Expression;
import com.Utility.MidService;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		
		MidService.keyWords = new String[]{"double", "int", "long", "char", "boolean"};
		MidService.operator = new String[]{",", "+=", "-=", "*=", "/=", "-", "+", "*", "/", "="};
		
		BufferedReader file = new BufferedReader(new FileReader(MidService.URL+"input.txt"));
		Scanner scann = new Scanner(file);
		
		while(scann.hasNext()) {
			MidService.list.add(new Expression(scann.nextLine()));
		}
		
		for(Expression element: MidService.list) {
			System.out.println(element.getExpression() +" -- " +element.getValid());
		}
		
		
	}
}
