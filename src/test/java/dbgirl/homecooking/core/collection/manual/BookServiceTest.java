package dbgirl.homecooking.core.collection.manual;

import dbgirl.homecooking.BaseTest;
import dbgirl.homecooking.common.exception.CollectionException;
import dbgirl.homecooking.common.utils.UUIDGenerator;
import dbgirl.homecooking.pojo.Book;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

public class BookServiceTest extends BaseTest{
    private final static Logger logger = LoggerFactory.getLogger(BookService.class);

    @Autowired
    private IBookService bookService;

    @Test(expected = CollectionException.class)
    public void testAddBookForErrorParameter(){

        Book book = new Book();
        String userId = "test";

        bookService.addBook(book,userId);

    }


    @Test
    public void testAddBookSuccess(){
        Book book = new Book();
        book.setBookName("book name");
        book.setImageId(UUIDGenerator.generate());
        String userId = "test";

        String bookId = bookService.addBook(book, userId);

        Assert.notNull(bookId,"success");
    }

}
