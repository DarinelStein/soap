package com.roytuts.jax.ws.service.publisher;

import javax.xml.ws.Endpoint;

import com.roytuts.jax.ws.service.impl.HelloImpl;

public class HelloPublisher {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/jax-ws/hello", new HelloImpl());
	}
	
}
