import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    static WebDriver browser;

    public static void setup() {
        System.setProperty("webdriver.chrome.driver",
                "webdrivers/chromedriver.exe");

        browser = new ChromeDriver();
        browser.get(" http://algirdaskuslys.000webhostapp.com/selenium/filmai.php");
    }

    public static void close() {
        browser.close();
    }

    public static void addRecord(String keyword1, String keyword2, String keyword3) {
        WebElement titleField = browser.findElement(By.name("pavadinimas"));
        WebElement genreField = browser.findElement(By.name("zanras"));
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        titleField.sendKeys(keyword1);
        genreField.sendKeys(keyword2);
        directorField.sendKeys(keyword3);
        directorField.sendKeys(Keys.ENTER);
    }

    public static void addBadRecord(String keyword1, String keyword2, String keyword3) {
        WebElement titleField = browser.findElement(By.name("pavadinimas"));
        WebElement genreField = browser.findElement(By.name("zanras"));
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        titleField.sendKeys(keyword1);
        genreField.sendKeys(keyword2);
        directorField.sendKeys(keyword3);
        directorField.sendKeys(Keys.ENTER);
    }

    public static void deleteRecord(String keyword) {
        WebElement idField = browser.findElement(By.name("id"));
        WebElement deleteButton = browser.findElement(By.name("delete"));
        idField.sendKeys(keyword);
        deleteButton.sendKeys(keyword);
        deleteButton.sendKeys(Keys.ENTER);
    }

    public static void updateRecord(String keyword0, String keyword1, String keyword2, String keyword3) {
        WebElement idField = browser.findElement(By.name("id"));
        WebElement titleField = browser.findElement(By.name("pavadinimas"));
        WebElement genreField = browser.findElement(By.name("zanras"));
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        WebElement updateButton = browser.findElement(By.name("update"));
        idField.sendKeys(keyword0);
        titleField.sendKeys(keyword1);
        genreField.sendKeys(keyword2);
        directorField.sendKeys(keyword3);
        updateButton.sendKeys(Keys.ENTER);
    }

    public static void updateBadRecord(String keyword0, String keyword1, String keyword2, String keyword3) {
        WebElement idField = browser.findElement(By.name("id"));
        WebElement titleField = browser.findElement(By.name("pavadinimas"));
        WebElement genreField = browser.findElement(By.name("zanras"));
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        WebElement updateButton = browser.findElement(By.name("update"));
        idField.sendKeys(keyword0);
        titleField.sendKeys(keyword1);
        genreField.sendKeys(keyword2);
        directorField.sendKeys(keyword3);
        updateButton.sendKeys(Keys.ENTER);
    }

    public static void main(String args[]) {
        System.out.println("Maven + Selenium + TestNg");
    }
}
