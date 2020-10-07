package com.stepDef;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Base.BaseCls;
import com.Pages.PurchagePage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class purchageTest extends BaseCls {

	PurchagePage p1;
	
	
	
	@Before
	public void m3()
	{
		waitTime();
	}
	
	
	@Given("User is at home page")
	public void s1() {
		    loadUrl("https://www.amazon.com"); 
		   System.out.println("Ravi");
		   
		}

	
	public String m7(int u) throws IOException
	{
		System.out.println("xvnnjfjbabajk");
		FileInputStream f=new FileInputStream("D:\\Book1.xlsx");
		XSSFWorkbook x=new XSSFWorkbook(f);
		XSSFCell y=x.getSheetAt(0).getRow(1).getCell(1);
		String s=y.getStringCellValue();
		List<String> l=new ArrayList<String>();
		l.add(s);
//		System.out.println(l.get(0));
		return l.get(u);
	}
	
	
	
	@When("he search the product")
	public void s2() throws IOException {
		p1=new PurchagePage();
		p1.search(m7(0));
	    p1.prodDes();
	}

	@When("add it to cart")
	public void add_it_to_cart() {
	  
	    p1.addCart();
	}

	@Then("proceed to Payment page")
	public void proceed_to_Payment_page() {
	  
	    p1.payment();
	}

	
	
}

