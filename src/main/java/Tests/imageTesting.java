package Tests;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class imageTesting {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://shop.unicity.com/#/home");
		
		Thread.sleep(30000);
		
		WebElement image = driver.findElement(By.xpath("//img[@class='home-banner ng-scope']"));
		Screenshot imageshot = new AShot().takeScreenshot(driver, image);
		
		BufferedImage actualImage = imageshot.getImage();
		BufferedImage expectedImage = ImageIO.read(new File("D:\\India_WH\\Learning\\images\\Expected.jpg"));
		
		ImageDiffer ImgDiff = new ImageDiffer();
		ImageDiff Diff = ImgDiff.makeDiff(expectedImage, actualImage);
		
		if (Diff.hasDiff() == true) {
			System.out.println("Image is Different");
		} else {
			System.out.println("Image has no Difference");
		}
	}

}
