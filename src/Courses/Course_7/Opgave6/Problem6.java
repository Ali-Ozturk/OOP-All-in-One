package Courses.Course_7.Opgave6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Problem6 {
    public static void main(String[] args) {
        // sourceFile.txt destinationFile.txt

        String sourceFile = "sourceFile.txt";
        String destinationFile = "destinationFile.txt";

        if (args.length == 2){
            sourceFile = args[0];
            destinationFile = args[1];
        }


        Path sourcePath = Paths.get("out/production/OOP-All-in-One/Courses/Course_7/Opgave6/"+sourceFile);
        Path destinationPath = Paths.get("out/production/OOP-All-in-One/Courses/Course_7/Opgave6/"+destinationFile);

        // Create destination file if it doesn't exist already
        if (!Files.exists(destinationPath)){
            try {
                Files.createFile(destinationPath);
            } catch (IOException e){
                System.out.println("Unable to create file! | " + e.getMessage());
            }
        }

        // Copy content from sourceFile to destinationFile
        try (InputStream is = new BufferedInputStream(Files.newInputStream(sourcePath));
             OutputStream os = new BufferedOutputStream(Files.newOutputStream(destinationPath))){

            int b;

            while ((b = is.read()) != -1){
                char bUpper = (char) Character.toUpperCase(b);
                os.write(bUpper);
            }

        } catch (IOException e){
            System.out.println("Unable to read the file!");
        }

    }
}
