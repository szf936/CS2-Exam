public class SurvivorLeader {
    private String transmission = "q2xf1t8r5w3t tm9c5i8l900d5n7heto 3g5t6hgw44y5e7bhty605rh8t5 85ml95ak2k5r7qw5ksp295e5t7p45 o5i3n 6z5n205 9soe5o8hhg5lygtt5dq7th 5 gf34s9o 35j7j5o45k99hg5kyqqcjg5mkpl20z5o629sle5k20sk5k9c5 gh73h qxp25vi8t5i3f2v1q 9x7z6t5l8r9j3o4v5l3l1w 9y5a4d6f7x2c9l5g h8s45ek6";

    private Shelter[] shelters;

    private int[] isUsed;

    public static void main(String[] args) {
        SurvivorLeader myCode = new SurvivorLeader();
    }

    public SurvivorLeader() {
        System.out.println("Goodbye World! Good luck surviving the apocalypse!");
        shelters = new Shelter[40];
        isUsed = new int[101];
        for (int i = 0; i < shelters.length; i++) {
            shelters[i] = new Shelter(((int) (Math.random() * 100) + 1), ((int) (Math.random() * 1001)));
        }

        displayShelters();
        System.out.println("It is " + checkSupplies() + " that at least two shelters have the same number of supplies.");
        System.out.println("It is " + checkDefense() + " that at least two shelters have the same defense level.");
        System.out.println();
        System.out.println(decipher(transmission));
        System.out.println();
        while (checkDefense()) {
            newDefense();
        }
        for (int i = 0; i < shelters.length; i++) {
            isUsed[shelters[i].getDefenseLevel()]++;
        }
        displayShelters();
        System.out.println();
        ProofOfStep8();
    }

    public void displayShelters() {
        for (int i = 0; i < shelters.length; i++) {
            System.out.println("Shelter " + i + ": ");
            shelters[i].printInfo();
        }
    }

    public boolean checkSupplies() {
        for (int i = 0; i < shelters.length; i++) {
            for (int j = 0; j < shelters.length && i != j; j++) {
                if (shelters[i].getNumberOfSupplies() == shelters[j].getNumberOfSupplies()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkDefense() {
        for (int i = 0; i < shelters.length; i++) {
            for (int j = 0; j < shelters.length && i != j; j++) {
                if (shelters[i].getDefenseLevel() == shelters[j].getDefenseLevel()) {
                    return true;
                }
            }
        }
        return false;
    }

    public String decipher(String input) {
        String ans = "";
        int i = 0;
        while (i < input.length()) {
            if (input.charAt(i) == '5') {
                ans += input.charAt(i + 1);
            }
            i++;
        }
        return ans;
    }

    public void newDefense() {
        for (int i = 0; i < shelters.length; i++) {
            for (int j = 0; j < shelters.length && i != j; j++) {
                if (shelters[i].getDefenseLevel() == shelters[j].getDefenseLevel()) {
                    shelters[j].setDefenseLevel((int) (Math.random() * 100) + 1);
                }
            }
        }
    }

    public void ProofOfStep8() {
        System.out.println("Indexes of how many times each defense level occurred.");
        for (int i = 1; i <= 100; i++) {
            System.out.println("Number " + i + ": " + isUsed[i]);
        }
    }
}
