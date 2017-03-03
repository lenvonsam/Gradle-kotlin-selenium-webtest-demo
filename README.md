# Gradle + Kotlin + Selenium for web-driver-test

Just a demo for web-driver-test used by  gradle、kotlin and selenium.

## Get Started

* #### IDE Reqirement

  1. Download eclipse ide(neno better)
  2. Download eclipse plugin buildship
  3. Download eclipse plugin kotlin

  ​

* [Config gradle with kotlin](https://kotlinlang.org/docs/reference/using-gradle.html)

* Selenium Maven dependence

  ```
  //selenium plugin
  compile("org.seleniumhq.selenium:selenium-firefox-driver:3.2.0")
  compile("org.seleniumhq.selenium:selenium-server:3.2.0")
  compile("org.seleniumhq.selenium:selenium-java:3.0.1")
  ```

* [Download geckodriver releases](https://github.com/mozilla/geckodriver/releases),then unzip to your application path

* Programing selenium code

  ```
  fun main(args: Array<String>) {

  	// tell application where is geckodriver
  	System.setProperty("webdriver.gecko.driver", 		  "/Users/juny/ide/geckodriver")

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
  ```

* Finally, run Kotlin Application



> NOTE: This project is Apache 2.0 licensed.