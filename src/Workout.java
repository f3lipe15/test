public class Workout {

    private final int id;
    private final int memberId;
    private String type;
    private double distance;
    private int duration;

    public  Workout(int id, int memberId, String type, double distance, int duration) {
        if (id <= 0) {
            throw new IllegalArgumentException("id cannot be negative");
        }

        this.id = id;

        if (memberId <= 0) {
            throw new IllegalArgumentException("memberId cannot be negative");
        }

        this.memberId = memberId;
        this.type = type;
        this.distance = distance;
        this.duration = duration;
    }

    public Workout(int id, int memberId, String type) {

        this(id, memberId, type, 0.0, 30);
    }

    public int getId() {
        return id;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("Type is required ");
        }

        this.type = type;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        if (distance < 0.0) {
            throw new IllegalArgumentException("distance cannot be negative");
        }

        this.distance = distance;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration > 0) {
            throw new IllegalArgumentException("Invalid duration!");
        }

        this.duration = duration;
    }


}
