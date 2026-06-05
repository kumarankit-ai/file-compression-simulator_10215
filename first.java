import java.util.Scanner;

// Compressor class for compression and decompression
class Compressor {

    // Method to compress a string using Run-Length Encoding (RLE)
    public String compress(String input) {

        // Check if string is empty
        if (input == null || input.length() == 0) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        // Traverse the string
        for (int i = 0; i < input.length() - 1; i++) {

            // Count consecutive repeating characters
            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {

                // Append character and count
                compressed.append(input.charAt(i));
                compressed.append(count);

                // Reset count
                count = 1;
            }
        }

        // Append the last character and its count
        compressed.append(input.charAt(input.length() - 1));
        compressed.append(count);

        return compressed.toString();
    }

    // Method to decompress the compressed string
    public String decompress(String compressed) {

        StringBuilder decompressed = new StringBuilder();

        // Traverse compressed string
        for (int i = 0; i < compressed.length(); i += 2) {

            char ch = compressed.charAt(i);
            int count = Character.getNumericValue(compressed.charAt(i + 1));

            // Repeat character according to count
            for (int j = 0; j < count; j++) {
                decompressed.append(ch);
            }
        }

        return decompressed.toString();
    }
}

// Main class
public class CompressionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Compressor object
        Compressor compressor = new Compressor();

        // Take input from user
        System.out.print("Enter String: ");
        String originalString = sc.nextLine();

        // Compress the string
        String compressedString = compressor.compress(originalString);

        // Decompress the string
        String decompressedString = compressor.decompress(compressedString);

        // Display results
        System.out.println("\n===== FILE COMPRESSION SIMULATOR =====");
        System.out.println("Original String     : " + originalString);
        System.out.println("Compressed String   : " + compressedString);
        System.out.println("Decompressed String : " + decompressedString);

        // Validation
        if (originalString.equals(decompressedString)) {
            System.out.println("\nStatus: Decompression Successful!");
        } else {
            System.out.println("\nStatus: Decompression Failed!");
        }

        sc.close();
    }
}
