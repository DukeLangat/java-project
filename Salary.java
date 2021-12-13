package project;

public class Salary  extends Employee implements ManageWork{
	public Salary(String name, String address, int number) {
		super(name, address, number);
		// TODO Auto-generated constructor stub
	}
	protected double salary;//Annual salary 
	//private int daysWorked;
	protected  int extraDays;
	public Salary(String name,String address,int number,double salary,int extraDays){
		super(name,address,number);
		this.salary=salary;
		this.extraDays=extraDays;    
		//this.daysWorked=daysWorked;
	}
	public void mailcheck(){
		System.out.println("Within mailcheck of salary class");
		if (extraDays >= 200){
			System.out.println("you have been awarded bonus");
			System.out.println("mailing check to"    + getName() + "" +   "with salary"   +  ""+  ( salary +(salary*extraDays)/20));
		}else
		{
			System.out.println(" Warning no bonus given!!!!!");
			System.out.println("mailing check to" +  ""  +   getName()+""  +"with salary" +  "" + salary);
		}
		

	}
	public double getSalary(){
		return salary;
	} 
	public void setSalary(double newSalary){
		if (newSalary >=0.0)
		{
			salary=newSalary;
		}
	}


	public int getExtraDays() {
		return extraDays;
	}
	public void setExtraDays(int extraDays) {
		this.extraDays = extraDays;
	}/*
	public int getDaysWorked() {
		return daysWorked;
	}
	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	} */
	public double computePay(){
		System.out.println("computing salary pay for" + getName());
		return (salary/52+(salary*extraDays)/20);
	}
	}

