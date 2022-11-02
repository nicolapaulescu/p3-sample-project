package ro.uvt.p3.io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class InputDevice {
        public  void readMessage(){
            Scanner id = new Scanner(System.in);
            InputStream is= new InputStream() {
                @Override
                public int read() throws IOException {
                    return 0;
                }
            };
        }
}
