package com.madhav.demo3;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Employee e = new Employee();
		Class c = e.getClass();
		System.out.println("-----------------");
		Field[] flds = c.getDeclaredFields();
		for(Field fld: flds)
			System.out.println(fld.getName()+"...."+fld.getType().getName()+"...."+Modifier.toString(fld.getModifiers())+"...."+fld.get(fld));
	}
}

class Employee {
	public static int eno=111;
	static String ename="reddy";
	static String address="hyderabad";
}