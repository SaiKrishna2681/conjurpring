import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.sql.*;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import com.cyberark.conjur.api.Conjur;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World - v3!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
      
		System.out.println("Helloworld");
		
		
		Conjur conjur = new Conjur();
		//String secret = conjur.variables().retrieveSecret("jenkins-app/web_password");
	    	String pwd = conjur.variables().retrieveSecret("jenkins-app/web_password");
		System.out.println("Password : "+pwd);
	    
	    
	     Class.forName("com.mysql.jdbc.Driver");  
	     System.out.println("Driver class loaded");
      Connection con=DriverManager.getConnection(  
      "jdbc:mysql://54.234.232.32:3306/test","demo_java",pwd);
	    System.out.println("Connection Object : "+con);
          //test?useSSL=false
	    //PreparedStatement pstmt = con.prepareStatement("CREATE DATABASE MyDB;");
	    System.out.println("Prepared Statement : "+pstmt);
      PreparedStatement pstmt=con.prepareStatement("insert into test.emp values(?,?)"); 
	    System.out.println("Prepared Statement : "+pstmt);
      pstmt.setString(1,"123456");
        pstmt.setString(2,"Sai Krishna");
	       //pstmt.setString(3,salary);
      int updates = pstmt.executeUpdate();
          System.out.println("No Of records inserted : "+updates);
        
    }

}
