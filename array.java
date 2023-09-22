import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 95;
        marks[1] = 98;
        marks[2] = 97;
        // length
        System.out.println(marks.length);
        // print value
        System.out.println(marks[2]);

        // Sorting an array
        Arrays.sort(marks);
        System.out.println(marks[2]);
        int[] marks1 = { 87, 98, 99, 97, 96 };
        System.out.println(marks1.length);

        // 2-d array
        int[][] student_marks = { { 97, 89, 79, 89 }, { 98, 87, 78, 98 } };
        System.out.println(student_marks[0][2]);
    }
}
