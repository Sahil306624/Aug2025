package pack1;

public class Lab678 {
	String FirstName;
	String LastName;
	String PhnNumber;
	enum gender
	{
		M,F
	}
	

public Lab678(String firstName, String lastName, String phnNumber) {
		super();
		FirstName = firstName;
		LastName = lastName;

		PhnNumber = phnNumber;
	}

public String getFirstName() {
	return FirstName;
}

public void setFirstName(String firstName) {
	FirstName = firstName;
}

public String getLastName() {
	return LastName;
}

public void setLastName(String lastName) {
	LastName = lastName;
}


public String getPhnNumber() {
	return PhnNumber;
}

public void setPhnNumber(String phnNumber) {
	PhnNumber = phnNumber;
}

void display() {
	System.out.println("First Name: "+getFirstName());
	System.out.println("Last Name: "+getLastName());

	System.out.println("Gender: "+Lab678.gender.M);
}
void PhnNumber() {
	System.out.println("Phone number:"+getPhnNumber());
}

public static void main(String[] args) {
	Lab678 p=new Lab678("S", "Sahil Jha", "8969976667");
	p.display();
	p.PhnNumber();
}
}
