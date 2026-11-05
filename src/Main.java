public class Main {

    public static void main(String[] args) {

        Member member1 = new Member(1, "Jan Kowalski", 25, true);
        Member member2 = new Member(2, "Anna Nowak", 30, true);
        Member member3 = new Member(3, "Piotr Zielinski", 22, false);

        Workout workout1 = new Workout(1, 1, "Running", 10.0, 55);
        Workout workout2 = new Workout(2, 1, "Cycling", 40.0, 90);
        Workout workout3 = new Workout(3, 2, "Swimming", 1.5, 45);
        Workout workout4 = new Workout(4, 3, "Gym", 0.0, 60);

    }
}