package testing;

public class fizzbuzz {
    public static void main(String[] args) {
        int[] data = {1, 2, 4, 3, 10, 11, 20, 5, 100, 200};
        int lengthArray = data.length;
        int cekFizz = 0;
        int cekBuzz = 0;
        for (int i = 0; i < lengthArray; i++) {
            int valueData = data[i];
            int cek = 0;
            if (valueData == 5) {
                cekFizz = cek + 1;
            }
            if (valueData == 11) {
                cekBuzz = cek + 1;
            }
        }
        if (cekFizz != 0 && cekBuzz != 0) {
            System.out.println("FizzBuzz");
        } else if (cekFizz != 0) {
            System.out.println("Fizz");
        } else if (cekBuzz != 0) {
            System.out.println("Buzz");
        }
    }
}
