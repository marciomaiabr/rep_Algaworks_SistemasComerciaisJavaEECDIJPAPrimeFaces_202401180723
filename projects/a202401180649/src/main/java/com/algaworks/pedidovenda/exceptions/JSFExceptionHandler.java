package com.algaworks.pedidovenda.exceptions;

import java.util.Iterator;

import javax.faces.FacesException;
import javax.faces.application.ViewExpiredException;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.ExceptionQueuedEventContext;

public class JSFExceptionHandler extends ExceptionHandlerWrapper {

	private ExceptionHandler exceptionHandler;

	public JSFExceptionHandler(ExceptionHandler exceptionHandler) {
		this.exceptionHandler = exceptionHandler;
	}

	@Override
	public ExceptionHandler getWrapped() {
		System.out.println("JSFExceptionHandler.getWrapped()");
		return this.exceptionHandler;
	}

	@Override
	public void handle() throws FacesException {
		Iterator<ExceptionQueuedEvent> events = getUnhandledExceptionQueuedEvents().iterator();
		while(events.hasNext()) {
			ExceptionQueuedEvent event = events.next();
			ExceptionQueuedEventContext context = (ExceptionQueuedEventContext) event.getContext();

			Throwable throwable = context.getException();

			try {
				if(throwable instanceof ViewExpiredException) {
					redirect("/Home.xhtml");
				}
			} finally {
				events.remove();
			}

		}

		getWrapped().handle();
	}

	private void redirect(String page) {
		try {
			FacesContext facesContext = FacesContext.getCurrentInstance();
			ExternalContext externalContext = facesContext.getExternalContext();
			
			String requestContextPath = externalContext.getRequestContextPath();
			
			externalContext.redirect(requestContextPath+page);
			facesContext.responseComplete();
		} catch (Exception e) {
			throw new FacesException(e);
		}
	}
}
