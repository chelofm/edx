import java.util.Date;

/**
 * @author chelo
 */
public abstract class Document {
    private String title;
    private String author;
    private Date date;
    private PublishingLocation publishingLocation;

    public Document(String title, String author, Date date, PublishingLocation publishingLocation) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.publishingLocation = publishingLocation;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }

    public String getCity() {
        return publishingLocation.getCity();
    }

    public String getState() {
        return publishingLocation.getState();
    }

    public String getPostCode() {
        return publishingLocation.getPostCode();
    }

    public PublishingLocation getPublishingLocation() {
        return publishingLocation;
    }

    public int compareWithGeneralDate(Date date){
        return getDate().compareTo(date);
    }

    public boolean sameAuthor(NewspaperArticle article){
        return author.equals(article.getAuthor());
    }

    public int compareDates(NewspaperArticle article){
        return date.compareTo(article.getDate());
    }

}
