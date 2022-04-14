package employee;

class Employee 
{
	String name;
	int balance;
	
	Employee(String nme, int bal)
	{
		name = nme;
		balance = bal;
	}
	//compute employee initials
	public String getInitials()
	{
		String initials = "";
		for(int i = 0; i < name.length(); i++)
		{
			char currentChar = name.charAt(i);
			if(currentChar >= 'A' && currentChar <='Z')
				initials = initials + currentChar + '.';
		}
		return initials;
	}
	
	public int getBalance()
	{
		return balance;
		
	}
	
	public static void main(String[] args)
	{
		Employee[] a = new Employee[16];
		a[0] = new Employee("Janelly Antonio", 278);
		a[1] = new Employee("Daniel Conroy", 329);
		a[2] = new Employee("Wenhao Jin", 445);
		a[3] = new Employee("Nathaniel Jones", 402);
		a[4] = new Employee("Sean Kirchner", 388);
		a[5] = new Employee("Sabrina Lin", 275);
		a[6] = new Employee("Eric Luna", 243);
		a[7] = new Employee("Kevin Luna", 334);
		a[8] = new Employee("Zayad Maanane", 412);
		a[9] = new Employee("Hanne Nicolaisen", 393);
		a[10] = new Employee("Jackson Nogles", 299);
		a[11] = new Employee("Emily Parvar", 343);
		a[12] = new Employee("Jaspreet Singh", 317); 
		a[13] = new Employee("Athena Glorius Stebe", 265);
		a[14] = new Employee("Melanie Taylor", 354);
		a[15] = new Employee("Tankeh Appolo", 234);
		
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println("Initials: " + a[i].getInitials() + " Balance: " + a[i].getBalance());
			
		}
	}
}
