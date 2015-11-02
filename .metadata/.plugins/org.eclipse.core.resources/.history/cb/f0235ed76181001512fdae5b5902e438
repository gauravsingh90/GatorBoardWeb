package com.gatorboard.actions;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.gatorboard.forms.LoginForm;

public class LoginAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		try{
			LoginForm helloWorldForm = (LoginForm) form;
			helloWorldForm.setMessage("Hello World! Struts");
		}
		catch (Exception e) {
			//TODO
				return mapping.findForward("error");
		}
		/*Gson gson = new Gson();
		String json = gson.toJson(helloWorldForm);

		response.setContentType("json/text;charset=utf-8");
		response.setHeader("cache-control", "no-cache");
		PrintWriter out = response.getWriter();
		out.println(json);
		out.flush();
		return null;*/
		
		return mapping.findForward("success");
	}
	
	
}