package com.Bean;

import java.util.Arrays;

import com.Utility.MidService;

public class Expression {
	
	private String expression;
	private boolean isValid;
	
	public Expression(String expression) {
		this.expression = expression;
		this.isValid = MidService.checkValid(this.expression);
	}
	
	public String getExpression() {
		return this.expression;
	}
	public boolean getValid() {
		return this.isValid;
	}

}
