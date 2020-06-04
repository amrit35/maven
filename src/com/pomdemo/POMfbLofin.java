package com.pomdemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.AutoConstant;
import com.generics.BasePage;
import com.generics.ExcelLibraryDemo;

public class POMfbLofin extends BasePage implements AutoConstant
{
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstnameTextField;
	@FindBy(xpath  ="//input[@name='lastname']")
	private WebElement surnameTextField;
	@FindBy(xpath  ="//input[@name='reg_email__']")
	private WebElement mobileOrEmailTextField;
	@FindBy(xpath  ="//input[@name='reg_email_confirmation__']")
	private WebElement confirmMobileOrEmailTextField;
	@FindBy(xpath  ="//input[@name='reg_passwd__']")
	private WebElement passwordTextField;
	@FindBy(xpath  ="//select[@name='birthday_day']")
	private WebElement dateTextfield;
	@FindBy(xpath  ="//select[@name='birthday_month']")
	private WebElement monthTextField;
	@FindBy(xpath  ="//select[@name='birthday_year']")
	private WebElement yearTextField;
	@FindBy(xpath  ="//input[@value='1']")
	private WebElement femaleRadioButten;
	@FindBy(xpath  ="//input[@value='2']")
	private WebElement maleRadioButten;
	@FindBy(xpath  ="//input[@value='-1']")
	private WebElement customRadioButton;
	@FindBy(xpath  ="//button[@name='websubmit']")
	private WebElement signupButton;
	@FindBy(xpath="//a[.='Create a Page']")
	private WebElement createpageLink;
	
	public POMfbLofin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void signupMethod() throws InterruptedException, IOException 
	{
	
firstnameTextField.sendKeys(ExcelLibraryDemo.getcellvalue(excelpath, sheetname, 1, 0));
surnameTextField.sendKeys(ExcelLibraryDemo.getcellvalue(excelpath, sheetname, 1, 1));
mobileOrEmailTextField.sendKeys(ExcelLibraryDemo.getcellvalue(excelpath, sheetname, 1, 4));
Thread.sleep(5000);
confirmMobileOrEmailTextField.sendKeys(ExcelLibraryDemo.getcellvalue(excelpath, sheetname, 1, 4));
passwordTextField.sendKeys(ExcelLibraryDemo.getcellvalue(excelpath, sheetname, 1, 3));
selectbyvisibleText(dateTextfield, "26");
selectbyvisibleText(monthTextField, "Mar");
selectbyvisibleText(yearTextField, "1995");
maleRadioButten.click();
//signupButton.click();
}
}


