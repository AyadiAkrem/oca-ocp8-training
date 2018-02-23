package com.oca8.training.chapter7.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HandlingExceptionExemplified {

    public void readFile(String file) throws FileNotFoundException{
        System.out.println("Read File");
        throw new FileNotFoundException();
    }

    void useReadFile(String name) throws FileNotFoundException{

        System.out.println("Use readFile");
        try{

            readFile(name);
        }catch(FileNotFoundException ex){
            // code
        }
    }

    public static void main(String[] args) {
        try {
            new HandlingExceptionExemplified().useReadFile("hello");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class ClassExc {


    public static void main(String[] args) throws IOException {

        try {
            System.out.println("GG");

            throw new IOException();
        } catch (IOException e) {
            System.out.println("IO");
            try {
                throw new NullPointerException() ;
            }catch (Exception ex){
                System.out.println("Insider");
            }finally {
                System.out.println("Finally");
            }

        }catch (Exception ex){
            System.out.println(ex);
            System.out.println("Ex");
        }finally {
            System.out.println("End");
        }
        throw new IOException();
    }
}
