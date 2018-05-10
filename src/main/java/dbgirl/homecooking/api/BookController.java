package dbgirl.homecooking.api;

import dbgirl.homecooking.common.Response;
import dbgirl.homecooking.common.utils.UUIDGenerator;
import dbgirl.homecooking.core.collection.manual.IBookService;
import dbgirl.homecooking.pojo.Book;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mengbo on 2017/6/21.
 */
@Api(value = "/book", description = "Operations about book")
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookService bookService;

    @ApiOperation(
            value = "add book", notes = "add book"
    )
    @RequestMapping(value = "/{name}/add", method = {RequestMethod.GET, RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Response addBook(@PathVariable("name") String name) {

        //TODO 获取用户ID
        String userId = UUIDGenerator.generate();


        Book book = new Book();
        book.setBookName(name);
        String bookId = bookService.addBook(book, userId);
        return Response.success(bookId);
    }

}
