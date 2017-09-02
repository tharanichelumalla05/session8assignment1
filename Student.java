/*program for showing constructor overloading
 *  constructor  overloading in java in which a class can have any number of constructor that differ in parameters we are taking.
*/
package constructoroverloading;// here I have created a package as constructoroverloading

class Student {
	//declares a class called Student
	//classes are the basics of opps(object oriented programming)
	Student(){  //here it is an default constructor
		 
	}
	  int id;     // taking the variables of int and string data types 
	    String name;//string is a argument which passes in main method
	                //initializing name
	    int marks;  //initializing marks
	    
	    Student(int i,String n){  //here we are implementing another constructor by taking 
	    id = i;                      //two parameters ,it is known as parameterized constructor 
	    name = n;                     //id equal to i,name equal to n
	    }                                //the constructor should have the same name of the class name 
	    Student(int i,String n ,int m){   //taking three parameters which shows that it is constructor overloaded 
	    id = i;  //initializing id equal to i
	    name = n;//taking name equal to n  
	    marks =m; //taking marks equal to b 
	    }  
	    void display(){    //to display we are using this
	    	                 //void wont return any value
	    	
	    	System.out.println("Student" );//system is used to return code
	    	                           //out is static number
					//Println is used to print text student and gives output 
	    	System.out.println("Student id  :"    +id);//system is used to return code
					                           //Println is used to print text student id  and gives output of student id
	    	System.out.println("Student name: "   +name);//system is used to return code
					                                  //Println is used to print text student name and gives output of name
	    	System.out.println("Student marks: "   +marks);//printing student marks and gives the output of marks
	    	                                             //out is a static number
	    	
	    	}  
	   
	    public static void main(String args[]){ 
	    	// TODO Auto-generated method stub
			//Here public is a access modifier which defines who can access this method
			//Here static a keyword which identifies class related thing
			//void is used to define return type of the method,void means method wont return any value
			//main is name of method,and to display
			//declares method String[]
			//String[]args means arguments will be passed into main method and says that main() as a parameter
	    Student s =new Student();//initializing new student as s
	    Student s1 = new Student(15,"tharani"); //initializing new s1 with id and student name 
	    Student s2 = new Student(67,"bhavitha",89);//initialinzing new s2 with id student name and marks 
	    s.display();//displaying s
	    s1.display();//displaying s1  
	    s2.display();//displaying s2 
	   }  

}