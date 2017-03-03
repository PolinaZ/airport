import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Polina_Z on 27.02.17.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Airplanes> list = new ArrayList<>();
        Airplanes Boeing = new Airplanes("777", 500, 315, 20, 22);
        Airplanes Airbus = new Airplanes("A320", 200, 94, 6, 6);

        list.add(Boeing);
        list.add(Airbus);

        // Comparator comporator = new SomeComparator();


        Collections.sort(list, new Comparator<Airplanes>() {
            @Override
            public int compare(Airplanes o1, Airplanes o2) {

                if (500 > 200) {
                    return 1;
                } else if (200 < 500) {
                    return -1;
                } else {
                    return 0;
                }

            }


        });


        int count = 0;
        for (Airplanes airplanes : list) {
            count = count + airplanes.getCapacity();

        }
        System.out.println(count);

        for (Airplanes airplanes : list) {
            if (airplanes.getConsumption() >= 5) {
                System.out.println(airplanes.toString());
            }

        }
    }
}



