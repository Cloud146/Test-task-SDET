import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeForm {
    private WebDriver driver;

    public PracticeForm(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input")
    private WebElement firstNameField;
    @FindBy(css = "#lastName")
    private WebElement lastNameField;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div[2]/input")
    private WebElement emailField;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[1]")
    private WebElement maleRadioButton;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[2]")
    private WebElement femaleRadioButton;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[3]")
    private WebElement otherRadioButton;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[4]/div[2]/input")
    private WebElement mobileNumberField;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div/div/input")
    private WebElement dateOfBirthField;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div[2]/div/div/div[1]")
    private WebElement subjectField;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[8]/div[2]/div/input")
    private WebElement sendPictureButton;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[9]/div[2]/textarea")
    private WebElement currentAddressField;
    @FindBy(id = "state")
    private WebElement stateDropDown;
    @FindBy(id = "city")
    private WebElement cityDropDown;
    @FindBy(id = "close-fixedban")
    private WebElement closeAD;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[11]/div/button")
    private WebElement submitButton;
    @FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div")
    private WebElement resultHeading;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[1]/td[2]")
    private WebElement fullNameText;
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[2]/td[2]")
    private WebElement emailText;
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[3]/td[2]")
    private WebElement genderText;
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[4]/td[2]")
    private WebElement numberText;
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[5]/td[2]")
    private WebElement dateOfBirthText;
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[6]/td[2]")
    private WebElement subjectText;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[7]/div[2]/div[1]")
    private WebElement sportsCheckBox;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[7]/div[2]/div[2]")
    private WebElement readingCheckBox;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[7]/div[2]/div[3]")
    private WebElement musicCheckBox;
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[8]/td[2]")
    private WebElement pictureNameText;
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[9]/td[2]")
    private WebElement addressText;
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/table/tbody/tr[10]/td[2]")
    private WebElement stateAndCityText;


    public PracticeForm enterFirstName(String firstName){
        firstNameField.sendKeys(firstName);
        return this;
    }

    public PracticeForm enterLastName(String lastName){
        lastNameField.sendKeys(lastName);
        return this;
    }


    public PracticeForm enterEmail(String email){
        emailField.sendKeys(email);
        return this;
    }

    public PracticeForm chooseGender(String genderType){
        switch (genderType){
            case "Male":
                maleRadioButton.click();
                break;
            case "Female":
                femaleRadioButton.click();
                break;
            case "Other":
                otherRadioButton.click();
                break;
        } return this;
    }

    public PracticeForm enterNumber(String number){
        mobileNumberField.sendKeys(number);
        return this;
    }


    public PracticeForm enterDateOfBirth(int monthNumber, int yearNumber){
        dateOfBirthField.click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[" +monthNumber +"]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[" +yearNumber +"]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[6]")).click();
        return this;
    }

    public PracticeForm enterSubject(String subjectName){
        Actions actions = new Actions(driver);
        actions.moveToElement(subjectField).click(subjectField).sendKeys(subjectName).sendKeys(Keys.ARROW_DOWN).moveToElement(subjectField).sendKeys(Keys.ENTER).build().perform();
        return this;
    }

    public PracticeForm pickSportsCheckBox(){
        sportsCheckBox.click();
        return this;
    }
    public PracticeForm pickReadingCheckBox(){
        readingCheckBox.click();
        return this;
    }
    public PracticeForm pickMusicCheckBox(){
        musicCheckBox.click();
        return this;
    }

    public PracticeForm inputPicture(String pathToPicture){
        sendPictureButton.sendKeys(pathToPicture);
        return this;
    }

    public PracticeForm enterCurrentAddress(String address){
        currentAddressField.sendKeys(address);
        return this;
    }

    public void hideAds(){
        if (closeAD.isDisplayed()) {
            closeAD.click();
        }
    }

    public PracticeForm enterState(int variantNumber) {
        if (!(stateDropDown.isDisplayed())){
            hideAds();
        }
        stateDropDown.click();
        //driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[10]/div[2]/div/div[2]/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"react-select-3-option-" +variantNumber +"\"]")).click();
        return this;
    }

    public PracticeForm enterCity(int variantNumber){
        if (!(cityDropDown.isDisplayed())){
            hideAds();
        }
        cityDropDown.click();
        driver.findElement(By.xpath("//*[@id=\"react-select-4-option-" +variantNumber +"\"]")).click();
        return this;
    }

    public PracticeForm clickSubmitButton(){
        Actions actions = new Actions(driver);
        submitButton.click();
        return this;
    }

    public PracticeForm enterPracticeForm(String firstName, String lastName,String email, String genderType,
                                          String number, int monthNumber, int yearNumber, String subjectName, String currentAddress, String pathToPicture,
                                          int stateVariantNumber, int cityVariantNumber){
        enterFirstName(firstName);
        enterLastName(lastName);
        enterEmail(email);
        chooseGender(genderType);
        enterNumber(number);
        enterDateOfBirth(monthNumber,yearNumber);
        enterSubject(subjectName);
        inputPicture(pathToPicture);
        enterCurrentAddress(currentAddress);
        enterState(stateVariantNumber);
        enterCity(cityVariantNumber);
        clickSubmitButton();
        return this;
    }

    public String getResultHeading(){
        return resultHeading.getText();
    }
    public String getFullNameResult(){
        return fullNameText.getText();
    }
    public String getEmailResult(){
        return emailText.getText();
    }
    public String getGenderResult(){
        return genderText.getText();
    }
    public String getNumberResult(){
        return numberText.getText();
    }
    public String getDateOfBirthResult(){
        return dateOfBirthText.getText();
    }
    public String getSubjectResult(){
        return subjectText.getText();
    }
    public String getPictureNameResult(){
        return pictureNameText.getText();
    }
    public String getAddressResult(){
        return addressText.getText();
    }
    public String getStateAndCityResult(){
        return stateAndCityText.getText();
    }

}


