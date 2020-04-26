package com.qrcode;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.google.zxing.WriterException;

@SpringBootApplication
public class QrCodeExampleApplication {
	 
	public static void main(String[] args) throws WriterException, IOException {
	
		ApplicationContext applicationContext = SpringApplication.run(QrCodeExampleApplication.class, args);
		
		QRCodeGenerate service = applicationContext.getBean(QRCodeGenerate.class);
		System.out.println(service.getQRCode((new QR_Code_information("Name = Krishna Pratap Singh","Address = Etawah uttar prdaesh","Degree = BTech","Age = 25","Mobile No. = 8957006128"))));
		
	}
}
