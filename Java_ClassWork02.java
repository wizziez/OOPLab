package com.example.ooplab02;



import java.util.Scanner;



public class Test {

	public static void main(String[] args) {

		//System.out.println("Hello BUP");

		Scanner obj = new Scanner(System.in);

		

		System.out.println("Enter your class roll: ");

		int roll = obj.nextInt();

		

		System.out.println("Enter your class name: ");

		String name = obj.next();

		

		System.out.println("Enter your class CGPA: ");

		double cgpa = obj.nextDouble();

		

		System.out.println("Roll: "+roll+"\n"+"Name: "+name+"\n"+"CGPA: "+cgpa);

		

	}



}







T2-

package com.example.ooplab02;



public class Test2 {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		for(int i=10;i>=1;i--) {

			System.out.print(i+ " ");

		}



	}



}





T3-

package com.example.ooplab02;



import java.util.Scanner;



public class Test3 {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner obj=new Scanner (System.in);

		int c=0;

		System.out.println("Enter your number: ");

		int num = obj.nextInt();

		

		for(int i=2;i<=num/2;i++) {

			if(num%i==0) {

				c++;

			break;}

		}

			if(c==0) {

				System.out.println("Prime Number");

			}

			else {

				System.out.println("Not a Prime Number");

			}

		

		



	}



}



T4-

package com.example.ooplab02;



import java.util.Scanner;



public class Test4 {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		

		//int num1;

		int x,y,temp;

		System.out.println("Enter a number: ");

		Scanner sc=new Scanner (System.in);

		x=sc.nextInt();

		//int num2;

		

		System.out.println("Enter another number: ");

		//Scanner num2=new Scanner (System.in);

		

		y=sc.nextInt();

		//int temp;

		

		System.out.println("Before swapping:");

		System.out.println("First number = "+x);

		System.out.println("Second number = "+y);

		

		temp=x;

		x=y;

		y=temp;

		

		

		System.out.println("After swapping:");

		System.out.println("First number = "+x);

		System.out.println("Second number = "+y);

		

		



	}



}



T5-(SWAP WITHOUT TEMP)

package com.example.ooplab02;



import java.util.Scanner;



public class Test4 {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		

		//int num1;

		int x,y,temp;

		System.out.println("Enter a number: ");

		Scanner sc=new Scanner (System.in);

		x=sc.nextInt();

		//int num2;

		

		System.out.println("Enter another number: ");

		//Scanner num2=new Scanner (System.in);

		

		y=sc.nextInt();

		//int temp;

		

		System.out.println("Before swapping:");

		System.out.println("First number = "+x);

		System.out.println("Second number = "+y);

		

		//temp=x;

		//x=y;

		//y=temp;

		

		x=x-y;

		y=x+y;

		x=y-x;

		

		

		System.out.println("After swapping:");

		System.out.println("First number = "+x);

		System.out.println("Second number = "+y);

		

		



	}



}
You sent
package com.example.task1;



public class Person {

	

	private String name;

	private int age;

	private String dob;

	

	public Person(String name, int age, String dob ) {

	this.name=name;

	this.age=age;

	this.dob=dob;

	}

	

	public String getName() {

		return name;

	}

	

	public int getAge() {

		return age;

	}

	

	public String getDob() {

		return dob;

	}

	



}

com.example.task1;



public class Main {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		

		Person person1= new Person ("John", 40, "14JAN1991");

		Person person2=new Person("Elahi",46,"14FEB1985");

		

		System.out.println(person1.getName()+" is "+

		        person1.getAge()+

				" years old and dob is "+

				person1.getDob());

		

		System.out.println(person2.getName()+" is "+

		        person2.getAge()+

				" years old and dob is "+

				person2.getDob());



	}



}