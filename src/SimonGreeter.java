public class SimonGreeter extends Greeter {
    public SimonGreeter(String greeting) {
        super(greeting);
    }
    public String greet(String name) {
        return ("Simon says, " + greeting + ", " + name + "!");
    }
}
