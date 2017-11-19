import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Mushroom> basket = new ArrayList<>();
        System.out.println("Sbiram houby...... \n Sbiram houby......\n");
        for (int i = 0; i < 50; i++) {
            Mushroom mushroom = new Mushroom();
            basket.add(mushroom);
        }

        int[] counter = new int[EdibleMushrooms.values().length];
        int edible = 0;
        for (Mushroom mushroom : basket) {
            if (mushroom.isEdible()) {
                edible++;
                counter[EdibleMushrooms.valueOf(mushroom.getType()).ordinal()] ++;
            }
        }
        int maxIndex = 0;
        for (int a = 0; a < counter.length;a++) {
            if (maxIndex < counter[a]) {
                maxIndex = a;
            }
        }

        System.out.println("Nasel jsem " + edible + " jedlych hub.\n");
        System.out.println("Z jedlych mam nejvice " + counter[maxIndex] + " " + EdibleMushrooms.values()[counter[maxIndex]] );

        for(Mushroom mushroom : basket) {
            System.out.println(mushroom.getType());
        }
    }
}
