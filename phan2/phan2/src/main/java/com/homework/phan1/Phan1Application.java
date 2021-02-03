package com.homework.phan1;

import com.homework.phan1.bean.BMP;
import com.homework.phan1.bean.GIF;
import com.homework.phan1.bean.JPG;
import com.homework.phan1.bean.PNG;
import com.homework.phan1.interfaces.IFile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Phan1Application {

	public static void main(String[] args) {
		System.setProperty("server.port", "8081");
		SpringApplication.run(Phan1Application.class, args);
		IFile graphicEditor1 = new BMP();
		IFile graphicEditor2 = new JPG();
		IFile graphicEditor3 = new PNG();
		IFile graphicEditor4 = new GIF();
		graphicEditor1.setFilePath("/BMP");
		graphicEditor1.openFile();
		graphicEditor1.parseFile();
		graphicEditor1.saveFile();
		graphicEditor2.setFilePath("/JPG");
		graphicEditor2.openFile();
		graphicEditor2.parseFile();
		graphicEditor2.saveFile();
		graphicEditor3.setFilePath("/PNG");
		graphicEditor3.openFile();
		graphicEditor3.parseFile();
		graphicEditor3.saveFile();
		graphicEditor4.setFilePath("/GIF");
		graphicEditor4.openFile();
		graphicEditor4.parseFile();
		graphicEditor4.saveFile();
	}

}
