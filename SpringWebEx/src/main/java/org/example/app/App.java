package org.example.app;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        //System.out.println( "Hello World!" );
        // creating Tomcat Object...
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector();

// creating mapping between Tomcat and Servlet..
        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context,"HS",new HelloServlet());
        context.addServletMappingDecoded("/hello","HS");
        tomcat.start();
        tomcat.getServer().await();

    }
}
