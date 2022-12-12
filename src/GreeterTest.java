
import org.junit.Test;
import org.junit.Assert;

public class GreeterTest {
@Test
public void  GreeterTest1() {
    Greeter greet = new Greeter("Hello");
    String expected = "Hello, Lola!";
    String actual = greet.Greet(" Lola");
    Assert.assertEquals(expected, actual);
    }
@Test
public void  GreeterTest2() {
    Greeter greet = new Greeter("Hiya");
    String expected = "Hiya, Fae!";
    String actual = greet.Greet(" Fae");
    Assert.assertEquals(expected, actual);
    }
@Test
public void GreeterTest3() {
   Greeter greet = new Greeter("Boo");
   String expected = "Boo, Yah!";
   String actual = greet.Greet( " Yah");
   Assert.assertEquals(expected, actual);
    }

    @Test
    void simonTest() {
        SimonGreeter greet = new SimonGreeter("Hiya");
        Assert.assertEquals("Simon says, Hiya, Moose!", greet.greet("Moose"));
    }

    @Test
    void simonTest2() {
        SimonGreeter greet = new SimonGreeter("Chao");
        Assert.assertEquals("Simon says, Chao, Sunshine!", greet.greet("Sunshine"));
    }

    @Test
    void loudTest() {
        LoudGreeter greet = new LoudGreeter("Allo");
        Assert.assertEquals("Allo, Nyx!!", greet.greet("Nyx"));
    }

    @Test
    void loudTest2() {
        LoudGreeter greet = new LoudGreeter("Cheerio");
        Assert.assertEquals("Cheerio!, Govna!!", greet.greet("Govna"));
    }

    @Test
    void htmltest() {
        HtmlGreeter htmlgreet = new HtmlGreeter("Hey");
        Assert.assertEquals("<h1>Hey, Cake!<h1>", htmlgreet.greet("Cake"));
    }

    @Test
    void htmltest2() {
        HtmlGreeter htmlgreet = new HtmlGreeter("Here");
        Assert.assertEquals("<h1>Here, Gemma!<h1>", htmlgreet.greet("Gemma"));
    }

}
