import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FitnessClubService fitnessClubService = new FitnessClubService();
        WorkoutService workoutService = new WorkoutService();



        fitnessClubService.addMember(
                new Member(1, "Jan Kowalski", 25, true)
        );

        fitnessClubService.addMember(
                new Member(2, "Anna Nowak", 30, true)
        );

        fitnessClubService.addMember(
                new Member(3, "Piotr Zielinski", 22, false)
        );

        workoutService.addWorkout(
                new Workout(1, 1, "Running", 10.0, 55)
        );
        workoutService.addWorkout(
                new Workout(2, 1, "Cycling", 40.0, 90)
        );
        workoutService.addWorkout(
                new Workout(3, 2, "Swimming", 1.5, 45)
        );
        workoutService.addWorkout(
                new Workout(4, 3, "Gym", 0.0, 60)
        );

        System.out.println(fitnessClubService.getActiveMembers());
        System.out.println(workoutService.getWorkoutsLongerThan(50));
        System.out.println(workoutService.calculateTotalDistance());
        System.out.println(workoutService.calculateTotalDistanceForMember(1));
        System.out.println(workoutService.calculateAverageSpeed(40.0, 50));
    }
}