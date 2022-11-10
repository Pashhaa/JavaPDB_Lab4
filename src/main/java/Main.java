import PlaneManager.PlaneSorter;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        //За зростанням року
        Arrays.stream(PlaneSorter.sortPlanesByYear())
                .forEach(System.out::println);
        System.out.println();
        //За спаданням ваги
        Arrays.stream(PlaneSorter.sortPlanesByWeight())
                .forEach(System.out::println);
    }
}
