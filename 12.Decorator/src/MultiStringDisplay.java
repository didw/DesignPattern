import java.util.ArrayList;

public class MultiStringDisplay extends Display {
    private ArrayList<String> body = new ArrayList<String>();
    private int columns = 0;
    public void add(String msg) {
        body.add(msg);
        updateColumn(msg);
    }
    
    public int getColumns() {
        return columns;
    }
    
    public int getRows() {
        return body.size();
    }
    
    public String getRowText(int row) {
        return (String)body.get(row);
    }
    
    private void updateColumn(String msg) {
        if (msg.getBytes().length > columns) {
            columns = msg.getBytes().length;
        }
        for (int row = 0; row < body.size(); row++) {
            int fills = columns - ((String)body.get(row)).getBytes().length;
            if (fills > 0) {
                body.set(row, body.get(row) + spaces(fills));
            }
        }
    }

    private String spaces(int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; ++i) {
            buf.append(' ');
        }
        return buf.toString();
    }
    
}
