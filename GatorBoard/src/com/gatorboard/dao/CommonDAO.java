package com.gatorboard.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

import com.sun.rowset.CachedRowSetImpl;
import com.gatorboard.db.ConnectionFactory;
import com.gatorboard.db.DbUtil;
import com.gatorboard.utils.ApplicationException;

import javax.sql.rowset.CachedRowSet;


public class CommonDAO {
	private Connection connection;
	private Statement statement;
	
	public CommonDAO() { }
	
	public CachedRowSet selectAll(String tableName) throws Exception {
		ResultSet rs = null;
		CachedRowSet crs=null;
		
	   try {

		   String query = "select * from "+tableName;
		   
	       connection = ConnectionFactory.getConnection();
	       statement = connection.createStatement();
	       rs = statement.executeQuery(query);
	       crs = new CachedRowSetImpl();
	         crs.populate(rs);
	         SQLWarning warning = statement.getWarnings();
	       if (warning != null)
	           throw new ApplicationException(warning.getMessage());
	      
	       } catch (SQLException e) {
	    	   ApplicationException exception = new ApplicationException(
	                   e.getMessage(), e);
	           throw exception;
	       } finally {
	           DbUtil.close(statement);
	           DbUtil.close(connection);
	       }
	   return crs;
	   }
	public CachedRowSet selectByPinNo(String tableName,String pinNo) throws Exception {
		ResultSet rs = null;
		CachedRowSet crs=null;
		
	   try {

		   String query = "select * from "+tableName+" where PinNo ='"+pinNo+"'";
		   
	       connection = ConnectionFactory.getConnection();
	       statement = connection.createStatement();
	       rs = statement.executeQuery(query);
	       crs = new CachedRowSetImpl();
	         crs.populate(rs);
	         SQLWarning warning = statement.getWarnings();
	       if (warning != null)
	           throw new ApplicationException(warning.getMessage());
	      
	       } catch (SQLException e) {
	    	   ApplicationException exception = new ApplicationException(
	                   e.getMessage(), e);
	           throw exception;
	       } finally {
	           DbUtil.close(statement);
	           DbUtil.close(connection);
	       }
	   return crs;
	   }
	
	public int insertRow(String tableName, String column, String values) throws Exception {
		int ins=0;
	   try {
		   String query = "insert into "+tableName + " ("+ column +") " + " VALUES ("+ values +") ";

	       connection = ConnectionFactory.getConnection();
	       statement = connection.createStatement();
	       ins = statement.executeUpdate(query);
	         SQLWarning warning = statement.getWarnings();
	       if (warning != null)
	           throw new ApplicationException(warning.getMessage());
	      
	       } catch (SQLException e) {
	    	   ApplicationException exception = new ApplicationException(
	                   e.getMessage(), e);
	           throw exception;
	       } finally {
	           DbUtil.close(statement);
	           DbUtil.close(connection);
	       }
	   return ins;
	   }
}
