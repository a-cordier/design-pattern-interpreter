package com.acordier.patterns;
/**
 * CREDIT: Pankaj Kumar
 * http://www.journaldev.com/dev/java/design-patterns
 */
public class IntToBinaryExpression implements Expression {
	
	private int i;
	
	public IntToBinaryExpression(int i) {
		this.i = i;
	}


	@Override
	public String interpret(InterpreterContext interpreterContext) {
		return interpreterContext.getBinaryFormat(i);
	}

}
