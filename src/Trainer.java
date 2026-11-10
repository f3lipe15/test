public class Trainer extends Person{

    private String specialization;
    private int experienceYears;

    public Trainer(int id, String name, int age, String specialization, int experienceYears) {
        super(id, name, age);

        setExperienceYears(experienceYears);
        setSpecialization(specialization);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if (specialization.isBlank() || specialization == null) {
            throw new IllegalArgumentException("Specialization cannot be blank");
        }

        this.specialization = specialization;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears <= 0) {
            throw new IllegalArgumentException("Experience years must be greater than 0!");
        }

        this.experienceYears = experienceYears;
    }
}
