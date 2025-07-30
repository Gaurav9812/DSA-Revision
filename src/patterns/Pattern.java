package src.patterns.src.patterns;

public class Pattern {

    public static void main(String[] args) {
        new Pattern().pattern1(10);
    }

    /*  N =5
     *****
     *****
     *****
     *****
     *****
     */
    public void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* n=5
     *
     **
     ***
     ****
     *****
     */
    public void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    1
    12
    123
    1234*/
    public void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1));
            }
            System.out.println();
        }
    }

    // Pyramid
    public void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if ((j <= n + i - 1 && j + i >= n - 1) || (j > n + i - 1 && j < n + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Reverse Pyramid
    public void pattern8(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j >= i && j <= 2 * (n - 1) - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Pyramid + reverse pyramid
    public void pattern9(int n) {

        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if ((i < n && i + j >= n - 1 && j < n + i) || (i >= n && i + j <= 3 * n - 2 && j >= i - n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    /*
     *
     **
     ***
     ****
     ***
     **
     *
     **/
    public void pattern10(int n) {

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < n; j++) {
                if ((j <= i && i < n) || (i >= n && j < 2 * n - i - 1)) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    /*
    1      1
    12    21
    123  321
    12344321
    */
    public void pattern12(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j <= i) {
                    System.out.print(j + 1);
                } else if (i + j >= 2 * n - 1) {
                    System.out.print((2 * n) - (j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
        A
       ABA
      ABCBA
     ABCDCBA
 */
    public void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if ((i + j) >= n - 1 && j < n) {
                    System.out.print((char) ('A' + (i + j - (n - 1))));
                } else if ((i + j) <= 2 * i + n - 1 && j >= n) {
                    System.out.print((char) ('A' + ((2 * i + n - 1) - (i + j))));
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    /*
     ********
     ***  ***
     **    **
     *      *
     *      *
     **    **
     ***  ***
     ********
     * */
    public void pattern19(int n) {
        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if ((i < n && (i + j) > (n - 1) && ((i + j) < n + 2 * i)) ||
                        (i >= n && (j) > (i - n) && (i + j) < 3 * n - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

    /*
     *      *
     **    **
     ***  ***
     ********
     ***  ***
     **    **
     *      *
     **/
    public void pattern20(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if ((i < n && j > i && j < (2 * n - i - 1)) ||
                        (i >= n && j <= i) && j > (2 * n - i - 2)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }

    /*
    4 4 4 4 4 4 4
    4 3 3 3 3 3 4
    4 3 2 2 2 3 4
    4 3 2 1 2 3 4
    4 3 2 2 2 3 4
    4 3 3 3 3 3 4
    4 4 4 4 4 4 4
    */
    public void pattern22(int n) {
        for (int i = 1; i <= n * 2 - 1; i++) {
            for (int j = 1; j <= n * 2 - 1; j++) {
                int bottom = n * 2 - 1 - i + 1;
                int right = n * 2 - 1 - j + 1;
                int min = Math.min(Math.min(i, j), Math.min(bottom, right));
                System.out.print(n - min + 1 + " ");
            }
            System.out.println();
        }
    }
}