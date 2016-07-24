
public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }
    @Override
    public int getColumns() {
        return 2 + display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return "+" + makeLine('-', display.getColumns()+2) + "+";
        } else if (row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()+2) + "+";
        } else {
            return "| " + display.getRowText(row - 1) + " |"; 
        }
    }
    
    private String makeLine(char ch, int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; ++i) {
            buf.append(ch);
        }
        return buf.toString();
    }

}
