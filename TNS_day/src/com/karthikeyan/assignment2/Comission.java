package com.karthikeyan.assignment2;

import java.util.Scanner;

public class Comission {
	    private String Name;
	    private String Address;
	    private String Phone;
	    private double SalesAmount;

	    public void acceptEmployeeDetails() {
	        Scanner sc = new Scanner (System.in);
	        
	        System.out.println("Enter Name: ");
	        Name=sc.nextLine();
	        System.out.println("Enter Address: ");
	        Address=sc.nextLine();
	        System.out.println("Enter PhoneNumber: ");
	        Phone=sc.nextLine();
	        System.out.println("Enter SalesAmount");
	        SalesAmount=sc.nextDouble();
	    }
	    
	    public void calculateComission() {
	    	double Comission =0;
	    
	        if (SalesAmount >= 100000) {
	            Comission= SalesAmount * 0.10;
	        } else if (SalesAmount >= 50000 && SalesAmount<100000) {
	            Comission = SalesAmount* 0.05;
	        } else if (SalesAmount >= 30000 && SalesAmount<50000) {
	            Comission =SalesAmount * 0.03; 
	        }else if (SalesAmount<30000) {
	        	System.out.println("No Comission");
	        }if (SalesAmount<30000)
	        {Comission=SalesAmount*0;
	        
	    
	        }
	        if(Comission>0) {
	        	System.out.println("Comission"+Comission);
	        }
	        else {
	            System.out.println("No Comision");
	        }
	    }
	

	
	    public static void main(String[] args) {
	        Comission comission = new Comission();
	        comission.acceptEmployeeDetails();
	        comission.calculateComission();
	     
	    }
	}

