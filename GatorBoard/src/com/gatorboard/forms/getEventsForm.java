package com.gatorboard.forms;

import org.apache.struts.action.ActionForm;

public class getEventsForm extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	private String OperationAction;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the operationAction
	 */
	public String getOperationAction() {
		return OperationAction;
	}

	/**
	 * @param operationAction the operationAction to set
	 */
	public void setOperationAction(String operationAction) {
		OperationAction = operationAction;
	}
	
}