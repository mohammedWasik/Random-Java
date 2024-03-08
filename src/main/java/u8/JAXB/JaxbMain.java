package u8.JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JaxbMain {
    public static void main(String[] args) throws JAXBException, IOException {
        Book book = new Book();
        book.setAuthor("wasik");
        book.setPrice(999);
        book.setYear(2000);
        book.setPublisherHouse("Ctg Book House");

        JAXBContext context = JAXBContext.newInstance(Book.class);

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(book,new FileWriter("src/main/resources/book.xml"));

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Book object = (Book) unmarshaller.unmarshal(new FileReader("src/main/resources/book.xml"));
        System.out.println(object.toString());




    }
}
