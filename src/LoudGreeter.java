public class LoudGreeter extends Greeter {
    private String extra = "!";

    public LoudGreeter(String greeting) {
        super(greeting);
    }
    public void addVolume() {
        extra += "!";
    }
    @Override
    public String greet(String name) {
        return (greet(name) + extra);
    }

}