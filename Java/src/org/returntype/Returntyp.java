package org.returntype;

public class Returntyp {
String name()
{
	return "veni";
	
}
public static void main(String[] args) {
	Returntyp s=new Returntyp();
	String name = s.name();
	System.out.println(name);
}
}
