package Assignments.SizeOfDirectory;

import javafx.application.Application;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main extends Application {

    /** The program extends Application in order to create a DirectoryChooser to enable the user
     *  to choose a folder manually if they don't enter any run arguments. */
    @Override
    public void start(Stage primaryStage) {
        // Creating the DirectoryChooser window and set a fitting title.
        DirectoryChooser chooser = new DirectoryChooser();
        chooser.setTitle("Choose folder to be checked");

        /* Save the chosen folder as a Path */
        Path chosenDirectory = Paths.get(chooser.showDialog(primaryStage).getPath());

        /* Create a new Directory with the saved Path */
        Directory directory = new Directory(chosenDirectory);

        /* Call the getTotalSizeOfDirectory of the given Directory */
        directory.getTotalSizeOfDirectory();
    }

    /* We wish to enable the user to either: Enter <1> argument (path to a directory)
       or Enter <None> if they wish to use a DirectoryChooser to choose the desired directory.*/
    public static void main(String[] args) {
        if (args.length == 0) {

            /* Launch the DirectoryChooser window if no arguments are given */
            launch(args);

        } else if (args.length == 1) {

            /* If a single argument is given we use this argument as our path to a directory
               and then compute the total size of the given directory. */
            Directory directory = new Directory(Paths.get(args[0]));
            directory.getTotalSizeOfDirectory();

        } else {

            /* In case none of these criteria are met we make the user aware */
            System.out.println("[ERROR] | Only <1> or <0> argument(s) are allowed!");
            System.out.println("Please enter the full path of a directory or enter no arguments to enter DirectoryChooser mode.");
        }
    }
}
