//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.

import java.util.ArrayList;
import java.util.List;

public class Task_3_2_1 {
    public static void main(String[] args) {

        String[] SunSystem = new String[]{"Меркурий", "Венера", "Земля", "Марс", "Юпитер"};
        List<String> planets = new ArrayList<String>();
        for (int i = 0; i < 16; i++) {
            planets.add(SunSystem[(int) (Math.random() * 4)]);
        }
        System.out.println(planets);

        List<String> UniquePlanets = new ArrayList<String>();
//        List<Byte> CountPlanets = new ArrayList<Byte>();

        for (String planet : planets) {
            if (!UniquePlanets.contains(planet)) {
                UniquePlanets.add(planet);
            }
        }

        System.out.println(UniquePlanets);


        Byte[] CountPlanets = new Byte[UniquePlanets.size()];

        for (int i = 0; i < CountPlanets.length; i++) {
            CountPlanets[i] = 0;
        }

//        for (Byte CP:CountPlanets) {
//            System.out.println(CP);
//        }
//        System.out.println(CountPlanets);

        for (int i = 0; i < planets.size(); i++) {
            for (int j = 0; j < UniquePlanets.size(); j++) {
                if (planets.get(i).equals(UniquePlanets.get(j))) {
                    CountPlanets[j]++;
                }
            }
        }
        for (int i = 0; i < UniquePlanets.size(); i++) {
            System.out.printf("Планета %s встречается в списке %d раз\n", UniquePlanets.get(i), CountPlanets[i]);
        }




    }
}


