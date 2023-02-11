package com.Simplilearn.AccessModifier;

public class PublicAccessModifierExample {

	    //public access modified can provide the accessibility level inside the class,
		//outside the class to other classes in the same package or the other package as well
		//It is the highest level accessibility in the java
		
		// Variable,methods and Constructor
		//Constructor can be Default or Not Parameterized or they can be Parameterized Constructor

public static void main(String[] args)
{
	
	int value1 = 20;
	int value2 = 30;
	
	System.out.println("The addition of value1 and value2 :: " + (value1+value2));
	
	//Object Creation Using Default Constructor
	PublicAccessModifierExample psme = new PublicAccessModifierExample();
		//calling the object using class psme
		psme.MultiplayNumbers();
		
	
	
}

//Non Parameterized public function
public void MultiplayNumbers()
{
	//local scoped variables,only visible inside the method not outside method
	int value1 = 30;
	int value2 = 40;
	
	System.out.println("The multiplication of value1 and value2 :: " + (value1*value2));
}


}
