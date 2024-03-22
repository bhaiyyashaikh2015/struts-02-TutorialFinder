package com.struts.ex.service;

public class TutorialFinderService {
	
	public String getBestTutorial(String language) {
		System.out.println("Business service executed...");
		
		if(language.equals("java"))
		{
			return "Voicera-brains";
		}
		else
		{
			return "other tutorials are not available yet";
		}
	}

}
