package com.homework.phan1.interfaces;

public interface IFile {
    void openFile();

    void parseFile();

    void saveFile();

    void setFilePath(String filePath);

    String getFilePath();
}
