package com.ibm.training.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
		default:
			System.out.println("Unknown Command.");
		}

	}

	private static void performCopy(String[] args) throws IOException {
		if(args.length >= 3) {
			File srcFile = new File(args[1]);
			File destFile = new File(args[2]);
			FileInputStream in = new FileInputStream(srcFile);
			FileOutputStream out = new FileOutputStream(destFile);
			int aByte;
			while((aByte = in.read()) != -1) {
				out.write(aByte);
			}
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
