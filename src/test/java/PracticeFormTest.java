import org.checkerframework.checker.units.qual.C;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PracticeFormTest {
    private WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--disable-infobars"));

    private PracticeForm practiceForm;

    private String firstName = "Student";
    private String lastName = "Test";
    private String email = "some@example.com";
    private String genderType = "Male";
    private String number = "1234567890";

//    private String number() {
//        Random random = new Random();
//        long randomNumber = random.nextLong(9999999999L) + 1000000000L;
//        return Long.toString(randomNumber);
//    }
    private int monthNumber = 2;
    private int yearNumber = 108;
    private String subjectName = "Physics";
    private String currentAddress = "New York";
    private String pathToPicture = "D:\\DROP0\\Важное\\IT\\Java\\pic1.jpg";
    private int stateVariantNumber = 1;
    private int cityVariantNumber = 1;



    @Before
    public void setUp() {
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        practiceForm = new PracticeForm(driver);
    }

    @Test
    public void validFormCompletion(){
        PracticeForm practiceForm1 = practiceForm.enterPracticeForm(firstName, lastName, email, genderType, number, monthNumber, yearNumber,
              subjectName, currentAddress, pathToPicture, stateVariantNumber, cityVariantNumber);
        Assert.assertEquals("Thanks for submitting the form", practiceForm.getResultHeading());
        Assert.assertEquals(firstName +" " +lastName, practiceForm.getFullNameResult());
        Assert.assertEquals(email, practiceForm.getEmailResult());
        Assert.assertEquals(genderType, practiceForm.getGenderResult());
        Assert.assertEquals(number, practiceForm.getNumberResult());
        Assert.assertEquals("16 February,2007", practiceForm.getDateOfBirthResult());
        Assert.assertEquals(subjectName, practiceForm.getSubjectResult());
        Assert.assertEquals("pic1.jpg", practiceForm.getPictureNameResult());
        Assert.assertEquals(currentAddress, practiceForm.getAddressResult());
        Assert.assertEquals("Uttar Pradesh Lucknow", practiceForm.getStateAndCityResult());
    }


//    @After
//    public void after() {
//        driver.quit();
//    }
}


