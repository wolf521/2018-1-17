package com.imooc.beanannotation.javabased;

import org.springframework.context.annotation.Scope;

@Scope
public class StringStore implements Store<String> {
	
	public void init() {
		System.out.println("This is init.");
	}
	
	public void destroy() {
		System.out.println("This is destroy.");
	}
	
}
