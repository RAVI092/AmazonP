package com.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseCls;

public class PurchagePage extends BaseCls{
	
	
	 public PurchagePage() {
			PageFactory.initElements(d1, this);
			}

	 @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
		public List<WebElement> searchBox;	
	 

//	 @FindBy(xpath = "(//*[@class='a-link-normal a-text-normal'])[position()=1]/span")
//		public List<WebElement> srcPrd;	
//	 
	 @FindBy(xpath = "(//*[@class='a-link-normal a-text-normal'])[position()=1]/span")
		public List<WebElement> srcPrd;	
	  
	 
	 @FindBy(xpath = "//*[@id='add-to-cart-button']")
		public List<WebElement> cart;	
	  
	 @FindBy(xpath = "//*[@id='hlb-ptc-btn-native']")
		public List<WebElement> pmnt;	
	 
	 

	 public  void search(String st)
	 {
	 	searchBox.get(0).sendKeys(st);
	 	searchBox.get(0).submit();
	 	
	 }
	 
	 public void prodDes()
	 {
		 srcPrd.get(0).click();
//		 List<String> l=new ArrayList<String>(d1.getWindowHandles());
//		 d1.switchTo().window(l.get(1));
		 
	 }
	 
	 public void addCart()
	 {
		 cart.get(0).click();
	 }
	 
	 public void payment()
	 {
		 pmnt.get(0).click();
	 }
	 
	 
	 
}
