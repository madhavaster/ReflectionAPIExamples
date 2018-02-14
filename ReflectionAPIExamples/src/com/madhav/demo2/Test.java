package com.madhav.demo2;

import java.io.Serializable;
import java.lang.reflect.Modifier;

public class Test {

	public static void main(String[] args) {
		Class c = Employee.class;
		System.out.println(c.getName());
		System.out.println("-----------------------------------");
		Class superclass = c.getSuperclass();
		System.out.println(superclass.getName());
		System.out.println("-----------------------------------");
		Class[] interfaces = c.getInterfaces();
		for(Class c1:interfaces)
			System.out.println(c1.getName());
		System.out.println("-----------------------------------");
		int modifiers = c.getModifiers();
		System.out.println(Modifier.toString(modifiers));
		System.out.println("-----------------------------------");
		
	}
}

abstract class Employee implements Serializable,Cloneable{
}