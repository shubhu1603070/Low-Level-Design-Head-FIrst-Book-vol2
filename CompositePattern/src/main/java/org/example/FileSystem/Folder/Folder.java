package org.example.FileSystem.Folder;

import org.example.FileSystem.File.File;
import org.example.FileSystem.FileSystem;
import org.example.FileSystem.FileSystemIterator;
import org.example.IteratorPattern.iterator.Iterator;
import org.example.IteratorPattern.iterator.impl.IteratorImpl;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem, FileSystemIterator {


    private final String folderName;
    private int size;

    private final List<FileSystem> fileList;
    private Iterator fileSystemIterator;

    public Folder(String folderName) {
        this.folderName = folderName;
        fileList = new ArrayList<>();
    }

    public void addComponent(FileSystem fileSystem){
        fileList.add(fileSystem);
    }

    @Override
    public void display() {
        //Now we have to iterate over the fileList Which is collection we can have iterator design pattern here right?
        //So let's implement that as well
        System.out.println("Folder : "+this.folderName);
        this.fileSystemIterator = createFileSystemIterator();
        while (this.fileSystemIterator.hasNext()){
            FileSystem next = this.fileSystemIterator.next();
            next.display();
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        this.fileSystemIterator = createFileSystemIterator();
        while (this.fileSystemIterator.hasNext()){
            int size = fileSystemIterator.next().getSize();
            totalSize+=size;
        }
        return totalSize;
    }

    @Override
    public Iterator createFileSystemIterator() {
        return new IteratorImpl(this.fileList);
    }
}
