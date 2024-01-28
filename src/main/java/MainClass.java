import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.Select;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MainClass {

    public static void main(String[] args) {

//        ChromeOptions co = new ChromeOptions();
//        co.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, PageLoadStrategy.NONE);
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        PracticeForm practiceForm = new PracticeForm(driver);
        practiceForm.pickSportsCheckBox();
        practiceForm.pickMusicCheckBox();
        practiceForm.pickReadingCheckBox();
        practiceForm.enterFirstName("Alex");
        practiceForm.enterLastName("Test");

        practiceForm.enterState(1);
        practiceForm.enterCity(1);
//
//        practiceForm.enterEmail("some@example.com");
//
//        practiceForm.chooseGender("Male");
//        practiceForm.enterNumber("1234567890");
//        practiceForm.enterDateOfBirth(2, 108);
//        practiceForm.enterSubject("Physics");
//        practiceForm.inputPicture("D:\\DROP0\\Важное\\IT\\Java\\pic1.jpg");
//        practiceForm.enterState(2);
//        practiceForm.enterCity(1);
//        practiceForm.clickSubmitButton();
//        System.out.println(practiceForm.getResultHeading());
//        System.out.println(practiceForm.getFullNameResult());
//        System.out.println(practiceForm.getEmailResult());
//        System.out.println(practiceForm.getNumberResult());
//        System.out.println(practiceForm.getDateOfBirthResult());
//        System.out.println(practiceForm.getSubjectResult());
//        System.out.println(practiceForm.getPictureNameResult());
//        System.out.println(practiceForm.getStateAndCityResult());
    }
}
