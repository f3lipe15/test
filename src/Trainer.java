public class Trainer extends Person{

    private String specialization;

    public Trainer(int id, String name, int age, String specialization) {
        super(id, name, age);

        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization() {
        this.specialization = specialization;
    }
}
