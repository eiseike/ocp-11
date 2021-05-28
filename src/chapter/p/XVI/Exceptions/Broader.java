package chapter.p.XVI.Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Broader {
    public static void main(String[] args) {


//        try {
//            throw new IOException();
//            // DNC Alternatives in a multi-catch statement cannot be related by subclassing
//        } catch (IOException | FileNotFoundException e) {
//        }


//        try {
//            throw new IOException();
//        } catch (IOException e) {
//            //DNC exception java.io.FileNotFoundException has already been caught
//        } catch (FileNotFoundException e) {
//        }

        try {
            throw new IOException();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException extends IOException");
        } catch (IOException e) {
            System.out.println("IOException"); //WILL PRINT THIS
        }


        try {
            throw new Exception(new Exception("oops"));
        } catch (Exception e) {
            e.printStackTrace();
            // java.lang.Exception: java.lang.Exception: oops
            //     at chapter.p.XVI.Exceptions.Broader.main(Broader.java:34)
            // Caused by: java.lang.Exception: oops
            //     ... 1 more
        }
    }
}
