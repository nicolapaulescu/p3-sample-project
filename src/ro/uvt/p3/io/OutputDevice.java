package ro.uvt.p3.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputDevice {
    private OutputStream os;
    public OutputDevice(){
        os = System.out;}
    public OutputDevice(OutputStream os){
        this.os = os;
    }
    public FileOutputStream fos(String msg) throws IOException {
        return fos(msg);
    }
    public void writeMessage(String msg) throws IOException {
        os.write(msg.getBytes());

        OutputStream os = new OutputStream() {
            @Override
            public void write(int b) throws IOException {

            }
        };
    }
}
