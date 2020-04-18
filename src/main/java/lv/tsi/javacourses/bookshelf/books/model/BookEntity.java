package lv.tsi.javacourses.bookshelf.books.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity(name= "Book")
@Table (name= "books")
public class BookEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
   @Column (name = "title", length = 500,nullable = false)
    private String title;
   @Column(name="isbn", length = 50,nullable = false)
    private String isbn;
   @Column(name="author",length = 500,nullable = false)
    private String author;
    @Column (name ="year", nullable = false)
    private int year;
    @Column (name = "publisher", nullable = false)
    private String publisher;
    @Column (name="description", length = 500)
    private String description;
    @Column (name="language", length = 50)
    private String language;
    @Column (name="genre", length = 100)
    private String genre;
    @Column (name="popularity_rating",length = 100, nullable = false)
    private int popularity;
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
