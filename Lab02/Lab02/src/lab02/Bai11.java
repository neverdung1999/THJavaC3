package lab02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bai11 {

    public static boolean isNumeric(String str) {
	return str.matches("-?\\d+(\\.\\d+)?");
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\LeMinhDuc_1711061411\\test.txt";
        // Đọc dữ liệu từ File với Scanner
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        int total = 0;
        
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            if (isNumeric(s)){
                total += Integer.parseInt(s);
                }
            }
            System.out.println(total);
    }
    
}
