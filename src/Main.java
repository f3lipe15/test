import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Member> members = new ArrayList<>();

        List<Workout> workouts = new ArrayList<>();

        members.add(new Member(1, "Jan Kowalski", 25, true));
        members.add(new Member(2, "Anna Nowak", 30, true));
        members.add(new Member(3, "Piotr Zielinski", 22, false));

        workouts.add(new Workout(1, 1, "Running", 10.0, 55));
        workouts.add(new Workout(2, 1, "Cycling", 40.0, 90));
        workouts.add(new Workout(3, 2, "Swimming", 1.5, 45));
        workouts.add(new Workout(4, 3, "Gym", 0.0, 60));

    }
}