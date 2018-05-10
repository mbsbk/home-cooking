package dbgirl.homecooking.core.collection.manual;

import dbgirl.homecooking.common.exception.CollectionException;
import dbgirl.homecooking.common.exception.ExceptionCode;
import dbgirl.homecooking.common.utils.UUIDGenerator;
import dbgirl.homecooking.dao.BookMapper;
import dbgirl.homecooking.dao.UserBookMapper;
import dbgirl.homecooking.pojo.Book;
import dbgirl.homecooking.pojo.UserBook;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {

    private final static Logger logger = LoggerFactory.getLogger(BookService.class);
    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private UserBookMapper userBookMapper;

    @Override
    public String addBook(Book book, String userId) throws CollectionException {

        if (book == null || StringUtils.isEmpty(book.getBookName())) {
            logger.error("add failed book is null or book's name is empty");
            throw new CollectionException(ExceptionCode.ILLEGAL_PARAMETER);
        }

        String bookId = UUIDGenerator.generate();
        book.setBookId(bookId);

        //关联
        UserBook userBook = new UserBook();
        userBook.setBookId(bookId);
        userBook.setUserId(userId);
        userBook.setUserBookId(UUIDGenerator.generate());

        bookMapper.insert(book);
        userBookMapper.insert(userBook);

        logger.info("finish add book[" + book + "] for user[" + userId + "]");

        return bookId;
    }


}
