package com.kozachenko.lesson.lesson10;

import java.io.*;

public class WriteToFile {

    public static void main(String[] args) {
        String path = IoSample.directoryName + "/" + IoSample.fileName;
        //String text = "Fire! Fire!";
        //writerToFile(path);

        String newDirName = IoSample.directoryName+ "/"+ "NewFileNewPackage";
        //August02IO.createMyOwnDir(newDirName);

        try(FileInputStream inputStream = new FileInputStream(path) ) {
            int c;
            StringBuilder builder = new StringBuilder();
            while ((c = inputStream.read())!= -1){
                builder.append((char) c);
            }

            System.out.println(builder.toString());
            writerToFile(newDirName+"/"+"new.txt", builder.toString());

        } catch (IOException e) {
            System.out.println("Trouble");
        }


    }

    private static void writerToFile(String path, String text) {
        File file = new File(path);
        try(FileOutputStream stream = new FileOutputStream(file)) {
            stream.write(text.getBytes());
        } catch (IOException e) {
            System.out.println("Trouble ");
        }
    }


}
