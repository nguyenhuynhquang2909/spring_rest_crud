package Problem4;

import java.util.ArrayList;

public class Lecturer {
    private String id;
    private String name;
    private String rank;
    private Research leadResearch;
    private ArrayList<Research> joinedResearch;

    public Lecturer(String id, String name, String rank, Research leadResearch, ArrayList<Research> joinedResearch) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.leadResearch = leadResearch;
        this.joinedResearch = joinedResearch;
    }

    public boolean joineProject(Research research) {
        if (this.joinedResearch.contains(research)) {
            return true;
        }
        return false;
    }
    public boolean isLeader(Research research) {
        if (this.leadResearch.equals(research)) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public boolean setRank(String rank) {
        String[] rankList = {"As. Lecturer", "Lecturer", "Senior Lecturer"};
        boolean checked = false;
        for (String rank1: rankList) {
            if (this.rank.equals(rank1)) {
                checked = true;
                break;
            }
        }
        if (checked) {
            this.rank = rank;
            return true;
        } else {
            System.out.println("This rank is not valid");
            return false;
        }
    }

    public Research getLeadResearch() {
        return leadResearch;
    }

    public void setLeadResearch(Research leadResearch) {
        this.leadResearch = leadResearch;
    }

    public ArrayList<Research> getJoinedResearch() {
        return joinedResearch;
    }

    public void setJoinedResearch(ArrayList<Research> joinedResearch) {
        this.joinedResearch = joinedResearch;
    }
}

