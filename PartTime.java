package project;

public class PartTime extends Employee implements ManageWork {
	int hrsWorks;
	int hourlyRate; 
	int extraHours;
	public PartTime(String name,String address,int number,int hrsWorks,int hourlyRate,int extraHours){
		super(name,address,number); 
		this.hrsWorks=hrsWorks;
		this.hourlyRate=hourlyRate; 
		this.extraHours=extraHours;
	}
public void mailcheck(){ 
	if (hrsWorks >=40){  
		System.out.println("you have been awarded bonus");
		System.out.println("mailing a check to"     + getName() + "" + "monthly pay for parTime worker" + "" +(hrsWorks*hourlyRate + extraHours*hourlyRate) );	
	}else 
	{
		System.out.println(" Warning you will not receive the bonus!!!!");
		System.out.println("mailing a check to"    + getName() + "monthly pay for partime worker" + hrsWorks*hourlyRate);
		
	}
	

	
} 
public int getHrsWorks(){
	return  hrsWorks;
}
public int getHourlyRate(){
return hourlyRate;	
} 
public void setHrsWorks(int hrsWorks){  	
this.hrsWorks =hrsWorks;	
} 
public void setHourlyRate(int hourlyRate){
	this.hourlyRate=hourlyRate;
} 

public double computePay(){
System.out.println("computing monthly pay for partime employees");
return (hrsWorks*hourlyRate + extraHours*hourlyRate);
}
}

