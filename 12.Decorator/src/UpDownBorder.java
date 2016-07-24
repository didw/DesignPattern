
public class UpDownBorder extends Border {
    private char udChar;
    
    public UpDownBorder(Display display, char udChar) {
        super(display);
        this.udChar = udChar; 
    }
    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return makeLine(display.getColumns());
        } else if (row == display.getRows() + 1) {
            return makeLine(display.getColumns());
        } else {
            return display.getRowText(row - 1); 
        }
    }
    
    private String makeLine(int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; ++i) {
            buf.append(udChar);
        }
        return buf.toString();
    }

}
