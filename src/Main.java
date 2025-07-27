import java.util.Scanner;

class Main {
    public static void main(String[] arg) {
        String adjective1;
        String noun;
        String adjective2;
        String verb;
        String adjective3;
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective (a description): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun (person/animal/object): ");
        noun = scanner.nextLine();

        System.out.print("Enter an adjective (a description): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb (ending with -ing): ");
        verb = scanner.nextLine();

        System.out.print("Enter an adjective (a description): ");
        adjective3 = scanner.nextLine();

        System.out.println("---- Here is my tale ----");
        System.out.println("Today I decided to learn a " + adjective1 + " programming language");
        System.out.println("So I chose " + noun);
        System.out.println("Well! compared to python or javascript, " + noun + " is " + adjective2 + " verbose");
        System.out.println("However I am " + verb + " it and I wrote this " + adjective3 + " story to document my journey.");
        System.out.println("Peace out!");

        scanner.close();
    }
}