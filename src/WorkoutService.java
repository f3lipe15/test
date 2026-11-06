import java.util.*;

public class WorkoutService {

    private final Map<Integer, Workout> workouts = new HashMap<>();

    public void addWorkout(Workout workout) {

        if (workout == null) {
            throw new IllegalArgumentException("Workout cannot be null!");
        }

        if (workouts.containsKey(workout.getId())) {
            throw new IllegalArgumentException("Workout already exists!");
        }

        workouts.put(workout.getId(), workout);
    }

    public List<Workout> getAllWorkouts() {
        return new ArrayList<>(workouts.values());
    }

    public List<Workout> getWorkoutsByMemberId(int memberId) {
        return workouts.values().stream()
                .filter(workout -> workout.getMemberId() == memberId)
                .toList();
    }

    public List<Workout> getWorkoutsLongerThan(int minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException("Duration cannot be negative!");
        }

        return workouts.values().stream()
                .filter(workout -> workout.getDuration() < minutes)
                .toList();
    }

    public double calculateTotalDistance() {
        return workouts.values().stream()
                .mapToDouble(Workout::getDistance)
                .sum();
    }

    public double calculateAverageDuration() {
        return workouts.values().stream()
                .mapToDouble(Workout::getDuration)
                .average()
                .orElse(0.0);
    }

    public Optional<Workout> findLongestWorkout() {
        return workouts.values().stream()
                .max(Comparator.comparingInt(Workout::getDuration));
    }
}
