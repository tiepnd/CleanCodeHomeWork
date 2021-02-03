package com.homework.phan1.bean;

import com.homework.phan1.interfaces.IFile;

public class GIF extends GraphicEditor implements IFile {
    @Override
    public void openFile() {
        System.out.println("open file GIF from: " + filePath);
    }

    @Override
    public void parseFile() {
        System.out.println("parse file GIF from: " + filePath);
    }

    @Override
    public void saveFile() {
        System.out.println("save file GIF from: " + filePath);
    }

    @Override
    public void setFilePath(String filePath) {
        super.filePath = filePath;
    }

    @Override
    public String getFilePath() {
        return filePath;
    }
}
