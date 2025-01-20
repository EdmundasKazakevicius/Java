
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        if (day < 30) {
            day = day + 1;
        } else {
            if (month < 12) {
                day = 1;
                month = month + 1;
            } else {
                day = 1;
                month = 1;
                year = year + 1;
            }
        }
    }

    public void advance( int howManyDays) {
    if ( howManyDays <= 0) { return; }
    else {
        for ( int i = 1; i <= howManyDays; i++ ) { this.advance(); }
    }
    }

    public  SimpleDate afterNumberOfDays ( int days ) {
//        this.advance ( days );
//        SimpleDate newDate = new SimpleDate( this.day, this.month , this.year);

          SimpleDate newDate = new SimpleDate( this.day, this.month , this.year);
          newDate.advance ( days );

        return newDate;
    }

}
