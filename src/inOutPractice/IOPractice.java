package inOutPractice;
import java.nio.file.*;
import java.io.IOException;
import java.io.*;
import java.util.*;


public class IOPractice {
    public static void main(String[] args) throws IOException {
        try ( DataOutputStream dout =
                      new DataOutputStream(new FileOutputStream("data.txt")) ) {
            dout.writeDouble(1.1);
            dout.writeInt(55);
            dout.writeBoolean(true);
            dout.writeChar('4');
        }
    }
}
