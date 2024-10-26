package org.example.IteratorPattern.iterator.impl;

import org.example.FileSystem.FileSystem;
import org.example.IteratorPattern.iterator.Iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class IteratorImpl implements Iterator {

    private final List<FileSystem> fileSystemList;
    private int position;

    public IteratorImpl(List<FileSystem> fileSystemList) {
        this.fileSystemList = fileSystemList;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return fileSystemList.size() > position;
    }

    @Override
    public FileSystem next() {
        if(!hasNext())
            throw new NoSuchElementException("No more elements present!");
        return fileSystemList.get(position++);
    }
}
