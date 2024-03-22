package com.struts.ex.actions;

import com.struts.ex.service.TutorialFinderService;

public class TutorialAction {
	
	private String bestTutorial;
	private String language;
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String execute(){ 
		
		System.out.println("Hello from execute...");
		TutorialFinderService tfs = new TutorialFinderService();
		// Good practice
		setBestTutorial(tfs.getBestTutorial(getLanguage()));
		// Below is also possible but bad practice
		// bestTutorial = tfs.getBestTutorial();
		System.out.println("Best tutorial is :: "+bestTutorial);
		System.out.println(getLanguage());
	    return "success";  
	}
	
	public String someOtherMethod()
	{
		System.out.println("Hello from someOtherMethod...");
		return "success";
	}
	
	public String getTutorial()
	{
		System.out.println("Hello from getTutorial...");
		return "success";
	}
	
	public String addTutorial()
	{
		System.out.println("Hello from addTutorial...");
		return "success";
	}

	public String getBestTutorial() {
		return bestTutorial;
	}

	public void setBestTutorial(String bestTutorial) {
		this.bestTutorial = bestTutorial;
	} 
	

}
