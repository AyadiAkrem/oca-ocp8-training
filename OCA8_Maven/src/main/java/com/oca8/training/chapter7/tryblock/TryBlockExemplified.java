package com.oca8.training.chapter7.tryblock;

import java.io.FileNotFoundException;

public class TryBlockExemplified {

    public void mehtod1() {
        try {
        } catch (Exception ex) {
        }
    }

    public void mehtod2() {
        try {
        } catch (Throwable ex) {
        }
    }

    public void mehtod3() {
        try {
        } catch (RuntimeException ex) {
        }
    }

    public void mehtod4() {
        try {
            System.out.println("Hello");
            throw new FileNotFoundException();
        } catch (FileNotFoundException ex) {
        }
    }
}
