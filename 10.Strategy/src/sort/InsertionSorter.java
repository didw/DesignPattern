package sort;

public class InsertionSorter implements Sorter {

    @Override
    public void sort(Comparable[] data) {
        for (int i = 1; i < data.length; ++i) {
            int j = i;
            while (j > 0 && data[j].compareTo(data[j-1]) < 0) { 
                Comparable passingplace = data[j];
                data[j] = data[j-1];
                data[j-1] = passingplace;
                j--;
            }
        }
    }
}
