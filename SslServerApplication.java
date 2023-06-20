package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets; 

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}
		
		private static final String data = "Hello World Check Sum!";
		
		@GetMapping("/checkSum")
		public String getCheckSum() {
		    return data;
	}

}


@RestController

class ServerController{

 public static String calculateHash(String name) throws NoSuchAlgorithmException 
    {  
        MessageDigest md = MessageDigest.getInstance("SHA-256");  
        byte[] hash =  md.digest(name.getBytes(StandardCharsets.UTF_8));
        BigInteger number = new BigInteger(1, hash);  
        StringBuilder hexString = new StringBuilder(number.toString(16));  
        while (hexString.length() < 32)  
        {  
            hexString.insert(0, '0');  
        }  
        return hexString.toString();  
     
    } 
@RequestMapping("/hash")
public String myHash() throws NoSuchAlgorithmException{

String data = "Hello World, Check Sum for Dakota Keyes!";
String hash = calculateHash(data);

return "<p>data:"+data+" : SHA-256 "+" : "+hash;

}

}



