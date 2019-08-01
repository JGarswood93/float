import java.util.Scanner;

public class floatArrayTest {
    public static void main(String[] args) {
        float[] score = new float[3];
        String name;
        Scanner input = new Scanner(System.in);

        System.out.println("Student name: ");
        name = input.nextLine();

        System.out.println("Score 1: ");
        score[0] = input.nextFloat();

        System.out.println("Score 2: ");
        score[1] = input.nextFloat();

        score[2] = (score[0] + score[1]/2);

        System.out.printf("The student '%s' got % .1f and %.1f, so the average is %.2f",name,score[0],score[1],score[2]);

    }
}
