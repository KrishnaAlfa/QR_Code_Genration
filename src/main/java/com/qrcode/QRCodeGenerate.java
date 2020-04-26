package com.qrcode;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import org.springframework.stereotype.Component;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

@Component
public class QRCodeGenerate {
	public String getQRCode(QR_Code_information codeInformation) throws WriterException, IOException {
		String QR_PATH = "C:\\Users\\Krishna\\Desktop\\QRCode\\";
		String QRName = QR_PATH + codeInformation.getName() + "-QRCode.png";
		QRCodeWriter writer = new QRCodeWriter();
		BitMatrix matrix = writer.encode(
				codeInformation.getName() + "\n" + codeInformation.getAddress() + "\n" + codeInformation.getDegree()
						+ "\n" + codeInformation.getAge() + "\n" + codeInformation.getMobile() + "\n",
				BarcodeFormat.QR_CODE, 350, 350);
		Path path = FileSystems.getDefault().getPath(QRName);
		MatrixToImageWriter.writeToPath(matrix, "PNG", path);
		return "QR code generated successfully.";
	}
}