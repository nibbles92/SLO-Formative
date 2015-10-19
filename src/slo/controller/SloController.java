package slo.controller;

import slo.View.Popup;
import slo.View.SloDisplay;

public class SloController
{
	//Declaration Section
	private SloDisplay myDisplay;
	private Popup myPopup;
	private String name;
	private int family;
	private double age;
	private boolean haveafamily;
	
	
	
	public SloController()
	{
		name = "Dylan";
		family = 6;
		age = 17;
		haveafamily = true;
		
		myPopup = new Popup();
		myDisplay = new SloDisplay();
		
		
	}
	
	
	public void start()
	{
		String name = myPopup.getAnswer("Enter your name");
		
		myPopup.displayResponse("You typed in" + name);
		
		int family;
		String tempfamily = myPopup.getAnswer("How many people do you have in your family?");
		
		while(!isInteger(tempfamily))
		{
			tempfamily = myPopup.getAnswer("Type in a reasonable amount of people!");
		}
		if(isInteger(tempfamily))
		{
			family = Integer.parseInt(tempfamily);
		}
		else
		{
			family = -10000;
		}
		myPopup.displayResponse("You typed in" + family);
		double age;
		String tempage = myPopup.getAnswer("How old are you?");
		
		while(isDouble(tempage))
		{
			tempage = myPopup.getAnswer("You are not that old");
		}
		if(isDouble(tempage))
		{
			age = Double.parseDouble((tempage));
		}
		else
		{
			age = -10000;
		}
		myPopup.displayResponse("You typed in " + age);
		boolean hasafamily;
		String temphasafamily = myPopup.getAnswer("Do you have a family?");
		
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int validInteger = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopup.displayResponse("You didnt type in a vaild interger");
		}
		return isInt;
	}
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double validDouble = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopup.displayResponse("You didnt type in a valid interger");
		}
		return isDouble;
	}
	
}
