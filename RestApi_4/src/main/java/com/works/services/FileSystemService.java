package com.works.services;

import com.works.composite.File;
import com.works.composite.FileSystemComponent;
import com.works.composite.Folder;
import org.springframework.stereotype.Service;

@Service
public class FileSystemService {

    public long calculateSize() {
        FileSystemComponent fileSystemComponent = setup();
        return fileSystemComponent.getSize();
    }

    public FileSystemComponent setup() {
        Folder mainFolder = new Folder("mainFolder");
        File f1 = new File("a.jpg", 100);
        File f2 = new File("b.jpg", 200);

        Folder folder = new Folder("folderA");
        File f3 = new File("c.jpg", 150);
        folder.add(f3);
        mainFolder.add(f1);
        mainFolder.add(f2);
        mainFolder.add(folder);

        return mainFolder;
    }
}