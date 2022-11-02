package ro.uvt.p3.io;

import java.io.IOException;
import java.io.OutputStream;

public class OutputDevice {
    private OutputStream os;
    public OutputDevice(){
        os = System.out;}
    public OutputDevice(OutputStream os){
        this.os = os;
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
