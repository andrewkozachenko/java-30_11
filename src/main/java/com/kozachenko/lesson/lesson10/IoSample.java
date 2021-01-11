package com.kozachenko.lesson.lesson10;

import java.io.File;
import java.io.IOException;

public class IoSample {

    public static final String directoryName = "src/FIRE_WALL";
    public static final String fileName = "FireBall.txt";

    public static void createMyOwnDir(String dirName) {
        System.out.println("Start createMyOwnDir " + dirName);
        File dir = new File( dirName);
        if (!dir.exists()) {
            dir.mkdir();
            System.out.println("Dir " + dirName + " was created");
        }
        else {
            System.out.println("Dir " + dirName + " is already exists");
        }
    }

    public static void createMyOwnFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File " + fileName +" was created");
            } catch (IOException e) {
                System.out.println("Problem with path " + fileName);
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        else {
            System.out.println("File " + fileName + " is already exists");
        }
    }

    public static void main(String[] args) {
        String dirName = "My_work";
        String fileName = "first_work.txt";
        createMyOwnDir(IoSample.directoryName);
        createMyOwnDir(dirName);
        createMyOwnFile(IoSample.directoryName + "/" +IoSample.fileName);
        createMyOwnFile(dirName+ "/" +fileName);
    }
}
