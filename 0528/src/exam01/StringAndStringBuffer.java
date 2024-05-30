package exam01;

public class StringAndStringBuffer {
    public static void pro(String data) {
        System.out.println(data + "를 처리하였습니다.");
    }

    public static void main(String[] args) {
        StringBuffer cmd = new StringBuffer();
        cmd.append("insert");
        cmd.append(" into");
        cmd.append(" member");

        System.out.println(cmd);
//        pro(cmd);
        // StringBuffer 를 String 으로 변환해야 함
        pro(cmd.toString());
    }
}
