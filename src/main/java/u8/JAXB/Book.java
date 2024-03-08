package u8.JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


@XmlRootElement
@XmlType(propOrder = {
        "author","publisherHouse","year","price"
})
public class Book {

    private int year;
    private String author;
    private  String publisherHouse;
    private int price;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @XmlElement(name ="House")
    public String getPublisherHouse() {
        return publisherHouse;
    }

    public void setPublisherHouse(String publisherHouse) {
        this.publisherHouse = publisherHouse;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", publisherHouse='" + publisherHouse + '\'' +
                '}';
    }
}
