package Packagetest2;

public class Test1 {
	
	int rollNo;
    int age;
	

    public void display1() {
        System.out.println("Welcome to all of you");
    }

    public void display2() {
        System.out.println("Automation is very easy");
    }

    public static void main(String[] args) {
        Test1 deepak=new Test1();
        deepak.rollNo=123;
        deepak.age=23;
        System.out.println("deepak.rollNo" + deepak.rollNo);
        System.out.println("deepak.age" + deepak.age);
        deepak.display1();
        deepak.display2();
    }
}



