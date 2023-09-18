package com.cpt.payments.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cpt.payments.pojo.AddRequest;
import com.cpt.payments.pojo.AddResponse;



@RestController
public class TestController
{

	@GetMapping("/hello")
	public String helloSpring() 
	{
		return "Hello, Spring";
	}

	@GetMapping("/AddGet")
	public int AddGet( @RequestParam(value="num1") int val1,
			@RequestParam(value="num2") int val2	)
	{
		System.out.println("Calling AddGet:val1= "+val1+" ,val2=  "+val2);
		int res = val1 + val2;
		System.out.println("Add res= "+res);
		return res;
	}

	@PostMapping("/AddPost")
	public int AddPost(@RequestParam (value="val1")int num1,
			@RequestParam(value="val2")int num2)
	{
		System.out.println("By Calling AddPost: num1= "+num1+" ,num2= "+num2);
		int sum = num1 + num2;
		System.out.println("Sum= "+sum);
		return sum;
	}


	@PostMapping("/processJSON")
	@ResponseBody
	public  AddResponse processJSON(@RequestBody AddRequest request)
	{
       System.out.println("Calling processJSON:: request"+request);
       
       int res = request.getNum1() + request.getNum2();
       
       AddResponse response = new AddResponse();
       response.setRes(res);
       
       System.out.println("Add response: "+response);
       return response;
	}
	
	@GetMapping("/SubGet")
	public int SubGet( @RequestParam(value="num1") int val1,
			@RequestParam(value="num2") int val2	)
	{
		System.out.println("Calling SubGet:val1= "+val1+" ,val2=  "+val2);
		int res = val1 - val2;
		System.out.println("Subtraction res= "+res);
		return res;
	}
	
	@PostMapping("/SubPost")
	public int SubPost(@RequestParam (value="val1")int num1,
			@RequestParam(value="val2")int num2)
	{
		System.out.println("By Calling SubPost: num1= "+num1+" ,num2= "+num2);
		int sub = num1 - num2;
		System.out.println("Sub= "+sub);
		return sub;
	}
	
	@GetMapping("/helloworld")
	public String helloworld()
	{
		return "helloworld....";
	}
	
	
}


