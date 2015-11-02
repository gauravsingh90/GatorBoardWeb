/**
 * 
 */
package com.gatorboard.dao;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.CachedRowSet;

import com.gatorboard.dto.getEventsDTO;
import com.gatorboard.utils.PropertyReader;

/**
 * @author singh
 *
 */
public class getEventsDAO {
	   public List<getEventsDTO> selectByPinNo(String fieldVal) throws Exception { 
		   PropertyReader properties = new PropertyReader(); 
		   CommonDAO objDAO = new CommonDAO();
		   CachedRowSet rs = objDAO.selectByPinNo(properties.getTableName("tbl_evnt"),fieldVal);
		   List<getEventsDTO> list = new ArrayList<getEventsDTO>();
		   
		   while (rs.next()) {
			   getEventsDTO resrcLevelDTO = new getEventsDTO();
			   resrcLevelDTO.setEventID(rs.getInt("eventID"));
			   resrcLevelDTO.setEvntName(rs.getString("evntName"));
			   resrcLevelDTO.setEvntStartDate(rs.getDate("evntStartDate"));
			   resrcLevelDTO.setEvntEndDate(rs.getDate("evntEndDate"));
			   resrcLevelDTO.setEvntStartTime(rs.getString("evntStartTime"));
			   resrcLevelDTO.setEvntEndTime(rs.getString("evntEndTime"));
			   resrcLevelDTO.setEvntLocation(rs.getString("evntLocation"));
			   resrcLevelDTO.setOrgnzrID(rs.getString("orgnzrID"));
			   resrcLevelDTO.setEvntDesc(rs.getString("evntDesc"));
			   resrcLevelDTO.setCatID(rs.getInt("catID"));
			   resrcLevelDTO.setEvntFlg1(rs.getString("evntFlg1"));
			   resrcLevelDTO.setEvntFlg2(rs.getString("evntFlg2"));
			   resrcLevelDTO.setEvntFlg3(rs.getString("evntFlg3"));
			   resrcLevelDTO.setEvntFlg4(rs.getString("evntFlg4"));
			   resrcLevelDTO.setEvntTags(rs.getString("evntTags"));
			   resrcLevelDTO.setEvntImgURL(rs.getString("evntImgURL"));
			   resrcLevelDTO.setLastUpdate(rs.getString("lastUpdate"));
			   resrcLevelDTO.setEvntField1(rs.getString("evntField1"));
			   resrcLevelDTO.setEvntField2(rs.getString("evntField2"));

	        	   list.add(resrcLevelDTO);
	           }
	         
	       return list;
	   }
	   public List<getEventsDTO> selectAll() throws Exception { 
		   //PropertyReader properties = new PropertyReader(); 
		   CommonDAO objDAO = new CommonDAO();
		   CachedRowSet rs = objDAO.selectAll("tbl_evnt");
		   List<getEventsDTO> list = new ArrayList<getEventsDTO>();
		   
		   while (rs.next()) {
			   getEventsDTO resrcLevelDTO = new getEventsDTO();
			   resrcLevelDTO.setEventID(rs.getInt("eventID"));
			   resrcLevelDTO.setEvntName(rs.getString("evntName"));
			   /*resrcLevelDTO.setEvntStartDate(rs.getDate("evntStartDate"));
			   resrcLevelDTO.setEvntEndDate(rs.getDate("evntEndDate"));
			   resrcLevelDTO.setEvntStartTime(rs.getString("evntStartTime"));
			   resrcLevelDTO.setEvntEndTime(rs.getString("evntEndTime"));
			   resrcLevelDTO.setEvntLocation(rs.getString("evntLocation"));
			   resrcLevelDTO.setOrgnzrID(rs.getString("orgnzrID"));
			   resrcLevelDTO.setEvntDesc(rs.getString("evntDesc"));*/
			   resrcLevelDTO.setCatID(rs.getInt("catID"));
			   /*resrcLevelDTO.setEvntFlg1(rs.getString("evntFlg1"));
			   resrcLevelDTO.setEvntFlg2(rs.getString("evntFlg2"));
			   resrcLevelDTO.setEvntFlg3(rs.getString("evntFlg3"));
			   resrcLevelDTO.setEvntFlg4(rs.getString("evntFlg4"));
			   resrcLevelDTO.setEvntTags(rs.getString("evntTags"));
			   resrcLevelDTO.setEvntImgURL(rs.getString("evntImgURL"));
			   resrcLevelDTO.setLastUpdate(rs.getString("lastUpdate"));
			   resrcLevelDTO.setEvntField1(rs.getString("evntField1"));
			   resrcLevelDTO.setEvntField2(rs.getString("evntField2"));*/

	        	   list.add(resrcLevelDTO);
	           }
	         
	       return list;
	   }

}
