package com.ibm.training.io;

import java.io.IOException;
import java.io.InputStream;

public class KeyBoardUtil {
	
	InputStream src;
	
	public KeyBoardUtil(InputStream src) {
		this.src = src;
	}
	
	public String readLine() throws IOException{
		StringBuilder buf = new StringBuilder();
		
		while(true) {
			int aByte = src.read();
			if(aByte == 13) {
				break;
			}
			buf.append(aByte);
			
		}
		
		return buf.toString();
	}

}
