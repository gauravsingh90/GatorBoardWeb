package com.gatorboard.utils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
 

public class PropertyReader {
		 
	    
	    public String getTableName(String tableKey) throws IOException {
	   	 
	        String result = "";
	        Properties prop = new Properties();
	        String propFileName = "TableList.properties";
	 
	        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
	        prop.load(inputStream);
	        if (inputStream == null) {
	            throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
	        }
	        
	 
	        // get the property value and print it out
	        String table = prop.getProperty(tableKey);
	        result = table;
	        inputStream.close();
	        return result;
	    }
	    
	    public String getColumnName(String columnKey) throws IOException {
		   	 
	        String result = "";
	        Properties prop = new Properties();
	        String propFileName = "ColumnList.properties";
	 
	        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
	        prop.load(inputStream);
	        if (inputStream == null) {
	            throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
	        }
	        
	 
	        // get the property value and print it out
	        String table = prop.getProperty(columnKey);
	        result = table;
	        inputStream.close();
	        return result;
	    }
	    
}
