package Problem4;

import java.util.ArrayList;

public class Research {
    private String name;
    private ArrayList<Lecturer> memberList;
    private Lecturer leader;
    private long budget;

    public Research(String name, ArrayList<Lecturer> memberList, Lecturer leader, long budget) {
        this.name = name;
        this.memberList = memberList;
        this.leader = leader;
        this.budget = budget;
    }
    public Research() {
        this.name = "Default";
        this.leader = null;
        this.budget = 0;
        this.memberList = null;
    }
    public boolean joinMember(Lecturer lecturer) {
        if (this.memberList.contains(lecturer)) {
            return true;
        }
        return false;
    }

    public Lecturer getLeader() {
        return leader;
    }
}
