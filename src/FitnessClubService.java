import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class FitnessClubService {

    private final Map<Integer, Member> members = new HashMap<>();

    public void addMember(Member member) {
        if (member == null) {
            throw new IllegalArgumentException("Member cannot be null!");
        }

        if (members.containsKey(member.getId())) {
            throw new IllegalArgumentException("Member already exists!");
        }

        members.put(member.getId(), member);
    }
}
