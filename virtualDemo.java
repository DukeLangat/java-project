package project;

public class virtualDemo {
	public static void main(String[]args){
		Salary s1 =new Salary("mohd mohtashim", "Ambehta, up", 3 , 3600.00,250);
		System.out.println("call mailcheck using salary reference");
		s1.mailcheck();
		Salary s2=new Salary("lilian","maseno,town",5,20000.00,150);
		s2.mailcheck();
		Employee e1 = new Salary("john adama", "boston, Ma",2,2400.00,150);
		System.out.println("\n call mailcheck using employee reference");
		e1.mailcheck();
		Employee e2=new PartTime("cyrian","nairobi,upperhills",8,20,300,10);
		e2.mailcheck();
		System.out.println("\n call mailcheck using partime reference");
		PartTime p1= new PartTime("christoper", "kikuyu, kijabe",6,20,100,10);
		p1.mailcheck();
		PartTime p2=new PartTime("Esther Arunga","bungo,Street6",10,100,50,20);
		p2.mailcheck();
		System.out.println("\n call mailcheck using Lecturer reference");
		Lecturer l1= new Lecturer("ouma ", "kitale, up",5,36000.00,250,"CCS103",   "CCS114");
		l1.mailcheck();
		Lecturer l2= new Lecturer("Gladys ", "kericho, me",2,20000.00,60,"CCS108",   "CCS112");
		l2.mailcheck();
		System.out.println("\n call mailcheck using cleaners reference");
		Cleaners c1=new Cleaners("onsaringo", "juba, backstreet",4,70,200,140,     "library");
		c1.mailcheck();
		Cleaners c2=new Cleaners("KImutai", "nairobi,kitongo",3,60,100,350,       "Lecture halls");
		c2.mailcheck();
	}
	
}
