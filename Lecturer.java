package project;

public class Lecturer extends Salary {
	private String java;
	private String excel;
	public Lecturer (String name,String address,int number,double salary,int extraDays, String java,String excel){
		super(name,address,number,salary,extraDays);
		this.setJava(java);
		this.setExcel(excel);
	} 
	public void mailcheck(){ 
		System.out.println("within mailcheck of lecturer class");
		if (extraDays >=200){
		System.out.println("you have been awarded bonus");
		System.out.println("mailing check to"    + getName() +"" + "with salary" + ""+ ( salary +(salary*extraDays)/20)+ "" + "to the lecturer teaching this units" + ""+ java + "" + "and" + excel) ;
		}else{
			System.out.println("you have not been awarded bonus");
			System.out.println("mailing check to" +   getName() + "with salary" + salary +""+ "to the lecturer teaching this units" + "" + java +"" +"and" + excel);
		}
		} 
	public String getJava() {
		return java;
	}
	public void setJava(String java) {
		this.java = java;
	}
	public String getExcel() {
		return excel;
	}
	public void setExcel(String excel) {
		this.excel = excel;
	}
	public double computePay(){
		System.out.println("computing salary pay for" + getName());
		return (salary/52+(salary*extraDays)/20);
	}
	
			

}


