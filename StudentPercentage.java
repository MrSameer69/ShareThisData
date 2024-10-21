class Student{
	int rollno;
	int mark1;
	int mark2;
	int mark3;
	Student(int rollno,int mark1,int mark2,int mark3){
		this.rollno = rollno;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		}
		double calculate(){
			int total = mark1 + mark2 + mark3;
		return (total)/3;
	}
	int getRollNo(){
		return rollno;
	}
}
public class StudentPercentage{
	public static void main(String args[]){
		//Manish and Ashutosh
		Student s1 = new Student(100,60,70,80 );
		System.out.println("Roll no :- "+s1.getRollNo()+" percentage : "+ s1.calculate() );
		}
	}