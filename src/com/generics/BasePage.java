package com.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage 
{
	public void selectbyvisibleText(WebElement element, String text) 
	{
	
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
		
	}

	public void selectbyvisibleindex(WebElement element,int index)
	{
		Select sel=new Select(element);
				sel.deselectByIndex(index);
	}
	public void selectbyvalue(WebElement element, String value)
	{
		Select sel=new Select(element);
				sel.deselectByValue(value);
	}
	public void movetoelement(WebDriver driver, WebElement toElement)
	{
		Actions act=new Actions(driver);
		act.moveToElement(toElement);
	}

}
