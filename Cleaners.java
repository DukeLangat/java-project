package project;

public class Cleaners extends PartTime {
	private  String location;
	public Cleaners(String name,String address,int number,int hrsWorks,int hourlyRate,int extraHours,String location){
	super(name,address,number,hrsWorks,hourlyRate,extraHours);
	this.location=location;
	}
	public void mailcheck(){
		if (hrsWorks >=40){  
			System.out.println("you have been awarded bonus");
			System.out.println("mailing a check to"     + getName() + "" + "monthly pay for parTime worker" + "" +(hrsWorks*hourlyRate + extraHours*hourlyRate + ""+"who cleans" + location) );	
		}else 
		{
			System.out.println("you will not receive the bonus");
			System.out.println("mailing a check to"    + getName() + "monthly pay for partime worker" + hrsWorks*hourlyRate + "" +"who cleans" + location);
			
		}
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double computePay(){
		System.out.println("computing monthly pay for partime employees");
		return (hrsWorks*hourlyRate + extraHours*hourlyRate);
		}

}


