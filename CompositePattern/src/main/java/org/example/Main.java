package org.example;

import org.example.FileSystem.File.File;
import org.example.FileSystem.Folder.Folder;

public class Main {
    public static void main(String[] args) {
        //Now let's create our file system

        // Creating individual files
        File file1 = new File("Document.txt", 30);
        File file2 = new File("Presentation.ppt", 50);
        File file3 = new File("Spreadsheet.xls", 70);
        File file4 = new File("Image.jpg", 100);

        // Creating folders
        Folder rootFolder = new Folder("Root");
        Folder documentsFolder = new Folder("Documents");
        Folder imagesFolder = new Folder("Images");
        Folder personalFolder = new Folder("Personal");

        // Building the file system
        documentsFolder.addComponent(file1);
        documentsFolder.addComponent(file2);
        documentsFolder.addComponent(file3);

        imagesFolder.addComponent(file4);

        personalFolder.addComponent(new File("PersonalNote.txt", 20));
        personalFolder.addComponent(new File("Secret.pdf", 40));

        rootFolder.addComponent(documentsFolder);
        rootFolder.addComponent(imagesFolder);
        rootFolder.addComponent(personalFolder);

        // Displaying the structure
        System.out.println("Displaying the file system structure:");
        rootFolder.display();

        // Calculating total size
        System.out.println("\nTotal size of the Root folder: " + rootFolder.getSize() + "KB");


    }
}