//import org.apache.commons.lang3.StringUtils;

public class SquareCubeTable {
    private int num;
    SquareCubeTable(int num) {
        this.num = num;
    }
    public void buildTable() {
        String line = new String(new char[48]).replace('\0', '-');

        System.out.println(line);

        System.out.printf("|%-10s|%-10s|%-10s|%n",
                "Number", "Square", "Cube");

        for(int idx=1; idx<=this.num; idx++) {
            System.out.printf("|%10d|%10d|%10d|%n",(idx),(idx*idx),(idx*idx*idx));
        }
        System.out.println(line);
    }
    public static void main(String args[]) {
        SquareCubeTable sct = new SquareCubeTable(10);
        sct.buildTable();

    }
}