package org.example.FileSystem.File;

import org.example.FileSystem.FileSystem;

public class File implements FileSystem {

    private final String fileName;
    private final int sizeOfFile;

    public File(String fileName, int sizeOfFile) {
        this.fileName = fileName;
        this.sizeOfFile = sizeOfFile;
    }

    @Override
    public void display() {
        System.out.println("File Name: "+this.fileName);
    }

    @Override
    public int getSize() {
        return this.sizeOfFile;
    }
}
