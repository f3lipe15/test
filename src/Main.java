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

        List<Member> members = fitnessClubService.getAllMembers();
        List<Workout> workouts = workoutService.getAllWorkouts();

        System.out.println("===== FITNESS CLUB MANAGER =====");
        System.out.println("\nMembers:");
        members.forEach(member ->
                System.out.println(member.getId() + " | "
                        + member.getName() + " | "
                        + member.getAge() + " | "
                        + member.isActive()));

        System.out.println("\nActive members: " + fitnessClubService.countActiveMembers());

        System.out.println("\nWorkouts: ");
        workouts.forEach(workout ->
                System.out.println(workout.getId() + " | "
                + workout.getType() + " | "
                + workout.getDistance() + " | "
                + workout.getDuration() + " | "));

        System.out.println("\nSTATISTICS:");

        System.out.println("Total distance: " + workoutService.calculateTotalDistance() + " km");
        System.out.println("Average duration: " + workoutService.calculateAverageDuration() + " min");
        System.out.println("Longest workout: " + workoutService.findLongestWorkout());




    }
}