public class Member extends Person{


    private boolean active;

    public Member(int id, String name, int age, boolean active) {

        super(id,name, age);

        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
