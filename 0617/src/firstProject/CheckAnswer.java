package firstProject;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CheckAnswer {
    public static ArrayList<Point> answer = new ArrayList<>(
            Arrays.asList(
                    new Point(340, 627),    // 나무
                    new Point(23, 460),    // 텐트
                    new Point(86, 135),    // 별
                    new Point(575, 121),    // 달
                    new Point(414, 215),    // 원숭이귀
                    new Point(644, 279),    // 빨간나뭇잎
                    new Point(431, 582)     // 허리나뭇잎
            )
    );

    public static boolean check(Point userClick){
        for (Point point : answer){
            if ((point.x+15 > userClick.x && point.x-15 < userClick.x)
                    && (point.y+15 > userClick.y && point.y-15 < userClick.y)){
                answer.remove(point);
                return true;
            }
        }
        return false;
    }

//    public static void main(String[] args) {
//        Point x = new Point(340,627);
//        System.out.println(x.x == (answer.getFirst().x) );
//    }

}
