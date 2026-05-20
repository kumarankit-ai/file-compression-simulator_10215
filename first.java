import java.util.Scanner;
public class FileCompressionSimulator {
    public static String compress(String data) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 0; i < data.length(); i++) {
            while (i < data.length() - 1 && data.charAt(i) == data.charAt(i + 1)) {
                count++;
                i++;
            }
            compressed.append(data.charAt(i));
            compressed.append(count);
            count = 1;
        }
        return compressed.toString();
    }
    public static String decompress(String data) {
        StringBuilder decompressed = new StringBuilder();
        for (int i = 0; i < data.length(); i += 2) {
            char ch = data.charAt(i);
            int count = data.charAt(i + 1) - '0';
            for (int j = 0; j < count; j++) {
                decompressed.append(ch);
            }
        }
        return decompressed.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file data: ");
        String input = sc.nextLine();
        String compressed = compress(input);
        System.out.println("\nCompressed Data: " + compressed);
        String decompressed = decompress(compressed);
        System.out.println("Decompressed Data: " + decompressed);
        sc.close();
    }
}
