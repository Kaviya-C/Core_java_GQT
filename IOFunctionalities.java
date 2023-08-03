package com.gqt.advance.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * if we use fileInputstream and fileoutputstream mean we don't need to perform flush()
 * bcoz that data stored in temp itself
 * 
 * when we use filereader and filewriter compulsory we should use flush();
 * bcoz data is not stored in temp ,it stored inside that ram of anywhere
 * so make sure to use flush() then only all the data in sample will be 
 * go into sampleOut.txt file.
 */
public class IOFunctionalities 
{
	public static void main(String...args) throws IOException,FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("C:\\JavaIODemos\\input.txt");
		int temp;
		FileOutputStream fos=new FileOutputStream("C:\\JavaIODemos\\output.txt");
	
	   while((temp=fis.read())!=-1)
	   {
		   fos.write(temp);
	   }
	
	   FileReader fr=new FileReader("C:\\JavaIODemos\\Sample.txt");
		int temp1;
		FileWriter fos1=new FileWriter("C:\\JavaIODemos\\SampleOut.txt");
	
	   while((temp=fr.read())!=-1)
	   {
		   fos1.write(temp);
	   }
	
	   fos1.flush();
	}

}
