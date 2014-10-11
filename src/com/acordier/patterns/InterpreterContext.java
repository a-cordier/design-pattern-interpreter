package com.acordier.patterns;
/**
 * CREDIT: Pankaj Kumar
 * http://www.journaldev.com/dev/java/design-patterns
 */
public class InterpreterContext {
	
	public String getBinaryFormat(int i){
		return Integer.toBinaryString(i);
	}
	
	public String getHexFormat(int i){
		return Integer.toHexString(i);
	}
}
