package com.kozachenko.lesson.lesson10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkWithFileSample {

    private static WorkWithFileSample fileSample;

    private WorkWithFileSample() {
    }

    public static WorkWithFileSample getInstance(){
        if(fileSample == null){
            fileSample = new WorkWithFileSample();
            return fileSample;
        } else {
            return fileSample;
        }
    }

    private File getFile(String fileName) throws IOException {
        File file = new File(fileName);

        checkAndCreate(file);
        return file;
    }

    private void checkAndCreate(File file) throws IOException {
        if(file.exists()){
            System.out.println("File exists " + file.getName());
        } else {
            file.createNewFile();
            System.out.println("File " + file.getName() + " was created");
        }
    }

    private String read(File file){
        System.out.println("START read for file");
        StringBuffer buffer = new StringBuffer();
        try(FileInputStream inputStream = new FileInputStream(file)) {
            int data;
            while ((data = inputStream.read()) != -1){
                buffer.append((char) data);
            }

        } catch (IOException e) {
            System.out.println("Input Error");
        }
        return buffer.toString();
    }

    private void write(String smth, File file){
        System.out.println("START write to file");
        try(FileOutputStream outputStream = new FileOutputStream(file)){
            byte [] buff = smth.getBytes();
            outputStream.write(buff);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("END write to file");
    }

    public static void main(String[] args) {
        WorkWithFileSample sample = WorkWithFileSample.getInstance();
        try {
            String fileName = "src/main/java/com/kozachenko/lesson/lesson10/java3011.txt";
            File simpleFile = sample.getFile(fileName);
            String str = "Hello File! This is Wonderfull World! !@34";
            sample.write(str, simpleFile);
            System.out.println(sample.read(simpleFile));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
