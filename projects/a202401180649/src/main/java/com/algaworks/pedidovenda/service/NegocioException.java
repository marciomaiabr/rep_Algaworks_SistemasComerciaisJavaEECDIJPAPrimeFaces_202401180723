package com.algaworks.pedidovenda.service;

public class NegocioException extends RuntimeException {
	
	private static final long serialVersionUID = 20240212081000L;

	public NegocioException(String msg) {
		super(msg);
	}
	
}
