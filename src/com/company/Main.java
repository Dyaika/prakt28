package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void fDir(File directory){
        List<File> fileList = new ArrayList<File>();
        File[] fileArray = directory.listFiles();
        for (File f:
             fileArray) {
            fileList.add(f);
        }
        for(int i = 0; i < 5 && i < fileList.size(); i++){
            System.out.println(fileList.get(i));
        }
    }
    public static void main(String[] args) {
        fDir(new File("C:"));
    }
}
