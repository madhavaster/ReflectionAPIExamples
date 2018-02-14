package com.madhav.demo4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args){
		Class c = Employee.class;
		Method[] mt = c.getDeclaredMethods();
		for(Method m:mt) {
			System.out.println(m.getName()+"...."+m.getReturnType().getName()+"..."+Modifier.toString(m.getModifiers()));
			Class[] paramTypes = m.getParameterTypes();
			for(Class c1:paramTypes) {
				System.out.println(c1.getName());
			}
			System.out.println("-----------------");
			Class[] exceptionTypes = m.getExceptionTypes();
			for(Class c2:exceptionTypes) {
				System.out.println(c2.getName());
			}
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
		Constructor[] constructors = c.getConstructors();
		for(Constructor c3: constructors) {
			System.out.println(c3.getName()+".....");
			Class[] parameterTypes = c3.getParameterTypes();
			for(Class c4:parameterTypes) {
				System.out.println(c4.getName());
			}
			Class[] exceptionTypes = c3.getExceptionTypes();
			for(Class c5:exceptionTypes) {
				System.out.println(c5.getName());
			}
		}
	}
}

class Employee {
	private int eno;
	private String ename;
	public Employee(int eno,String ename) {
		this.eno=eno;
		this.ename=ename;
	}
	public void add(int eno,String ename,String eaddr) throws ClassNotFoundException,ClassCastException{
	}
	public String search(int eno) throws ArithmeticException,InterruptedException{
		return "";
	}
	public void delete(int eno) throws SQLException{
	}
}