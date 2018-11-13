public class KitchenUtensils {

    private int numberOfUtensils;
    private String materiale;
    private boolean usesPower;
    private boolean spiseligt;
    private double lenght;

    public KitchenUtensils(int numberOfUtensils, String materiale, boolean usesPower, boolean spiseligt, double lenght){
        this.numberOfUtensils = numberOfUtensils;
        this.materiale = materiale;
        this.usesPower = usesPower;
        this.spiseligt = spiseligt;
        this.lenght = lenght;
    }

    public KitchenUtensils(String materiale, boolean usesPower){
        this.materiale = materiale;
        this.usesPower = usesPower;
    }

    public KitchenUtensils(){

    }

    public int getNumberOfUtensils() {
        return numberOfUtensils;
    }

    public void setNumberOfUtensils(int numberOfUtensils) {
        this.numberOfUtensils = numberOfUtensils;
    }

    public String getMateriale() {
        return materiale;
    }

    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }

    public boolean isUsesPower() {
        return usesPower;
    }

    public void setUsesPower(boolean usesPower) {
        this.usesPower = usesPower;
    }

    public boolean isSpiseligt() {
        return spiseligt;
    }

    public void setSpiseligt(boolean spiseligt) {
        this.spiseligt = spiseligt;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void useUtensils(){
        System.out.println("Du brugte køkkenredskabet");

    }

    public void throwUtensils(){
        System.out.println("Du kastede køkkenredskabet");
    }

    public double addLenght(double lenght){
        this.lenght++;
        return this.lenght;
    }

    public String materialeToWood(String materiale){
        setMateriale("Wood");
        return this.materiale;
    }

    public boolean electrify(boolean usesPower){
        setUsesPower(true);
        return usesPower;
    }





}
