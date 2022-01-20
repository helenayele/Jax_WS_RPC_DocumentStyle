package com.javatpoint;

import javax.jws.WebService;

@WebService(endpointInterface = "com.javatpoint.HelloWorld")  
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		// TODO Auto-generated method stub
		System.out.print("name " + name);
		return "Hello World from jax-ws " + name;
	}

}
