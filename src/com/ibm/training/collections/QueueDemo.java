package com.ibm.training.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	Queue<Object> q = new LinkedList<>();
	
	public void pollNetworkForData() {
		//connect to external service and get a piece of data and put it into buffer
		Object aPieceOfData = new Object();
		q.offer(aPieceOfData);
		
	}
	
	public void processAPieceOfData() {
		//pick up one piece from buffer and process it
		Object aPiece = q.poll();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
