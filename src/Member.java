public class Member {

    private final int id;
    private String name;
    private int age;
    private boolean active;

    public Member(int id, String name, int age, boolean active) {

        if (id <= 0) {
            throw new IllegalArgumentException("ID must be greater than 0.");
        }

        this.id = id;
        setName(name);
        setAge(age);
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name!");
        }


        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 16 || age > 100) {
            throw new IllegalArgumentException("Invalid age!");
        }

        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
