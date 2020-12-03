package com.javademos;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {



    public static void main(String[] args)  {

        dosyaBilgisiGetirme();
        dosyaOku();
        yazDosya();

    }

    public static void createFile(){

        File file = new File("C:\\JAVADemos\\files\\students.txt");

        try {
            if(file.createNewFile()){
                System.out.println("Dosya Oluşturuldu.");
            }else{
                System.out.println("Dosya Zaten Mevcut!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void dosyaBilgisiGetirme(){
        File file = new File("C:\\JAVADemos\\files\\students.txt");

        if(file.exists()){
            System.out.println("Dosya Adı: "+ file.getName());
            System.out.println("Dosya Yolu: "+ file.getAbsolutePath());
            System.out.println("Dosya Okunabilirlik: "+ file.canWrite());
            System.out.println("Dosya Yazılablirlik: "+ file.canWrite());
            System.out.println("Dosya Boyutu: "+ file.length()+" KB");
        }
    }

    public static void dosyaOku(){
        File file = new File("C:\\JAVADemos\\files\\students.txt");

        System.out.println("Dosya İçeriği= ");

        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void yazDosya(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\JAVADemos\\files\\students.txt",true));
            writer.newLine();
            writer.write("Ahmet");
            System.out.println("DOSYA YAZILDI");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
