import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
    @BeforeTest
    public void setup() {
        Selenium.setup();
    }
    @Test
    public void addRecord() {
        Selenium.addRecord("Filmas San");
    }
    @Test
    public void addBadRecord() {
        Selenium.addBadRecord("<???>");
    }
    @Test
    public void deleteRecord() {
        Selenium.deleteRecord("666");
    }
    @Test
    public void updateRecord() {
        Selenium.updateRecord("Laba", "Diena", "Ponas");
    }
    @Test
    public void updateBadRecord() {
        Selenium.updateBadRecord("<<<???>>>", "<<<????>>>", "<<<?????>>>");
    }
    @AfterTest
    public void close() {
        Selenium.close();
    }

}
