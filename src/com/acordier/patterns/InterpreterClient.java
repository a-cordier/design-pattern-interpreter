package com.acordier.patterns;
/**
 * CREDIT: Pankaj Kumar
 * http://www.journaldev.com/dev/java/design-patterns
 */
public class InterpreterClient {

	private InterpreterContext interpreterContext;

	public InterpreterClient(InterpreterContext interpreterContext) {
		this.interpreterContext = interpreterContext;
	}

	public String interpret(String input) {
		try {
			int i = Integer.parseInt(input.split(" ")[0]);
			if(input.toLowerCase().contains("hex")){
				return new IntToBinaryExpression(i).interpret(interpreterContext);
			}else if(input.toLowerCase().contains("bin")){
				return new IntToHexExpression(i).interpret(interpreterContext);
			}
		} catch (NumberFormatException e) {
			System.out.printf("Bad format: %s is not a number.", input);
		}
		return null;		
	}
}
