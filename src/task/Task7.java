package task;

import java.util.Scanner;

public class Task7{
	public double balence;
	
	public Task7(double balence){
		this.balence = balence;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter default amount : ");
		double am = s.nextDouble();
		Task7 a = new Task7(am);
		System.out.println("1. Deposite");
		System.out.println("2. Widthrowal");
		System.out.println("3. Balence Check");
		System.out.println("Enter your choice : ");
		int choice = s.nextInt();
	
		
			switch(choice){
				case 1:{
					System.out.println("Enter amount : ");
					double amount = s.nextDouble();
					a.depositeAmount(amount);
					break;
				}
				case 2:{
					System.out.println("Enter amount : ");
					double amount = s.nextDouble();
					a.widthrowalAmount(amount);
					break;
				}
				case 3:{
					a.checkAmount();
					break;
				}
				default:{
					System.out.println("Invalid Input");
				}
			}
	}
	
	public void depositeAmount(double amount){
		System.out.println("Name : Gopal Sairam Dawar");
		System.out.println("Address : At post kundane (war) Dhule, Maharashtra ");
		System.out.println("Account Number : 15611120000975");
		balence = balence + amount;
		System.out.println(" Credited : "+ amount);
		System.out.println("Total Balence : " + balence);
		
	} 
	
	public void widthrowalAmount(double amount){
		System.out.println("Name : Gopal Sairam Dawar");
		System.out.println("Address : At post kundane (war) Dhule, Maharashtra ");
		System.out.println("Account Number : 15611120000975");
		if(amount%100 == 0 || amount%500 == 0){
			if(amount > balence){
				System.out.println("Not Enough Money");
				System.out.println("Check your balence");
			}else{
				balence = balence - amount;
				System.out.println("Debited Amount :" + amount);
				System.out.println("Total Amount :" + balence);
			}
		}else{
			System.out.println("Enter Money Multiple of 100 and 500");
		}
	}
	public void checkAmount(){
		System.out.println("Name : Gopal Sairam Dawar");
		System.out.println("Address : At post kundane (war) Dhule, Maharashtra ");
		System.out.println("Account Number : 15611120000975");
		System.out.println("Total amount : " + balence);
	}	
}