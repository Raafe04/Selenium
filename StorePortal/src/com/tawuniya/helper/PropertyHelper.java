package com.tawuniya.helper;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyHelper {

	public static String getPropertyValue (String propKey) {
		Properties props;
        InputStream inputStream=null;
        String propskey="";
        String propsvalue="";
           try {
                 inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("prop.properties");
                 System.out.println(Thread.currentThread().getContextClassLoader());
                 props = new Properties();
                 props.load(inputStream);
                
                 for (Enumeration<Object> enumprops = props.keys(); 
                		 enumprops.hasMoreElements();) {
                     propskey = (String) enumprops.nextElement();
                     propsvalue = props.getProperty(propskey);
                 }
                 propsvalue = props.getProperty(propKey);
                 
           } catch (Exception e) {
                  //e.printStackTrace();
           } finally {
               try {
                   if (inputStream != null) {
                	   inputStream.close();
                   }
               } catch (Exception e) {
                   System.out.println("<>ApplicationProperty.loadProperties-Excep-InputStreamClose");
                   //e.printStackTrace();
               }
           }
           return propsvalue;
      }
}
