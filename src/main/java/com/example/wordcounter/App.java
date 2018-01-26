package com.example.wordcounter;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Word Count Testing App!");
    }
    
    public static int wordcount(String s) {
    	
    	String[] splittedText = s.split("[\\n\\s.,!:;=]");
		ArrayList<String> words = new ArrayList<String>(); 
		
		for (int i = 0; i < splittedText.length; i++) {
			if (!splittedText[i].equals("")){
				words.add(splittedText[i]);
			}
		}
		
		//System.out.println(words.toString());
		
		return words.size();
    }
}
