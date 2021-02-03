package com.homework.phan1.bean;

import com.homework.phan1.interfaces.IFile;

public class BMP extends GraphicEditor implements IFile {

    @Override
    public void openFile() {
        System.out.println("open file BMP from: " + filePath);
    }

    @Override
    public void parseFile() {
        System.out.println("parse file BMP from: " + filePath);
    }

    @Override
    public void saveFile() {
        System.out.println("save file BMP from: " + filePath);
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
