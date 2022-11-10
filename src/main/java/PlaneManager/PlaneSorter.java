package PlaneManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PlaneSorter {

    public static Plane[] planes = {new Plane("Boeing737","Civil plane", 2010,150,20000),
            new Plane("AN-2", "Biplane", 1978,2,800),
            new Plane("A-10","Hedgehopper", 2002,2,4000)};

    public static Plane[] sortPlanesByYear(){
        Arrays.sort(planes, Comparator.comparingInt(Plane::getYear));
        return planes;
    }

    public static Plane[] sortPlanesByWeight(){
        Arrays.sort(planes, Collections.reverseOrder((Comparator.comparingInt(Plane::getWeight))));
        return planes;
    }

}
