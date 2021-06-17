package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		InputStream in=new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		InputStream bin=new BufferedInputStream(in);
		OutputStream out=new FileOutputStream("C:\\javaStudy\\file\\bufferimg.jpg");
		BufferedOutputStream bout=new BufferedOutputStream(out);
		
		int data;
		
		while(true) {
			data=bin.read();
			if(data==-1) {
				break;
			}
			bout.write(data);
		}
		bout.close();
		bin.close();
		
		
			

	}
	
	

}	
