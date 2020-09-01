import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = scan.next();
        System.out.println("Nice to meet you, " + name);
        
        Scanner scan1 = new Scanner(System.in);
        System.out.print("What is your favorite color");
        String color = scan1.next();
        System.out.println("I also like the color "+ color);

        Scanner scan2 = new Scanner(System.in);
        System.out.print("What is your favorite food");
        String food = scan2.next();
        System.out.println(food+ " is delicious!");

        Scanner scan3 = new Scanner(System.in);
        System.out.print("What is your favorite sport");
        String sport = scan3.next();
        System.out.println("I also like "+ sport);

        Scanner scan4 = new Scanner(System.in);
        System.out.print("How old are you? ");
        String age = scan4.next();
        System.out.println("I remember when I was "+ age);

        scan.close();
    }
}
