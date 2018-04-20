package Assignments.SizeOfDirectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Directory {
    private Path givenPath;
    private long startSize;

    /* Constructor of Directory.
     *  This class only takes one argument which is the givenPath to be used in other functions. */
    public Directory(Path givenPath) {
        this.givenPath = givenPath;
        this.startSize = 0;
    }

    /* getTotalSizeOfDirectory is a getter that prints the total size of the directory. */
    public void getTotalSizeOfDirectory() {

        // Assign the total size of directory to a long variable and print to console.
        long totalSize = computeFileSizes(givenPath, startSize);
        System.out.println("The total size of files in the given directory is: " + convertBytes(totalSize));
        System.exit(0);
    }

    /**
     * computeFileSizes will compute the size of all files in the directory recursively.
     *
     * @param givenPath   The directory to compute files within.
     * @param currentSize The current size of computed files.
     * @return Returns the total size of all computed files as a long variable.
     */
    private long computeFileSizes(Path givenPath, long currentSize) {

        /* The givenPath is checked to make sure it exists, otherwise it throws an exception */
        if (Files.exists(givenPath)) {

            /* Check if the givenPath is a accepted Directory */
            if (isPathDirectory(givenPath)) {

                /* Saves all file- and directory names in givenPath in an array of strings. */
                String[] filesInDirectory = givenPath.toFile().list();

                /* Check if the directory is empty. If it is, do nothing.
                   Otherwise it will call itself with a new Path from the array filesInDirectory and it will
                   continue to do this until all files have been checked.
                   currentSize changes respectively for each file size that has been added. */
                if (filesInDirectory != null) {
                    for (String file : filesInDirectory) {
                        currentSize = computeFileSizes(Paths.get(givenPath.toString(), "/", file), currentSize);
                    }
                }

                /* If the givenPath is not a directory we check to see if its a accepted regular file. */
            } else if (isPathRegularFile(givenPath)) {

                /* If the file is indeed an accepted regular file we then compute the size of the file
                   to our variable, currentSize. If an error occurs in the process we throw an exception.*/
                try {
                    currentSize += Files.size(givenPath);
                } catch (IOException e) {
                    System.out.println("Was unable to receive file size!");
                    e.getMessage();
                }
            }

            /* In case the directory does not exist we throw an exception. */
        } else {
            System.out.println("The given path does not exist!");
        }

        return currentSize;
    }

    /**
     * Help function to convert bytes to human readable format.
     *
     * @param bytes The amount of bytes to be converted.
     * @return Returns a formatted string.
     */
    private static String convertBytes(double bytes) {
        String[] byteType = {"bytes", "KB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB"};
        int index;

        for (index = 0; index < byteType.length; index++) {
            if (bytes < 1024) {
                break;
            }
            bytes = bytes / 1024;
        }

        return String.format("%." + 2 + "f", bytes) + " " + byteType[index];
    }

    /* Help function to check if a given path is a directory and is also readable */
    private static boolean isPathDirectory(Path path) {
        return Files.isDirectory(path) && Files.isReadable(path);
    }

    /* Help function to check if a given path is a regular file and is also readable */
    private static boolean isPathRegularFile(Path path) {
        return Files.isRegularFile(path) && Files.isReadable(path);
    }
}
