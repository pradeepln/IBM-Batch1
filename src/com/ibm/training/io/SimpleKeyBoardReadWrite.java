package com.ibm.training.io;

import java.io.IOException;

public class SimpleKeyBoardReadWrite {

	public static void main(String[] args) throws IOException {
		System.out.println("Type something :) ");
				
		try {
			while(true) {
				int aByte = System.in.read();
				if(aByte == 13) {
					break;
				}
				System.out.write(aByte);
			}
			System.out.flush();
//			System.out.println("");
		}catch (IOException e) {
			System.out.println("Something strange happened...can't read from keyboard? lolz...");
		}
	}

}
