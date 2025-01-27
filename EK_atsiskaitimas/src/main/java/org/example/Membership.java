package org.example;

abstract class Membership {
    private int membershipId;
    private int memberId;
//    private int durationOfMembership;

    public Membership(int membershipId, int memberId) {
        this.membershipId = membershipId;
        this.memberId = memberId;
    }

    public abstract double getCost();

    public abstract int getDurationOfMembership();

    @Override
    public String toString() {
        String typeOfMembership = "";
        if (getDurationOfMembership() == 12) {
            typeOfMembership = "AnnualMembership";
        } else {
            typeOfMembership = "MonthlyMembership";
        }
        return typeOfMembership +
                ", Cost: " + getCost() + ", Duration: " +
                getDurationOfMembership() + " months";
    }


}


