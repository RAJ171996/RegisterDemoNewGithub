package com.telus.automationsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegisterDemo {

	public WebDriver driver;

	// Declaring the all the input values in variables :-
	String firstNameValue = "Raj";
	String lastNameValue = "Kumar";
	String streetAddress = "Sector-15";
	String apartment = "A-117";
	String city = "Noida";
	String state = "Uttar Pradesh";
	String postalCode = "201301";
	String countryValueOne = "India";
	String email = "r.rajkumar1514@gmail.com";
	String dateOfDemo = "07/27/2022";
	String hourValue = "18";
	String minuteValue = "30";
	String mobileNumber = "9818922698";
	String enterYourQuery = "What is the Selenium Course fees?";
	String expMsg = "Registration Form is Successfully Submitted.";

	@Test(priority=1)
	public void launchApplication() {

		// Set the  system property for the ChromeBrowser :-
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		// Creating the instance of the ChromeDriver :-
		driver = new ChromeDriver();


		// Storing the application URl in the string variable :-
		String url = "https://nxtgenaiacademy.com/";

		// Launch the application :-
		driver.get(url);

		// Maximize the application
		driver.manage().window().maximize();


		System.out.println("The application is launched successfully");
		System.out.println("Git Configuration");
	}

	@Test(priority=2)
	public void navigateToRegistrationForm() {

		// Create the instance of Actions class by passing the WebDriver instance :-
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the qaAutomation :-
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));
		if(qaAutomation.isDisplayed()) {
			action.moveToElement(qaAutomation).perform();
			System.out.println("The mouse hover action move to QA AUTOMATION displayed");
		}
		else
		{
			System.out.println("The mouse hover action move to QA AUTOMATION is not displayed");
		}

		// Performing the mouse hover action on the practiceAutomation :-
		WebElement pracAutomation = driver.findElement(By.linkText("Practice Automation"));
		if(pracAutomation.isDisplayed()) {
			action.moveToElement(pracAutomation).perform();
			System.out.println("The mouse hover action move to Practice Automation is displayed");
		}
		else
		{
			System.out.println("The mouse hover action move to Practice Automation is not displayed");
		}

		// Click on Registration Form :-
		WebElement registrationForm = driver.findElement(By.partialLinkText("Registration Form"));
		if(registrationForm.isDisplayed()) {
			registrationForm.click();
			System.out.println("The Registration Form is clicked");
		}
		else
		{
			System.out.println("The Registration Form is not clicked");
		}

		System.out.println("The registration form is loaded successfully");
	}

	@Test(priority=3)
	public void userRegisterDemo() {

		// Declaring the WebElement object :-
		WebElement firstNameLocator = driver.findElement(By.id("vfb-5"));
		WebElement lastNameLocator = driver.findElement(By.id("vfb-7"));
		WebElement maleRadioButtonLocator = driver.findElement(By.id("vfb-8-1"));
		WebElement streetAddressLocator = driver.findElement(By.id("vfb-13-address"));
		WebElement apartmentLocator = driver.findElement(By.id("vfb-13-address-2"));
		WebElement cityLocator  = driver.findElement(By.id("vfb-13-city"));
		WebElement stateLocator = driver.findElement(By.id("vfb-13-state"));
		WebElement postalCodeLocator = driver.findElement(By.id("vfb-13-zip"));
		WebElement countryDropDownLocator = driver.findElement(By.id("vfb-13-country"));
		WebElement emailLocator = driver.findElement(By.id("vfb-14"));
		WebElement dateOfDemoLocator = driver.findElement(By.id("vfb-18"));
		WebElement hourValueLocator = driver.findElement(By.id("vfb-16-hour"));
		WebElement minuteValueLocator = driver.findElement(By.id("vfb-16-min"));
		WebElement mobileNumberLocator = driver.findElement(By.id("vfb-19"));
		WebElement seleniumChkBoxLocator = driver.findElement(By.id("vfb-20-0"));
		WebElement testNGChkBoxLocator = driver.findElement(By.id("vfb-20-2"));
		WebElement enterYourQueryLocator = driver.findElement(By.id("vfb-23"));
		WebElement verificationCodeLocator = driver.findElement(By.xpath("//label[normalize-space()='Example: 99']"));
		WebElement verificationInputDigitLocator = driver.findElement(By.id("vfb-3"));
		WebElement submitButtonLocator = driver.findElement(By.id("vfb-4"));

		// Verify the first name is displayed or not :-
		if(firstNameLocator.isDisplayed()) {
			System.out.println("The First Name is displayed");

		}
		else
		{
			System.out.println("The First Name is not displayed");
		}
		// Verify the first name is enabled or not :-
		if(firstNameLocator.isEnabled()) {
			System.out.println("The First Name is enabled");
			// Enter the first name value for sendKeys :-
			firstNameLocator.sendKeys(firstNameValue);
			System.out.println("The First Name is " + firstNameValue);

		}
		else
		{
			System.out.println("The First Name is not enabled");
		}


		// Verify the lastName is displayed or not :-
		if(lastNameLocator.isDisplayed()) {
			System.out.println("The Last Name is displayed");

		}
		else
		{
			System.out.println("The Last Name is not displayed");

		}
		if(lastNameLocator.isEnabled()) {
			System.out.println("The Last Name is enabled");
			// Enter the last name value for sendKeys :-
			lastNameLocator.sendKeys(lastNameValue);
			System.out.println("The Last Name is " + lastNameValue);
		}
		else
		{
			System.out.println("The last name is not enabled");
		}


		// Verify Male Radio Button is displayed or not :-
		if(maleRadioButtonLocator.isDisplayed()) {
			System.out.println("The male radio button is displayed");
		}
		else
		{
			System.out.println("The male radio button is not displayed");
		}
		// Verify the male radio button is enabled or not :-
		if(maleRadioButtonLocator.isEnabled()) {
			System.out.println("The male radio button is enabled");
		}
		else
		{
			System.out.println("The male radio button is not enabled");
		}

		// Verify Male Radio button is selected or not
		if(maleRadioButtonLocator.isSelected()) {
			System.out.println("The male radio button is selected");

		}
		else
		{
			System.out.println("The male radio button is not selected");
			// Click on male radio button :-
			maleRadioButtonLocator.click();
			System.out.println("The male radio button is clicked");
		}

		// Verify StreetAddress is displayed or not :-
		if(streetAddressLocator.isDisplayed()) {
			System.out.println("The street address is displayed = " + streetAddress);
			streetAddressLocator.sendKeys(streetAddress);
		}
		else
		{
			System.out.println("The street address is not displayed");

		}

		// Verify the apartment is displayed or not :-

		if(apartmentLocator.isDisplayed()) {
			System.out.println("The apartment is displayed = " + apartment);
			apartmentLocator.sendKeys(apartment);
		}
		else
		{
			System.out.println("The apartment is not displayed");
		}

		// Verify the city is displayed or not :-


		if(cityLocator.isDisplayed()) {
			System.out.println("The city is displayed = " + city);
			cityLocator.sendKeys(city);
		}
		else
		{
			System.out.println("The city is not displayed");
		}

		// Verify the state is displayed or not :-

		if(stateLocator.isDisplayed()) {
			System.out.println("The state is displayed = " + state);
			stateLocator.sendKeys(state);
		}
		else
		{
			System.out.println("The state is not displayed");
		}

		// Verify the Postal Code is displayed or not :-


		if(postalCodeLocator.isDisplayed()) {
			System.out.println("The postal code is displayed");
			postalCodeLocator.sendKeys(postalCode);
		}
		else
		{
			System.out.println("The postal code is not displayed");
		}

		// Verify the country drop down is displayed or not :-


		if(countryDropDownLocator.isDisplayed()) {
			System.out.println("The country drop down is displayed");

		}
		else
		{
			System.out.println("The country drop down is not displayed");
		}
		// Verify the country drop down is enabled or not :-

		if(countryDropDownLocator.isEnabled()) {
			System.out.println("The country drop down is enabled");
		}
		else
		{
			System.out.println("The country drop down is not enabled");
		}
		// Create the select object to select value from country drop down :-
		Select cDropDown = new Select(countryDropDownLocator);

		if(countryDropDownLocator.isEnabled()) {
			// Select by VisibleText :-
			cDropDown.selectByVisibleText(countryValueOne);
			System.out.println(" The country is selected = " + countryValueOne);

		}
		else
		{
			System.out.println("The country drop down is not enabled");
		}

		// Verify the email is displayed or not :-
		if(emailLocator.isDisplayed()) {
			System.out.println("The email is displayed = " + email );
			emailLocator.sendKeys(email);
		}
		else
		{
			System.out.println("The email is not displayed");
		}

		// Verify the date of demo is displayed or not :-
		if(dateOfDemoLocator.isDisplayed()) {
			System.out.println("The date of demo is displayed = " + dateOfDemo);
			dateOfDemoLocator.sendKeys(dateOfDemo);
		}
		else
		{
			System.out.println("The date of demo is not displayed");
		}

		// Verify the hour value is displayed or not :-
		if(hourValueLocator.isDisplayed()) {
			System.out.println("The hour value is displayed = " + hourValue);
			hourValueLocator.sendKeys(hourValue);
		}
		else
		{
			System.out.println("The hour value is not displayed");

		}

		// Verify the minute value is displayed or not :-
		if(minuteValueLocator.isDisplayed()) {
			System.out.println("The minute value is displayed = " + minuteValue);
			minuteValueLocator.sendKeys(minuteValue);
		}
		else
		{
			System.out.println("The minute value is not displayed");

		}

		// Verify the mobile number is displayed or not :-
		if(mobileNumberLocator.isDisplayed()) {
			System.out.println("The mobile number is displayed = " + mobileNumber);
			mobileNumberLocator.sendKeys(mobileNumber);

		}
		else
		{
			System.out.println("The mobile number is not displayed");
		}

		// Verify the seleniumWebdriver check box is displayed or not :-
		if(seleniumChkBoxLocator.isDisplayed()) {
			System.out.println("The SeleniumWebdriver check box is displayed");

		}
		else
		{
			System.out.println("The SeleniumWebdriver check box is not displayed");
		}

		//  Verify SeleniumWebDriver check box option is selected or not :-
		if(seleniumChkBoxLocator.isSelected()) {
			System.out.println("The SeleniumWebdriver check box is selected");
		}
		else
		{
			System.out.println("The SeleniumWebdriver check box is not selected");
			seleniumChkBoxLocator.click();
			System.out.println("The SeleniumWebdriver check box is clicked");
		}
		//
		// Verify the testNG check box is displayed or not :-
		if(testNGChkBoxLocator.isDisplayed()) {
			System.out.println("The TestNg check box is displayed");

		}
		else
		{
			System.out.println("The TestNG check box is not displayed");
		}

		//  Verify testNG check box option is selected or not :-
		if(testNGChkBoxLocator.isSelected()) {
			System.out.println("The TestNG check box is selected");
		}
		else
		{
			System.out.println("The TestNG check box is not selected");
			testNGChkBoxLocator.click();
			System.out.println("The TestNG check box is clicked");
		}

		// Verify the enter your query is displayed or not :-
		if(enterYourQueryLocator.isDisplayed()) {
			System.out.println("The enter your query is displayed = " + enterYourQuery);
			enterYourQueryLocator.sendKeys(enterYourQuery);
		}
		else
		{
			System.out.println("The enter your query is not displayed");
		}

		// Verification of two digit code :-

		String codeValue = verificationCodeLocator.getText();
		String arrCodeValue[] = codeValue.split(":");
		String trimCodeValue = arrCodeValue[1].trim();

		if(verificationInputDigitLocator.isDisplayed()) {
			verificationInputDigitLocator.sendKeys(trimCodeValue);
			System.out.println("The two digit verification is displayed = " + trimCodeValue);
		}
		else
		{
			System.out.println("The two digit verification is not displayed");
		}

		//  Verify the Submit button is displayed or not :-
		if(submitButtonLocator.isDisplayed()) {
			System.out.println("The sumbit button is displayed");

		}
		else
		{
			System.out.println("The submit button is not displayed");
		}

		// Verify the Submit Button is enabled or not :-
		if(submitButtonLocator.isEnabled()) {
			System.out.println("The submit button is enabled");
			//Click on submit button :-
			submitButtonLocator.click();
			System.out.println("The submit button is clicked");
		}
		else
		{
			System.out.println("The submit button is not enabled");


		}

		System.out.println("The user is registered");
	}

	@Test(priority=4)
	public void validationOfsuccessfulMsg() {

		// Validation for successful registration :-
		// Create the WebElement object for successful registration message :-
		WebElement registrationSuccessMsgLocator = driver.findElement(By.className("elementor-shortcode"));

		// By retrieving the actual successful registration message :-
		String actMsg = registrationSuccessMsgLocator.getText();
		String arrActMsg[] = actMsg.split(":");
		String trimArrActMsg = arrActMsg[1].trim();

		// Verify the successful registration message :-
		if(registrationSuccessMsgLocator.isDisplayed()) {
			System.out.println("The successful registration message is displayed");

		}
		else
		{
			System.out.println("The successful registration message is not displayed");
		}

		// By using contains method check the Actual and Expected Message :-

		if(actMsg.contains(expMsg)) {

			System.out.println("The Actual message is = " + actMsg);
			System.out.println("The Expected message is = " + expMsg);
			System.out.println("The Transaction ID : " + trimArrActMsg);
		}
		else
		{
			System.out.println("The registration form is not sumbitted successfully");

		}
		System.out.println("The registration form is submitted successfully");
	}

	@Test(priority=5)
	public void closeApplication() {

		// Close the application :-
		driver.close();
		System.out.println("The application is closed successfully");

	}

}
