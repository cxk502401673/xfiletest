package com;

public class TestService implements  TestServiceIfc{

	@Override
	public String helloWorld(String who) {
		System.out.println( who + " hello world!!!! ");
		return  who + " hello world!!!! ";
	}

}
