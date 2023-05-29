package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.Loggerload;
import com.utils.Utils;

public class LinkedListPage {
	public LinkedListPage(WebDriver webDriver) {

		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath ="//h5[text()='Linked List']/..//a[text()='Get Started']")
	WebElement getStartedBtn;

	@FindBy(xpath ="//a[text()='Introduction']")
	WebElement introductionLink;

	/*@FindBy(xpath ="//a[text()='Try here>>>']")
		WebElement tryHereBtn; */

	@FindBy(xpath ="//form/div/div/div/textarea")
	WebElement textEditor;

	@FindBy(xpath ="//button[text()='Run']")
	WebElement runBtn;

	@FindBy(xpath ="//a[text()='Creating Linked LIst']")
	WebElement creatingLinkListLink;

	@FindBy(xpath = "//a[text()='Types of Linked List']")
	WebElement typesOfLinkedListLink;

	@FindBy(xpath = "//a[text()='Implement Linked List in Python']")
	WebElement implementLLInPython;

	@FindBy(xpath = "//a[text()='Traversal']")
	WebElement traversalLL;

	@FindBy(xpath = "//a[text()='Insertion']")
	WebElement insertionLL;

	@FindBy(xpath = "//a[text()='Deletion']")
	WebElement deletionLL;	


	public void clickGetStarted() {
		Loggerload.info("Click on LinkedList "+ getStartedBtn.getText()+ " button");
		Utils.webClick(getStartedBtn);
	}

	public void clickRunBtn() {
		Loggerload.info("Click on LinkedList "+ runBtn.getText()+ " button");
		Utils.webClick(runBtn);
	}

	public void clickIntroductionLink() {
		Loggerload.info("Click on LinkedList "+ introductionLink.getText()+ " link");
		Utils.webClick(introductionLink);
	}

	/*public void clickTryHereBtn() {
		Utils.webClick(tryHereBtn); 
		}*/

	public void enterCode(String pythonCode) throws InterruptedException {
		Loggerload.info("sending text on "+ textEditor.getText()+ " input field");
		Utils.enterPythonCode(textEditor, pythonCode);
	} 

	public void clickCreatingLinkedListLink() {
		Loggerload.info("Click on LinkedList "+ creatingLinkListLink.getText()+ " link");
		Utils.webClick(creatingLinkListLink);
	}

	//		public void enterCodeLL() {
	//			textEditor.sendKeys("print\" creating linkedList  \"");
	//		}


	public void clickTypesOfLinkedListLink() {
		Loggerload.info("Click on LinkedList "+ typesOfLinkedListLink.getText()+ " link");
		Utils.webClick(typesOfLinkedListLink);
	}

	//		public void enterCodeTypesOfLL(String pythonCode) throws InterruptedException {
	//			Thread.sleep(2000);
	//			textEditor.sendKeys(pythonCode);
	//			
	//		}

	public void clickImplementLLInPythonLink() {
		Loggerload.info("Click on LinkedList "+ implementLLInPython.getText()+ " link");
		Utils.webClick(implementLLInPython);
	}

	//		public void enterCodeTypesOfImplementLL() {
	//			textEditor.sendKeys("print\" Implement Linked List in Python  \"");
	//		}

	public void clickTraversalLink() {
		Loggerload.info("Click on LinkedList "+ traversalLL.getText()+ " link");
		Utils.webClick(traversalLL);
	}

	//		public void enterCodeTraversalLL() {
	//			textEditor.sendKeys("print\" Traversal Linked List  \"");
	//		}

	public void clickInsertionLink() {
		Loggerload.info("Click on LinkedList "+ insertionLL.getText()+ " link");
		Utils.webClick(insertionLL);
	}

	//		public void enterCodeInsertionLL() {
	//			textEditor.sendKeys("print\" Insertion Linked List  \"");
	//		}

	public void clickDeletionLink() {
		Loggerload.info("Click on LinkedList "+ deletionLL.getText()+ " link");
		Utils.webClick(deletionLL);
	}

	//		public void enterCodeDeletionLL() {
	//			textEditor.sendKeys("print\" Deletion Linked List  \"");
	//		}

	/*
		public void enterCode(String pythonCode) {
				//textEditor.sendKeys("print\" hello its done\"");
			Utils.webSendKeys(textEditor, pythonCode);
		}*/
}
