package org.execute;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.global.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BasicTesting extends BaseClass {
	public static void main(String[] args) {
		BaseClass b = new BaseClass();
	b.getDriver();
	b.getUrl("https://www.saucedemo.com/v1/");
	WebElement user = driver.findElement(By.id("user-name"));
	user.sendKeys("standard_user");
	
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("secret_sauce");
	WebElement login = driver.findElement(By.id("login-button"));
	login.click();
	WebElement product = driver.findElement(By.className("product_label"));
	if(product.isDisplayed()) {
		System.out.println("Loggedin Successfully");	
	}	
List<WebElement> allAddCartButtons = driver.findElements(By.xpath("//button[text()='ADD TO CART']")) ;
for (int i = 0; i < allAddCartButtons.size(); i++) {
         allAddCartButtons.get(i).click();
                System.out.println("clicked");
}
    WebElement cart = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
               cart.click();
driver.manage().window().maximize();
 List<WebElement> noOfItems = driver.findElements(By.xpath("//div[contains(@class,'inventory_item_name')]"));
  for(int i=0;i<noOfItems.size();i++) {
	   noOfItems.get(i);
	  System.out.println("cart has 6 items");
  }  
List<WebElement>remove = driver.findElements(By.xpath("//button[@class='btn_secondary cart_button']"));   
	  for(int i1=4;i1<remove.size();i1++) {
	   remove.get(i1).click();
	  }
List<WebElement>remove1 = driver.findElements(By.xpath("//button[@class='btn_secondary cart_button']"));   
	  for(int i2=4;i2<remove1.size();) {
		 remove1.get(i2).click();
		 System.out.println("cart has 4 items");
		   }
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,350)", "");
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
WebElement checkout = driver.findElement(By.xpath("//a[@class='btn_action checkout_button']"));
           checkout.click();
WebElement checkoutPage = driver.findElement(By.xpath("//div[@class='subheader']"));
	  if(checkoutPage.isDisplayed()) {
		  System.out.println("Checkout page appeared");
WebElement firstname = driver.findElement(By.id("first-name"));
		  //firstname.click();
		  firstname.sendKeys("Melphy");
WebElement lastname = driver.findElement(By.id("last-name"));
		  //lastname.click();
		  lastname.sendKeys("Jenila");
WebElement zipcode = driver.findElement(By.id("postal-code"));
		  //zipcode.click();
		  zipcode.sendKeys("627182");
WebElement conti = driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));
		  conti.click();
WebElement checkoutOverview = driver.findElement(By.xpath("//div[@class='subheader']"));
		  if(checkoutOverview.isDisplayed()) {
			  System.out.println("Checkout Overview page is displayed");
WebElement finish = driver.findElement(By.xpath("//a[@class='btn_action cart_button']"));
		finish.click();
WebElement orderconfirmation = driver.findElement(By.xpath("//h2[@class='complete-header']"));
		  if(orderconfirmation.isDisplayed()) {
			  System.out.println("Order confirmation page is displayed");
WebElement button = driver.findElement(By.xpath("//div[@class='bm-burger-button']"));
		 button.click();
WebElement logout= driver.findElement(By.id("logout_sidebar_link"));
		 logout.click();
WebElement homepage = driver.findElement(By.xpath("//div[@class='login_logo']"));
		 if(homepage.isDisplayed()) {
			 System.out.println("Home is displayed");
		 }
		  }
		  
		  }
	  }
	  
    }
}




	

