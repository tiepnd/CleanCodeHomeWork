package com.homework.phan1.bean;

import com.homework.phan1.interfaces.IFile;

public class JPG extends GraphicEditor implements IFile {
    @Override
    public void openFile() {
        System.out.println("open file JPG from: " + filePath);
    }

    @Override
    public void parseFile() {
        System.out.println("parse file JPG from: " + filePath);
    }

    @Override
    public void saveFile() {
        System.out.println("save file JPG from: " + filePath);
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
