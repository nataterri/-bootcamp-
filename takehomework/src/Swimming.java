public class Swimming {

    private String swimmerName;

    private int swimmerAge;

    private String[] favoriteStrokes;

    private boolean isCompetitiveSwimmer;

    public Swimming(String swimmerName, int swimmerAge,
            String[] favoriteStrokes, boolean isCompetitiveSwimmer) {
        this.swimmerName = swimmerName;
        this.swimmerAge = swimmerAge;
        this.favoriteStrokes = favoriteStrokes;
        this.isCompetitiveSwimmer = isCompetitiveSwimmer;
    }

    public String getSwimmerName() {
        return swimmerName;
    }

    public void setSwimmerName(String swimmerName) {
        this.swimmerName = swimmerName;
    }

    public int getSwimmerAge() {
        return swimmerAge;
    }

    public void setSwimmerAge(int swimmerAge) {
        this.swimmerAge = swimmerAge;
    }

    public String[] getFavoriteStrokes() {
        return favoriteStrokes;
    }

    public void setFavoriteStrokes(String[] favoriteStrokes) {
        this.favoriteStrokes = favoriteStrokes;
    }

    public boolean isCompetitiveSwimmer() {
        return isCompetitiveSwimmer;
    }

    public void setCompetitiveSwimmer(boolean competitiveSwimmer) {
        isCompetitiveSwimmer = competitiveSwimmer;
    }

    public void swim() {
        System.out.println(swimmerName + " is swimming.");
        System.out.print("Favorite strokes: ");
        for (String stroke : favoriteStrokes) {
            System.out.print(stroke + " ");
        }
        System.out.println();

        if (isCompetitiveSwimmer) {
            System.out.println("Swimmer is a competitive swimmer.");
        } else {
            System.out.println("Swimmer is not a competitive swimmer.");
        }
    }

    public static void main(String[] args) {
        String[] favoriteStrokes = {"freestyle", "breastroke"};
        Swimming swimmer1 = new Swimming("Natasha", 30, favoriteStrokes, true);
        swimmer1.swim();
        // Natasha is swimming.
        // Favorite strokes: freestyle breastroke
        // Swimmer is a competitive swimmer.
        swimmer1.setSwimmerAge(30);
        System.out.println(swimmer1.getSwimmerAge()); // 30
    }
}
