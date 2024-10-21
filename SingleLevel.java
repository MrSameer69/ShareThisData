class Employee {
	float salary = 50000;
}
 class Programmer extends Employee{
	int Bonus = 10000;
}
public class SingleLevel{
	public static void main(String args[]){
		Programmer p = new Programmer();
		System.out.println(p.salary);
		System.out.println(p.Bonus);
	}
}