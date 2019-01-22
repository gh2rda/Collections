package rda.collections;

import java.lang.StringBuilder;
import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFile {

    public static StringBuilder getStringFromFile() {

        StringBuilder resultSrt = new StringBuilder("");
        try {

//            URL resource = ReadFile.class.getResource("repka.txt");
            URL resource = ReadFile.class.getResource("myTXT.txt");

            String myPath = Paths.get(resource.toURI()).toFile().toString();
            System.out.println(myPath);
            File file = new File(myPath);

            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                resultSrt = resultSrt.append(input.nextLine());
            }
            input.close();
            return resultSrt;
        } catch (Exception ex) {
            ex.printStackTrace();
            return resultSrt;
        }
    }
}
