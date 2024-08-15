import demo.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Student s = new Student(); //object
//        System.out.println(s.name);
//        System.out.println(s.email);
////        System.out.println(s.telephone);
//
//        s.run();
//        s.run("10");
//        s.run(15);

//        int n = 10;
//        float pi = 3.14159f;
//        double cv = 3.14159;
//        boolean t = true;
//        String str = "Hello";
//        if(n>5) {
//
//        } else {
//
//        }
//
//        for (int i =0;i<10;i++) {
//            System.out.println("i="+i);
//        }

//        Scanner sc =  new Scanner(System.in);
//        System.out.println("Nhap k bang: ");
//        int k = sc.nextInt();
//        System.out.println("k="+k);
//        Student.hello();
//        Main.sayHello();
//        Main m = new Main();
//        m.hi();



        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen: ");
        int b = sc.nextInt();
        Main.Prime(b);

    }

    public static void sayHello() {
        System.out.println("Sup");
    }

    public void hi() {
        System.out.println("Hi");
    }

    public static void Prime(int a) {
        if(a<2) {
            System.out.println(a+" không phải là số nguyên tố");
        }
        for(int i=2; i<a;i++) {
            if (a % i == 0) {
                System.out.println(a+ " không phải là số nguyên tố");
                return;
            }
        }
        System.out.println(a+ " là số nguyên tố");
    };
}