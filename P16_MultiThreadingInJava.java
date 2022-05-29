package Unit_03;
import java.util.Scanner;

public class P16_MultiThreadingInJava {
	public static void main(String[] args) {
		
		C1 obj = new C1();
		obj.show();
		
	}
}


class C1{
	void show() {
		
		Scanner a = new Scanner(System.in);
		int x = a.nextInt();
		System.out.println("Done with C1");
		
	}
}

class C2{
	void show2() {
		System.out.println("Hey from C2");
	}
}

class C3{
	void show3() {
		System.out.println("Hey from C3");
	}
}

//  ctrl + shift + t  = class search
//  ctrl + o = 
//  wait() : it is used to unnecessary engage the program.
//  notify() : used to tell the program to proceed . Used for single wait(). hi suhani 
//  notifyall() : used for all wait() function in single go. 
