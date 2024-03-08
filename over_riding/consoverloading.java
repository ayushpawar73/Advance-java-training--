package over_riding;
class Num{
	String name ;
	int Age;
	int emp_id;
	int mo_no;
	String Dep;
	Long Mo_no;
	
	
 Num (String Name ,int Age,int Emp_id){
	 this.name=Name;
	 this.Age=Age;
	 this.emp_id=Emp_id;
	 System.out.println(Age+Name+Emp_id);
	 System.out.println("The name is " +name+ " my age is " +Age+ " Emp id is " +Emp_id);
	
	 
 }
 

	
 Num (String Name ,int Age,int Emp_id,long mo_no){
	 this.name=Name;
	 this.Age=Age;
	 this.emp_id=Emp_id;
	 this.Mo_no=mo_no;
	 System.out.println("The name is " +name+ " my age is " +Age+ " Emp id is " +Emp_id+ " Mobile no  is" +mo_no );
}

	 Num (String Name ,int Age,int Emp_id,String dep){
		 this.name=Name;
		 this.Age=Age;
		 this.emp_id=Emp_id;
		 this.Dep=dep;
		 System.out.println("The name is " +name+ " my age is " +Age+ " Emp id is " +Emp_id+ " Department is" +Dep );
}
}
public class consoverloading {
    public static void main(String[] args) {
      

   Num n= new Num("Aman",66,101);
   Num n1= new Num("Abhishek",5,101,544515256);
   Num n2= new Num("Ajay",4565,101,"Human Resource");
//    n.display();
   Num n3= new Num("Subham",498645,1020,398787387);
}
}