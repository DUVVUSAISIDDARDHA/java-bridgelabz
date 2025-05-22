package com.bridgelabz.oops.levelone;

class DVD extends LibraryItem implements com.bridgelabz.encapsulation.Reservable {
    private static int totalDVDs = 7;
    private int limit = 5;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return limit;
    }

    public void reserveItem(int days) {
        if (days > limit) {
            System.out.println("Loan duration limit is 5 days so can't be reserved.");
        } else {
            System.out.println("Reserved for " + days + " days.");
        }
        totalDVDs -= 1;
    }

    public boolean checkAvailability() {
        return totalDVDs > 0;
    }
}
