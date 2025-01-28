public class Shelter {
    private int defenseLevel;
    private int numberOfSupplies;

    public Shelter(int pdefenseLevel, int pnumberOfSupplies) {
        defenseLevel = pdefenseLevel;
        numberOfSupplies = pnumberOfSupplies;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public void setDefenseLevel(int defenseLevel) {
        this.defenseLevel = defenseLevel;
    }

    public int getNumberOfSupplies() {
        return numberOfSupplies;
    }

    public void setNumberOfSupplies(int numberOfSupplies) {
        this.numberOfSupplies = numberOfSupplies;
    }

    public void printInfo() {
        System.out.println("Defense Level: " + defenseLevel);
        System.out.println("Number of supplies: " + numberOfSupplies);
    }
}
