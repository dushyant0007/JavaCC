package four_patterns;

public class One {

    public static void main(String[] args) {

        revTriangle(5, 0);
        triangle(5, 0);

    }

    public static void triangle(int row, int col) {

        if (row == 0) {
            return;
        }
        if (row > col) {
            triangle(row, col + 1);
            System.out.print(" * ");
        } else {
            triangle(row - 1, 0);
            System.out.println();
        }

    }


    public static void revTriangle(int row, int col) {

        if (row == 0) {
            return;
        }
        if (row > col) {
            System.out.print(" * ");
            revTriangle(row, col + 1);
        } else {
            System.out.println();
            revTriangle(row - 1, 0);
        }

    }


}
