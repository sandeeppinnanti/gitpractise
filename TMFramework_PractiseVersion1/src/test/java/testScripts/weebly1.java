package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class weebly1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		List<WebElement> peru=driver.findElements(By.xpath("//td[text()='Analyst']/preceding-sibling::td[3]"));
		for(WebElement ele1:peru)
		{
			System.out.println(ele1.getText());
		}	
	}
}

/*
Print the employee ID&#39;s of the candiates whose designation is Analyst.
S148101
S148102
S148105
S148107
S148109
S148110
S148111
*/