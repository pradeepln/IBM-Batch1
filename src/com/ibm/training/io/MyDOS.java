package com.ibm.training.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class MyDOS {

	public static void main(String[] args) throws IOException {
		String command = args[0];
		
		switch(command) {
		case "dir":
			performDir(args);
			break;
		case "copy":
			performCopy(args);
			break;
		case "type":
			performType(args);
			break;
		default:
			System.out.println("Unknown Command.");
		}

	}

	private static void performType(String[] args) throws IOException {
		if(args.length < 2) {
			System.out.println("Usage:\ntype <filename>");
			return;
		}
		
		try(BufferedReader in = new BufferedReader(new FileReader(args[1]))){
			String line;
			while((line = in.readLine()) != null) {
				System.out.println(line);
			}
		}
		
	}

	private static void performCopy(String[] args) throws IOException  {
		long start = System.currentTimeMillis();
		if(args.length >= 3) {
			File srcFile = new File(args[1]);
			File destFile = new File(args[2]);

//			FileInputStream in = new FileInputStream(srcFile);
//			FileOutputStream out = new FileOutputStream(destFile);
			
			try(
					BufferedInputStream bufIn = new BufferedInputStream(new FileInputStream(srcFile));
					BufferedOutputStream bufOut = new BufferedOutputStream(new FileOutputStream(destFile));
				) {
				
				int aByte;
	//			while((aByte = in.read()) != -1) {
	//				out.write(aByte);
	//			}
				
				while((aByte = bufIn.read()) != -1) {
					bufOut.write(aByte);
				}
			
				//bufOut.flush(); //no need to flush if .close is being called
			}
		
			
			long end = System.currentTimeMillis();
			System.out.println("Copying took "+(end - start)+" ms.");
		}else {
			System.out.println("Usage:\ncopy <srcFile> <destFile>");
		}
		
	}

	private static void performDir(String[] args) {
		String folderName = ".";
		if(args.length > 1) {
			folderName = args[1];
		}
		File folder = new File(folderName);
		if(folder.exists() && folder.isDirectory()) {
			String[] contents = folder.list();
			for(int i=0;i<contents.length;i++) {
				System.out.println(contents[i]);
			}
		}
	}

}
