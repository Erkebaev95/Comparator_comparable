public class MilitaryPerson {
    private String name;
    private int age;
    private Rank rank;

    public MilitaryPerson(String name, int age, Rank rank) {
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "MilitaryPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rank=" + rank +
                "}\n";
    }
}
