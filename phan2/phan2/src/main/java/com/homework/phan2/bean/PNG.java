package com.homework.phan2.bean;

import com.homework.phan2.interfaces.IFile;

public class PNG extends GraphicEditor implements IFile {
    @Override
    public void openFile() {
        System.out.println("open file PNG from: " + filePath);
    }

    @Override
    public void parseFile() {
        System.out.println("parse file PNG from: " + filePath);
    }

    @Override
    public void saveFile() {
        System.out.println("save file PNG from: " + filePath);
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
