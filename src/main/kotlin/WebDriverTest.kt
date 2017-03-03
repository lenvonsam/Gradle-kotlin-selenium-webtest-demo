import org.openqa.selenium.By
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver

class WebDriverTest {
}

fun main(args: Array<String>) {

	// tell application where is geckodriver
	System.setProperty("webdriver.gecko.driver", "/Users/juny/ide/geckodriver")

	// instance firefoxdriver
	val driver = FirefoxDriver()

	//	And now use this to visit Baidu
	driver.get("http://www.baidu.com")

	// Find the text input element by id
	val element = driver.findElement(By.id("kw"))

	// Enter something to search for hello world
	element.sendKeys("hello world")

	//	Now submit the form. WebDriver will find the form element
	val searchBtn = driver.findElement(By.id("form"))

	//element.submit
	searchBtn.submit()

	// Check the title of the page	
	println("Page title is: ${driver.title}")

	// Close the browser
	//	driver.quit();
}