package demo;

public class Student {
    public String name ;
    public String email;
    private String telephone;

    public void run() {
        System.out.println("Running...");
    }

    public void run(String msg) {
        System.out.println("Running 10km/h");
    }

    public void run(int n) {
        System.out.println("Running 15km/h");
    }

    public static void hello() {
        System.out.println("Hello");
    }
}
