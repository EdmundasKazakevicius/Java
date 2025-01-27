package org.example;

import java.util.ArrayList;

public class GymClass {
    private String className;
    private String schedule;
    private ArrayList<Member> enrolledMembers;

//    public Membership(int membershipId, int memberId) {
//        this.membershipId = membershipId;
//        this.memberId = memberId;
//}

    public GymClass(String className, String schedule) {
        this.className = className;
        this.schedule = schedule;
        this.enrolledMembers = new ArrayList<>();
    }

    public void enroll(Member member) {
        enrolledMembers.add(member);
    }


    @Override
    public String toString() {
        String enrolledMembersToString = className + " (" + schedule + "): ";
        int howManyMembers = enrolledMembers.size();
        for (int i = 0; i < howManyMembers; i++) {
            enrolledMembersToString = enrolledMembersToString + enrolledMembers.get(i).getName();
            if (i < howManyMembers - 1) {
                enrolledMembersToString = enrolledMembersToString + (", ");
            }
        }
        return enrolledMembersToString;
    }


}
