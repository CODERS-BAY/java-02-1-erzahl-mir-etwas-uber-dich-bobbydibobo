import java.util.Scanner;

public class AboutYouAndMe {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();

        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("Are you married? (True/False)");
        boolean isMarried = scanner.nextBoolean();

        System.out.println("What is your size in meters? (Asking about your height btw... other sizes excluded)");
        double size = scanner.nextDouble();

        if (isMarried == true){
            System.out.printf("%nMy name is %s %s and I am %d years old. I am married and my size is %s meters.",firstName, lastName, age, size);
        } else {
            System.out.printf("%nMy name is %s %s and I am %d years old. I am not married and my size is %s meters.",firstName, lastName, age, size);
        }

    }
}
