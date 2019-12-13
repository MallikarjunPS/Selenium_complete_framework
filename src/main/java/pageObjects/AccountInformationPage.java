package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountInformationPage 
{
 
  @FindBy(xpath="//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")
  private WebElement accountInformationLink;
  
  @FindBy(id="firstname")
  private WebElement firstNameTextBox;
  
  @FindBy(id="lastname")
  private WebElement lastNameTextBox;
  
  @FindBy(id="change-password")
  private WebElement changePasswordCheckBox;
  
  @FindBy(name="sbphnumber")
  private WebElement mobileTextBox;
  
  @FindBy(id="current-password")
  private WebElement currentPasswordTextBox;
  
  @FindBy(id="password")
  private WebElement passwordTextBox;
  
  @FindBy(id="password-confirmation")
  private WebElement confirmationPasswordTextBox;
  
  @FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[1]/a")
  private WebElement viewAllMyDash;
  
  @FindBy(xpath="//*[@id=\"my-orders-table\"]/tbody/tr/td[6]/a[1]")
  private WebElement viewOrderMyDash;
  
  @FindBy(xpath="//*[@id=\"my-orders-table\"]/tbody/tr/td[6]/a[2]/span")
  private WebElement reorderMyDash;
  
  @FindBy(xpath="//*[@id=\"form-validate\"]/div/div[1]/button")
  private WebElement saveButton;
  
  @FindBy(id="firstname-error")
  private WebElement firstNameErrorMsg;
  
  @FindBy(id="lastname-error")
  private WebElement lastNameErrorMsg;
  
  @FindBy(id="current-password-error")
  private WebElement currentPasswordErrorMsg;
  
  @FindBy(id="password-error")
  private WebElement newPasswordErrorMsg;
  
  @FindBy(id="password-confirmation-error")
  private WebElement confirmtionNewPasswordErrorMsg;
  
  @FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/div[2]/div[1]/div")
  private WebElement currentErrorMsg2;
  
  @FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/div[2]/div[1]/div")
  private WebElement successfullAccountInfoMsg;
  
  
  
  
  public  AccountInformationPage(WebDriver driver)
  {
	PageFactory.initElements(driver, this);  
  }
  
  public void ClickOnAccountInformationLink()
  {
	  accountInformationLink.click();
	  
  }
  
  public void setFirstNameTextBox(String s)
  {
	  firstNameTextBox.sendKeys(s);
	  
  }
  
  public void setLastNameTextBox(String s)
  {
	  lastNameTextBox.sendKeys(s);
  }
  
  public void selectChangePasswordCheckBox()
  {
	  changePasswordCheckBox.click();
  }
  
  public void setMobileTextBox(String s)
  {
	  mobileTextBox.sendKeys(s);
  }

  public void setCurrentPasswordTextBox(String s)
  {
	  currentPasswordTextBox.sendKeys(s);
  }
  
  public void setNewPasswordTextBox(String s)
  {
	  passwordTextBox.sendKeys(s);
  }
  
  public void setConfirmationPasswordText(String s)
  {
	  confirmationPasswordTextBox.sendKeys(s);
  }
  
  public void clearFirstNameTextBox()
  {
	  firstNameTextBox.clear();
  }
  
  public void clearLastNameTextBox()
  {
	  lastNameTextBox.clear();
  }
  
  public void clearMobileTextBox()
  {
	  mobileTextBox.clear();
  }
  
  public void clearCurrentPasswordTextBox()
  {
	  currentPasswordTextBox.clear();
  }
  
  public void clearPasswordTextBox()
  {
	  passwordTextBox.clear();
  }
  
  public void clearConfirmationPasswordTextBox()
  {
	  confirmationPasswordTextBox.clear();
  }
  
  public void clickOnSaveButton()
  {
	  saveButton.click();
  }

 public void clickOnViewAll()
 {
	viewAllMyDash.click();
 }
 
 public void clickOnViewOrder()
 {
	 viewOrderMyDash.click();
 }
 
 public void clickOnReorder()
 {
	 reorderMyDash.click();
 }
 
 
 public void verifyFirstNameErrorMsg()
 {
	 if(firstNameErrorMsg.getText().equals("This is a required field."))
	 {
		 System.out.println("FirstName Text Error Msg is PASS");
		
	 }
	 
	 else
	 {
		 System.out.println("FirstName Text Error Msg is FAIL");
	 }
	 
 }
 
 public void verifyLastNameErrorMsg()
 {
	 if(lastNameErrorMsg.getText().equals("This is a required field."))
	 {
		 System.out.println("LastName Text Error Msg is PASS");
		
	 }
	 
	 else
	 {
		 System.out.println("LastName Text Error Msg is FAIL");
	 }
	 
 }
 
 public void verifyCurrentPasswordErrorMsg()
 {
	 if(currentPasswordErrorMsg.getText().equals("This is a required field."))
	 {
		 System.out.println("Current Password Text Error Msg is PASS"+" "+currentPasswordErrorMsg.getText());
		
	 }
	 
	 else if(currentErrorMsg2.getText().equals("The password doesn't match this account."))
	 {
		 System.out.println("Current Password Text Error Msg is PASS"+" "+currentErrorMsg2.getText());
	 }
	 
 }
 
 
 public void verifyNewPasswordErrorMsg()
 {
	 if(newPasswordErrorMsg.getText().equals("This is a required field.")||
			 newPasswordErrorMsg.getText().equals("Minimum length of this field must be equal or greater than 8 symbols. Leading and trailing spaces will be ignored.")||
			 newPasswordErrorMsg.getText().equals("Minimum of different classes of characters in password is 3. Classes of characters: Lower Case, Upper Case, Digits, Special Characters."))
	 {
		 System.out.println("NewPassword Text Error Msg is PASS"+" "+newPasswordErrorMsg.getText());
		
	 }
	 
	 
	 else 
	 {
		 System.out.println("NewPassword Text Error Msg is FAIL"+" "+newPasswordErrorMsg.getText());
	 }
 }

 
 public void verifyConfirmPasswordErrorMsg()
 {
	 if(confirmtionNewPasswordErrorMsg.getText().equals("This is a required field.")|| confirmtionNewPasswordErrorMsg.getText().equals("Please enter the same value again."))
	 {
		 System.out.println("Confirmation Password Text Error Msg is PASS"+" "+confirmtionNewPasswordErrorMsg.getText());
		
	 }
	 
	 else 
	 {
		 System.out.println("Confirmation Password Text Error Msg is FAIL"+" "+confirmtionNewPasswordErrorMsg.getText());
	 }
	 
 }
 
 public void verifySuccessfullMsg()
 {
	 if(successfullAccountInfoMsg.getText().equals("You saved the account information."))
	 {
		 System.out.println("Account Information is PASS"+" "+successfullAccountInfoMsg.getText());
	 }
	 
	 else
	 {
		 System.out.println("Account Information is FAIL");
	 }
 }
 
 public void changePasswordIsVisible()
 {
	 if(mobileTextBox.isDisplayed()&&currentPasswordTextBox.isDisplayed()&& passwordTextBox.isDisplayed()&& confirmationPasswordTextBox.isDisplayed())
    {
           System.out.println("ChangePassword is PASS");	
    }
 
	 
	 else
	 {  
		 System.out.println("ChangePassword is FAIL");
		 
	 }
 }



}

