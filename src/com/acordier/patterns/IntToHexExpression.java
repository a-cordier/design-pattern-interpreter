package com.acordier.patterns;
/**
 * CREDIT: Pankaj Kumar
 * http://www.journaldev.com/dev/java/design-patterns
 */
public class IntToHexExpression implements Expression {
	
	private int i;
		
	public IntToHexExpression(int i) {
		this.i = i;
	}

	@Override
	public String interpret(InterpreterContext interpreterContext) {
		return interpreterContext.getHexFormat(i);
	}

}
