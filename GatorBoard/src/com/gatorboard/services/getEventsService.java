package com.gatorboard.services;

import java.util.List;

import com.gatorboard.dao.getEventsDAO;
import com.gatorboard.dto.getEventsDTO;
import com.gatorboard.forms.getEventsForm;
public class getEventsService {
	public List<getEventsDTO> getData(getEventsForm objForm) throws Exception {
		getEventsDAO dbDAO = new getEventsDAO();
		List<getEventsDTO> listDTO = null;
		try {
			listDTO = dbDAO.selectAll();
			
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		return listDTO;
		
	}
	
	public int saveData(getEventsForm objForm) throws Exception {
		try {
			
	} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	/*public void setData(getEventsForm objForm,getEventsDTO objReturnDTO)
	{
		if(objReturnDTO.getPinNo()!=null){
			objForm.setPinNo(objReturnDTO.getPinNo());}
		else{
			objForm.setPinNo("");}
		
		if(objReturnDTO.getRowID()!=null){
			objForm.setRowID(objReturnDTO.getRowID());}
		else{
			objForm.setRowID("");}
		
		if(objReturnDTO.getVerNo()!=null){
			objForm.setVerNo(objReturnDTO.getVerNo());}
		else{
			objForm.setVerNo("");}
		
		if(objReturnDTO.getReleaseDate()!=null){
			objForm.setReleaseDate(objReturnDTO.getReleaseDate().toString());}
		else{
			objForm.setReleaseDate("");}
		
		if(objReturnDTO.getReviewedBy()!=null){
			objForm.setReviewedBy(objReturnDTO.getReviewedBy());}
		else{
			objForm.setReviewedBy("");}
		
		if(objReturnDTO.getApprovedBy()!=null){
			objForm.setApprovedBy(objReturnDTO.getApprovedBy());}
		else{
			objForm.setApprovedBy("");}
		
		if(objReturnDTO.getChangeDesc()!=null){
			objForm.setChangeDesc(objReturnDTO.getChangeDesc());}
		else{
			objForm.setChangeDesc("");}

		}*/
}
