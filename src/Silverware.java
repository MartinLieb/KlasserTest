public class Silverware extends KitchenUtensils {

    public Silverware(int numberOfUtensils, String materiale, boolean usesPower, boolean spiseligt, double lenght) {
        super(numberOfUtensils, materiale, usesPower, spiseligt, lenght);
        this.setUsesPower(false);
        this.setSpiseligt(false);

    }
}
