/**
 * 
 */
package com.gatorboard.actions;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.gatorboard.dto.getEventsDTO;
import com.gatorboard.forms.getEventsForm;
import com.gatorboard.services.getEventsService;
import com.google.gson.Gson;

/**
 * @author singh
 *
 */
public class getEventsAction  extends Action {
	getEventsDTO objReturnDTO = new getEventsDTO();
	List<getEventsDTO> listDTO;
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		try{
			getEventsForm objForm = (getEventsForm) form;
			getEventsService objService = new getEventsService();
			
			
			//Setting Up operation parameters
			objForm.setOperationAction("FETCH");
			if (objForm.getOperationAction().equalsIgnoreCase("FETCH")) {
				//Invoking Service Layer
				listDTO = objService.getData(objForm);
				for (getEventsDTO rowDTO : listDTO) {
					objReturnDTO =rowDTO;
				}
			}


			
		}
		catch (Exception e) {
			//TODO
				return mapping.findForward("error");
		}
		
		Gson gson = new Gson();
		String json = gson.toJson(listDTO);

		response.setContentType("json/text;charset=utf-8");
		response.setHeader("cache-control", "no-cache");
		PrintWriter out = response.getWriter();
		out.println(json);
		out.flush();
		return null;
	}
	
}
