import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class StepImplementation extends BaseTest{
        @Step("Hesabım butonuna tıkla")
        public void AccountInfoButton() throws InterruptedException {
            Thread.sleep(3000);
            MobileElement el1 = (MobileElement) appiumDriver.findElementByAccessibilityId("Hesabım");
            //element ismini appiumd
            el1.click();
            System.out.println("Elemente tıklandı  !!!!!!!");
            Thread.sleep(3000);
        }
        @Step("<key> id li elemente tıkla")
        public void clickBYid(String key){
            appiumDriver.findElement(By.id(key)).click();
        }
        @Step("<key> id li elemente <text>  değerini yaz")
        public void sendkeyBYid(String key,String text){
            appiumDriver.findElement(By.id(key)).sendKeys(text);
        }
        @Step("<key> xpath li elemente tıkla")
        public void clickBYxpath(String key){
            appiumDriver.findElement(By.xpath(key)).click();
        }
        @Step("<key> xpath li elemente <text>  değerini yaz")
        public void sendkeyBYxpath(String key,String text){
            appiumDriver.findElement(By.xpath(key)).sendKeys(text);
        }
        @Step("<number> saniye bekle")
        public void waitForSeceond(int number) throws InterruptedException {
            Thread.sleep(number*1000);
        }
        @Step("<key> id li element <text> değerini  içerdiğini kontrol et")
        public void CheckElement(String key, String text){
            Assert.assertTrue("Element bulunama",appiumDriver.findElement(By.id(key)).getText().equals(text));
        }
    }




