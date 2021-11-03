import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;

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
        
	    
	    	//final String conjurTlsCaPath = "/home/ec2-user/conjur-quickstart/conf/policy/conjur-myConjurAccount.der";
		//final CertificateFactory cf = CertificateFactory.getInstance("X.509");
		//final FileInputStream certIs = new FileInputStream(conjurTlsCaPath);
		//final Certificate cert = cf.generateCertificate(certIs);
		
		
		
		//final KeyStore ks = KeyStore.getInstance("JKS");
		//ks.load(null);
		//ks.setCertificateEntry("conjurTlsCaPath", cert);

		//final TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
		//tmf.init(ks);

		//SSLContext conjurSSLContext = SSLContext.getInstance("TLS");
		//conjurSSLContext.init(null, tmf.getTrustManagers(), null);

		System.out.println("Helloworld");
		
		
		Conjur conjur = new Conjur();
		//String secret = conjur.variables().retrieveSecret("jenkins-app/web_password");

        
    }

}
