package org.example.IteratorPattern.iterator;

import org.example.FileSystem.FileSystem;

public interface Iterator {

    public boolean hasNext();
    public FileSystem next();

}
