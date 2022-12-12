public class Greeter {
    public String greeting;
    public String name;

    public String getGreeting() {

        return this.greeting;
    }
    public void setGreeting(String B) {
        this.greeting = B;
    }
    public Greeter(String greeting) { //constructor
        this.greeting = greeting;
    }
    public String Greet(String name) {
        this.name = name;
        return this.greeting + this.name + "!";
    }

}