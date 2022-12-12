import java.util.Scanner;

public class GreeterApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a greeting:");
        String greeting = scan.next();
        System.out.println("Enter your name:");
        String name = scan.next();
        Greeter hi = new Greeter(greeting);
        System.out.println(hi.Greet("," + name));
        LoudGreeter loudgreet = new LoudGreeter(greeting);
        HtmlGreeter htmlgreet = new HtmlGreeter(greeting);
        SimonGreeter simongreet = new SimonGreeter(greeting);
        loudgreet.addVolume();
        System.out.println("Would you like the default HTML tag?(y/n)");
        String y = scan.next();

        if (y.equalsIgnoreCase("b")) {
            System.out.println("Please enter your HTML tag");
            String tagName = scan.next();
            htmlgreet.setTagName(tagName);
        }

        System.out.println(loudgreet.greet(name));
        System.out.println(simongreet.greet(name));
        System.out.println(htmlgreet.greet(name));

        scan.close();

    }
}
