package service;
import java.util.*;
class Account
{
	private int CN ;
	private int PN;
	void setCustomerNumber(int a)
	{
		CN=a;
	}
	void setPINNumber(int p)
	{
		PN=p;
	}
	int getCustomerNumber()
	{
		return CN;
	}
	int getPINNumber()
	{
		return PN;
	}
}
class OptionMenu extends Account
{
	Scanner input = new Scanner(System.in);
	HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
	void getLogin()
	{
		int iLoveMyIndia = 2798;
		do
		{
			try
			{
				data.put(11111,111);
				data.put(22222,222);
				data.put(33333,333);
				data.put(44444,444);
				data.put(55555,111);
				
				System.out.println("\nWelcome to the ASM ATM\n");
				System.out.print("Enter your Account Number : ");
				setCustomerNumber(input.nextInt());
				System.out.print("Enter Your PIN Number : ");
				setPINNumber(input.nextInt());
				
				int A=getCustomerNumber();
				int B=getPINNumber();
				
				if(data.containsKey(A) && data.get(A) == B)
				{
					getAccountType();
				}
				else
				{
					System.out.println("\nWrong Customer Number or Pin");
					System.out.println("Please try again with valid customer number or pin number");
				}
				
			}
			catch(InputMismatchException IE)
			{
				System.out.println("Please enter only numbers");
				System.out.println("Character and symbols are not allowed");
				iLoveMyIndia = 5555;
			}
		}while(iLoveMyIndia == 2798);
		
	}
	void getAccountType()
	{
		System.out.println("\nSelect account type you want to access : ");
		System.out.println("Type 1 : Current Account");
		System.out.println("Type 2 : Saving Account");
		System.out.println("Type 3 : Exit");
		System.out.print("Choice   : ");
		
		int ch=input.nextInt();
		switch(ch)
		{
			case 1:getCurrent();
				break;
			case 2:getSaving();
				break;
			case 3:
				System.out.println("Thank for visiting...\nVisit Again..!");
				break;	
			default:
				System.out.println("Invalid Choice\nPlease Enter valid Choice");
				break;
		}
	}
	void getCurrent()
	{
		System.out.println("Current Account");
		System.out.println("Type 1 : View Balance");
		System.out.println("Type 2 : Withdraw Fund");
		System.out.println("Type 3 : Deposit Fund");
		System.out.println("Type 4 : Exit ");
		System.out.println("Choice");
		
		int ch=input.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Welcome to the balance enquiry section");
				break;
			case 2:
				System.out.println("Welcome to the balance withdraw section");
				break;
			case 3:
				System.out.println("Welcome to the balance deposit section");
				break;
			case 4:
				System.out.println("Thank for visiting...\nVisit Again..!");
				break;
			default:
				System.out.println("Invalid Choice\\nPlease Enter valid Choice");
				break;
		}
	}
	void getSaving()
	{
		System.out.println("Saving Account");
		System.out.println("Type 1 : View Balance");
		System.out.println("Type 2 : Withdraw Fund");
		System.out.println("Type 3 : Deposit Fund");
		System.out.println("Type 4 : Exit ");
		System.out.println("Choice");
		
		int ch=input.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Welcome to the balance enquiry section");
				break;
			case 2:
				System.out.println("Welcome to the balance Withdraw section");
				break;
			case 3:
				System.out.println("Welcome to the balance deposit section");
				break;
			case 4:
				System.out.println("Thank for visiting...\nVisit Again..!");
				break;
			default:
				System.out.println("Invalid Choice\\nPlease Enter valid Choice");
				getSaving();
				break;
		}
	}
}
public class ATM extends OptionMenu
{
	public static void main(String[] args) 
	{
		OptionMenu Om = new OptionMenu();
		Om.getLogin();
	}
}