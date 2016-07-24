
public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, World.");
        Display b2 = new UpDownBorder(b1, '-');
        Display b3 = new FullBorder(b2);
        
        b1.show();
        b2.show();
        b3.show();
        
        Display b4 = new SideBorder(
                        new FullBorder(
                            new UpDownBorder(
                                new SideBorder(
                                    new FullBorder(
                                        new StringDisplay("Hello")
                                    ),
                                    '*'
                                ),
                                '-'
                            )
                        ),
                    '/');
        b4.show();
        
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("Good Morning");
        md.add("Hello");
        md.add("Good night!");
        md.show();
        
        Display d5 = new SideBorder(md, '#');
        d5.show();
        Display d6 = new FullBorder(d5);
        d6.show();
    }
}
