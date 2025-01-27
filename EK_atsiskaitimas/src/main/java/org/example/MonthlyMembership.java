package org.example;

public class MonthlyMembership extends Membership {
    //    private int membershipId;
//    private int memberId;
    private int durationOfMembership;

    public MonthlyMembership(int membershipId, int memberId, int durationOfMembership) {
        super(membershipId, memberId);
        this.durationOfMembership = durationOfMembership;
    }

    @Override
    public double getCost() {
        return durationOfMembership * 30;
    }

    @Override
    public int getDurationOfMembership() {
        return durationOfMembership;
    }


}
