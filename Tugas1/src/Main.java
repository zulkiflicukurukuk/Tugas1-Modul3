import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka-angka (dipisahkan oleh spasi): ");
            String input = scanner.nextLine();
            String[] numbers = input.split(" ");

            double sum = 0;
            int count = 0;

            for (String numStr : numbers) {
                try {
                    double num = Double.parseDouble(numStr);
                    sum += num;
                    count++;
                } catch (NumberFormatException e) {
                    // Menghandle kesalahan apabila user menginput selain angka
                    System.err.println("Error: \"" + numStr + "\" bukan angka yang valid.");
                }
            }


            if (count > 0) {
                double average = sum / count;
                System.out.println("Rata-rata dari angka-angka tersebut adalah: " + average);
            } else {
                System.out.println("Tidak ada angka yang valid untuk dihitung rata-ratanya.");
            }
        } catch (ArithmeticException e) {
            // Menghandle apabila pembagian dengan 0
            System.err.println("Error: Pembagian dengan nol.");
        } finally {
            scanner.close();
        }
    }
}

