package dbgirl.homecooking.api;

import dbgirl.homecooking.common.ResponseCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mengbo on 2017/6/21.
 */
@Api(value = "/book", description = "Operations about book")
@RestController
@RequestMapping("/book")
public class BookController {


    @ApiOperation(
            value = "add book", notes = "add book"
    )
    @RequestMapping(value = "/{name}/add", method = {RequestMethod.GET,RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseCode addBook(@PathVariable("name") String name) {

        //TODO


        return ResponseCode.success();
    }

}
