package com.gqt.advance.java;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
public class FileIO 
{
	public static void main(String...args) throws IOException
	{
		String path="C:\\GQT\\Sample.txt";
		File f=new File(path);
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canRead());
		System.out.println(f.getParent());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getTotalSpace());
		System.out.println(f.getFreeSpace());
		System.out.println(f.getName());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.getCanonicalPath());
		
		FileReader fr=new FileReader(f);
		int temp;
		temp=fr.read();
		
		while(temp!=-1)
		{
			System.out.print((char)temp);
			temp=fr.read();
		}
		
		FileInputStream fis=new FileInputStream(f);
     //	int temp1=fis.read();
			FileOutputStream fos=new FileOutputStream("C:\\GQT1\\Output.txt");
			int temp1=fis.read();
     	//while((temp1=fis.read())!=-1)
     		while((temp1=fis.read())!=-1)
     	{
     		fos.write(temp);
     		//fis.read();
     	}
     	
		
	}

}
