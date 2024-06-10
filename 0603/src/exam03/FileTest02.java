package exam03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class FileTest02 {
    public static void main(String[] args) {
        File file = new File("c:/data");

        String[] files = file.list();
        System.out.println(Arrays.toString(files));

    }
}
