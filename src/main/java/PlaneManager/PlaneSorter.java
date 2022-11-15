package PlaneManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PlaneSorter {

    public static Plane[] planes = {new Plane("Boeing737","Civil plane", 2010,150,20000),
            new Plane("AN-2", "Biplane", 1978,2,800),
            new Plane("A-10","Hedgehopper", 2002,2,4000)};

    public static Plane[] sortPlanesByYearGrowing(){
        //By default, method Comparator.comparingInt sorts in ascending order of the given parameter
        Arrays.sort(planes, Comparator.comparingInt(Plane::getYearOfManufacture));
        return planes;
    }

    public static Plane[] sortPlanesByWeightLoss(){
        //method Collections.reverseOrder sorts in descending order of the specified parameter
        Arrays.sort(planes, Collections.reverseOrder((Comparator.comparingInt(Plane::getWeight))));
        return planes;
    }

}
