package ro.uvt.p3;

import ro.uvt.p3.io.InputDevice;
import ro.uvt.p3.io.OutputDevice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        InputDevice id = new InputDevice(new FileInputStream("lab55.txt"));
        try {
            OutputDevice od = new OutputDevice(new FileOutputStream("lab5.txt"));
            od.writeMessage("gasit");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
