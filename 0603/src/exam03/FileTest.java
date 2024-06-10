package exam03;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("C:/data/bus.pan");
        try {
            Thread.sleep(3000);
            file.delete();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}