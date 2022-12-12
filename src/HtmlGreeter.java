public class HtmlGreeter extends Greeter {
    private String tagName;

    @Override
    public String greet(String name) {
        return ("<" + tagName + ">" + super.Greet(name) + "<" + tagName + ">");
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagname) {
        this.tagName = tagname;
    }

    public HtmlGreeter(String greeting) {
        super(greeting);
        tagName = "h1";
    }
}
