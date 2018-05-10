package dbgirl.homecooking.core.collection.manual;

import dbgirl.homecooking.common.exception.CollectionException;
import dbgirl.homecooking.pojo.Book;

public interface IBookService {

    String addBook(Book book,String userId) throws CollectionException;
}
