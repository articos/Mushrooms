import java.util.Random;

public class Mushroom {

    private String type;
    private int ageInDays;
    private boolean edible = true;

    public Mushroom() {
        Random rnd = new Random();
        int randomIndexEdible = rnd.nextInt(EdibleMushrooms.values().length);
        int randomIndexPoisonous = rnd.nextInt(PoisonousMushrooms.values().length);
        int randomNumberOfDays = rnd.nextInt(60);
        int switchNumber = rnd.nextInt(2);

        switch (switchNumber) {
            case 0:
                this.type = EdibleMushrooms.values()[randomIndexEdible].toString();
                break;
            case 1:
                this.type = PoisonousMushrooms.values()[randomIndexPoisonous].toString();
                break;
        }

        this.ageInDays = randomNumberOfDays;

        edible = switchNumber != 1;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAgeInDays() {
        return ageInDays;
    }

    public void setAgeInDays(int ageInDays) {
        this.ageInDays = ageInDays;
    }

    public boolean isEdible() {
        return edible;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }
}
