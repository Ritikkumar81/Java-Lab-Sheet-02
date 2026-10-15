public class Q25 {
    public static void main(String[] args) {
        int[][] marks = {
            {70, 80, 75},
            {60, 65, 85},
            {90, 88, 92}
        };

        int total = 0;
        int count = 0;

        for (int[] row : marks) {
            for (int mark : row) {
                total += mark;
                count++;
            }
        }

        double average = (double) total / count;

        System.out.println("Average marks = " + average);
    }
}
