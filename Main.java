public class Main {
    public static void main(String[] args) {
        int[][] scoreArray = {
                {85, 70, 90, 95},
                {80, 95, 90, 75},
                {75, 85, 90, 80}
        };

        System.out.println("학생들의 성적은 다음과 같습니다.");
        for (int i = 0; i < scoreArray.length; i++) {
            int sum = 0;
            System.out.print("학생 " + (i + 1) + ": ");
            for ( int j = 0; j < scoreArray[i].length; j++) {
                System.out.print(scoreArray[i][j] + " ");
                sum += scoreArray[i][j];
            }
            double average = (double) sum / scoreArray[i].length;
            System.out.println("| 평균: " + average);
        }
    }
}