package com.kozachenko.lesson.lesson10;

import java.io.*;

public class IOLemon {

    private static final String path ="src/main/java/com/kozachenko/lesson/lesson10/LemonSchool.txt";

    public static void main(String[] args) throws ClassNotFoundException {

//        writeBullshit(bullShit, getFile(path));
        System.out.println("------------------------------");

        //serializeLemonSer(new LemonSer("Pavel", "Durov"), "SerLemon.dat");
        deSerialize("SerLemon.dat");
        System.out.println("------------------------------");

    }

    private static File getFile(String path){
        File file = null;
        try {
            file = new File(path);

            if(!file.exists()) {
                System.out.println("File not exists");
                System.out.println();
                System.out.println("Create File");
                file.createNewFile();
            } else {
                System.out.println("File exists");
            }
        } catch (IOException e){
            System.out.println("Lemon school IO Exception");
        }
        return file;
    }

    private static void writeBullshit(String bullShit, File file){
        System.out.println("START writeBullshit()");
        try(FileOutputStream outputStream = new FileOutputStream(file)){

            byte [] bullshitInBytes = bullShit.getBytes();
            outputStream.write(bullshitInBytes);

        } catch (IOException e) {

        }
        System.out.println("END writeBullshit()");
    }

    private static String readBullShit(File file){
        System.out.println("START readBullShit()");
        StringBuffer buffer = new StringBuffer();
        try(FileInputStream inputStream = new FileInputStream(file)) {
            int data;

            while ((data = inputStream.read()) != -1){
                buffer.append((char) data);
            }

        } catch (IOException e) {
            System.out.println( " Input Error");
        }
        System.out.println("START readBullShit()");
        return buffer.toString();
    }

    private static class LemonSer implements Serializable{
        private long serialVersionUID = 2;
        private String name;
        private transient String surmane;

        public LemonSer(String name, String surname){
            this.name = name;
            this.surmane = surname;
        }

        @Override
        public String toString() {
            return "field name = " + name + " \n" + "field surname = " + surmane;
        }
    }

    private static void deSerialize(String path) throws ClassNotFoundException {
        try(ObjectInputStream stream = new ObjectInputStream(new FileInputStream(getFile(path)))){
            LemonSer ser = (LemonSer) stream.readObject();
            System.out.println(ser.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private static void serializeLemonSer(LemonSer lemonSer, String path){
        try(ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(getFile(path)))){
            stream.writeObject(lemonSer);
        } catch (IOException io){
            System.out.println("Lemon ser Error");
        }
    }
}
