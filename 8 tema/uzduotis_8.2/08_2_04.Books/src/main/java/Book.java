
public class Book {
    private String title;
    private int pages;
    private int yearOfPublication;

    public Book(String title, int pages, int yearOfPublication) {
        this.title = title;
        this.pages = pages;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYear(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

}



