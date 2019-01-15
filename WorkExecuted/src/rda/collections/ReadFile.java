package rda.collections;

import java.lang.StringBuilder;
import java.util.Set;
import java.io.File;
import java.util.Scanner;

public class ReadFile {

    public static StringBuilder getStringFromFile() {
//public static void main(String[] args) {

        StringBuilder resultSrt = new StringBuilder("");
        try {
//            System.out.print("Enter the file name with extension : ");
//            Scanner input = new Scanner(System.in);
            String filePath = "E:\\User_data\\Рычагов\\Личное\\Java\\HW\\Collections\\WorkExecuted\\src\\rda\\collections\\repka.txt";

//            File file = new File(input.nextLine());
            File file = new File(filePath);

            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                resultSrt = resultSrt.append(input.nextLine());
            }
            input.close();
//            System.out.println(resultSrt);
            return resultSrt;

        } catch (Exception ex) {
            ex.printStackTrace();
            return resultSrt;

        }
    }
}
