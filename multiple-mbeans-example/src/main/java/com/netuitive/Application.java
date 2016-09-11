package com.netuitive;

import com.netuitive.mbean.Test;
import java.lang.management.ManagementFactory;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author john.king
 */
@SpringBootApplication
@ComponentScan
public class Application {

    public static void main(String[] args) throws Exception{
        registerMbean();
        SpringApplication.run(Application.class, args);
    }
    
    public static void registerMbean() throws Exception{
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer(); 
        
        //our first mbean will create random values between 1-100
        ObjectName name1 = new ObjectName("com.netuitive.mbean:type=Test,name=Test1MBean"); 
        Test mbean1 = new Test(1L, 100L); 
        
        //our second mbean will create random values between 1-10
        ObjectName name2 = new ObjectName("com.netuitive.mbean:type=Test,name=Test2MBean"); 
        Test mbean2 = new Test(1L, 10L); 
        
        mbs.registerMBean(mbean1, name1); 
        mbs.registerMBean(mbean2, name2); 
    }
}
