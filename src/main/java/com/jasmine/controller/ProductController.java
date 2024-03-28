package com.jasmine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jasmine.model.Product;
import com.jasmine.repo.ProductRepo;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepo pdrepo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/req1")
	public String pdHome()
	{
		return "pdreg";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String savePd(@RequestParam int customerid,@RequestParam String customername,@RequestParam long mobileno,@RequestParam String productname,@RequestParam double price,@RequestParam int quantity,Product prod,Model m) 
	{
		double total=0.0,discount=0.0,gst_amt=0.0,invoice_bill=0.0;
		// Total Calculation
		total = prod.getPrice()*prod.getQuantity();
		prod.setTotal(total);
		// Conditions
		if(prod.getTotal()<2500)
		{
			discount = (prod.getTotal()*10)/100;
		}
		else if(prod.getTotal()>=2500 && prod.getTotal()<5000)
		{
			discount = (prod.getTotal()*15)/100;
		}
		else
		{
			discount = (prod.getTotal()*30)/100;
		}
		prod.setDiscount(discount);
		// GST Calculation
		gst_amt = (prod.getTotal()*18)/100;
		prod.setGst_amt(gst_amt);
		// Invoice Calculation
		invoice_bill = prod.getTotal()-prod.getDiscount()+prod.getGst_amt();
		prod.setInvoice_bill(invoice_bill);
		
		pdrepo.save(prod);
		
		return "success";
	}
	
	@RequestMapping(value="/views",method=RequestMethod.GET)
	public String viewAllProd(Model m)
	{
		m.addAttribute("prods",pdrepo.findAll());
		return "prodView";
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String deleteProd(@PathVariable int id)
	{
		pdrepo.deleteById(id);
		return "redirect:/views";
	}
	
	@RequestMapping(value="/editprod/{id}")
	public String editProd(@PathVariable int id,Model m)
	{
		Product pd = pdrepo.findById(id).get();
		m.addAttribute("command",pd);
		return "editprod";
	}
	
	@RequestMapping(value="editu",method=RequestMethod.GET)
	public String editSave(@RequestParam int customerid,@RequestParam String customername,@RequestParam long mobileno,@RequestParam String productname,@RequestParam double price,@RequestParam int quantity,Product prod,Model m)
	{
		double total=0.0,discount=0.0,gst_amt=0.0,invoice_bill=0.0;
		// Total Calculation
		total = prod.getPrice()*prod.getQuantity();
		prod.setTotal(total);
		// Conditions
		if(prod.getTotal()<2500)
		{
			discount = (prod.getTotal()*10)/100;
		}
		else if(prod.getTotal()>=2500 && prod.getTotal()<5000)
		{
			discount = (prod.getTotal()*15)/100;
		}
		else
		{
			discount = (prod.getTotal()*30)/100;
		}
		prod.setDiscount(discount);
		// GST Calculation
		gst_amt = (prod.getTotal()*18)/100;
		prod.setGst_amt(gst_amt);
		// Invoice Calculation
		invoice_bill = prod.getTotal()-prod.getDiscount()+prod.getGst_amt();
		prod.setInvoice_bill(invoice_bill);
		pdrepo.save(prod);
		return "redirect:/views";
	}
	
}