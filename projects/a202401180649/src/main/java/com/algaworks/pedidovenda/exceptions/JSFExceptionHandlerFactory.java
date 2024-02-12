package com.algaworks.pedidovenda.exceptions;

import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;

public class JSFExceptionHandlerFactory extends ExceptionHandlerFactory {

	private ExceptionHandlerFactory parent;

	public JSFExceptionHandlerFactory(ExceptionHandlerFactory parent) {
		this.parent = parent;
	}
	
	@Override
	public ExceptionHandler getExceptionHandler() {
		System.out.println("JSFExceptionHandlerFactory.getExceptionHandler()");
		return new JSFExceptionHandler(parent.getExceptionHandler());
	}

}
