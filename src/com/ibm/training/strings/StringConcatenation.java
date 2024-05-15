package com.ibm.training.strings;

public class StringConcatenation {

	public static void main(String[] args) {
		
		String[] words = {"This","is","a","broken","sentence"};

		String sentence = formSentence(words);
		
		System.out.println(sentence);
	}

	private static String formSentence(String[] words) {
		//String sentence = "";
		StringBuilder buf = new StringBuilder(); //StringBuffer could also have been used here
		for(int i=0;i<words.length;i++) {
			buf.append(words[i]);
			buf.append(" ");
			//sentence = sentence.concat(words[i]+" "); //inefficient
			//sentence = sentence+words[i]+" ";
			//sentence += words[i]+" ";
		}
		return buf.toString();
		//return sentence;
	}

}
