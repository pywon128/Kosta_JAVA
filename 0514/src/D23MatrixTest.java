/*
     0    1     2
 0 [  ]  [  ]  [  ]
 1 [  ]  [  ]  [  ]
 2 [  ]  [  ]  [  ]
 3 [  ]  [  ]  [  ]

 */

import java.util.Arrays;

public class D23MatrixTest {
    public static void main(String[] args){
        int[][] a = new int[4][3];

        int n = 1;
        for (int i = 0; i < 4; i++) {       // i : 0,    1,    2,    3
            for (int j = 0; j < 3; j++) {   // j : 0,1,2/0,1,2/0,1,2/0,1,2
                a[i][j] = n++;
                // 각 배열의 요소에 1부터 1씩 증가한 값을 저장

            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%5d",a[i][j]);
            }
            System.out.println();
        }


    }
}
