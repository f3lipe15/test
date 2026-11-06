import java.util.*;

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

    public Optional<Member> findMemberById(int id) {
        return Optional.ofNullable(members.get(id));
    }

    public List<Member> getAllMembers() {
        return new ArrayList<>(members.values());
    }

    public List<Member> getActiveMembers() {
        return members.values().stream()
                .filter(Member::isActive)
                .toList();
    }

    public Long countActiveMembers() {
        return members.values().stream()
                .filter(Member::isActive)
                .count();
    }

    public void deactivateMember(int id) {
        Member member = findMemberById(id)
                .orElseThrow(() -> new NoSuchElementException("Member not found!"));

        member.setActive(false);
    }
}
