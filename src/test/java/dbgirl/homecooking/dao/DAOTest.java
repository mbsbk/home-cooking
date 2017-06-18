package dbgirl.homecooking.dao;

import dbgirl.homecooking.BaseTest;
import dbgirl.homecooking.pojo.Book;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by mengbo on 2017/6/18.
 */
public class DAOTest extends BaseTest{


    @Autowired
    private BookMapper bookMapper;

    @Test
    public void TestInsert(){
        Book book = bookMapper.selectByPrimaryKey("-1");

        Assert.assertNull(book);

    }
}
