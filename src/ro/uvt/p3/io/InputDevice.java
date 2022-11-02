package ro.uvt.p3.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputDevice {
    InputStream is;

    public InputDevice(FileInputStream fileInputStream) {
    }


    public String nextLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        int n = is.read();
        while (n != -1 && n != '\n'){
            sb.append((char) n);
            n = is.read();
        }
        return sb.toString();
    }


}
