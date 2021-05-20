import java.util.regex.Pattern;
import java.util.Scanner;

class VerifyPattern
{
		Scanner sc = new Scanner(System.in);
		public String userName,userPass,userEmail,contact,age,city;
		private String userNameRegex,passwordRegex,emailRegex,contactRegex,userAgeRegex,usercityRegex;

	public void userName()
	{
		userNameRegex = "^[A-Za-z]*";
	    userName = "shreyas";
		Pattern pt = Pattern.compile(userNameRegex);
		
	
		if ( userName.matches(userNameRegex) )
		{
			System.out.println("Name is valid:");
		}
		else
		System.out.println("Name is not valid:");
	}

	public void password()
	{
		passwordRegex = "^[[^[0-9]]a-zA-Z]*[0-9[\\W]]{3,7}$";
	    userPass = "abcxyz@1$23";

		Pattern pt = Pattern.compile(passwordRegex);
		if ( userPass.matches(passwordRegex) )
		{	
			System.out.println("password is valid:");
		}
		else
		{
			System.out.println("not valid password:");
		}
	}

	public void emailID()
	{
		emailRegex = "^[a-z0-9-\\+]+[\\.[a-z0-9]]*@[a-z]{1,7}[\\.[a-z]]*$";
		userEmail = "mr.shreyasshinde26@gmail.com.in";
		Pattern pt = Pattern.compile(emailRegex);

		if ( userEmail.matches(emailRegex) )
		{
			System.out.println("email is valid:");
		}
		else
		{
			System.out.println("email is not valid:");
		}
	}

	public void contactNum()
	{
		contactRegex = "^[7-9]{1}[0-9]{9}$";
		contact = "9890396486";

		Pattern pt = Pattern.compile(contactRegex);

		if ( contact.matches(contactRegex) )
		{
			System.out.println("contact number is valid:");
		}
		else
		{
			System.out.println("contact is not valid:");
		}
	}

	public void age()
	{
		userAgeRegex = "^[0-9]{0,3}$";
		age = "21";

		Pattern pt = Pattern.compile(userAgeRegex);

		if ( age.matches(userAgeRegex) )
		{
			System.out.println("age is valid:");
		}
		else
		{
			System.out.println("age is not valid:");
		}
	}

	public void city()
	{
		usercityRegex = "^[a-zA-Z]{1,13}$";
		city = "Satara";

		Pattern pt = Pattern.compile(usercityRegex);

		if ( city.matches(usercityRegex) )
		{
			System.out.println("city name is valid:");
		}
		else
		{
			System.out.println("city is not valid:");
		}
	}
}


class UserReg 
{
	public static void main(String[] args) 
	{
		VerifyPattern v1 = new VerifyPattern();
		v1.userName();
		v1.password();
		v1.emailID();
		v1.contactNum();
		v1.age();
		v1.city();

	}
}
