package testing;

public class cektype {
    public static void main(String[] args) {
        Object data[] = {1, "ka", 67, "wah", "1772", "edukasi", 7, 98, -1};
        int lengthData = data.length;
        for (int i = 0; i < lengthData; i++) {
            Object valueData = data[i];
            String name = valueData.getClass().getName();
            System.out.println("indek ke " + i + " adalah " + name + " dengan data " + valueData);

        }
    }
}
