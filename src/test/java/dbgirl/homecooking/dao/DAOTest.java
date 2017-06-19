package dbgirl.homecooking.dao;

import dbgirl.homecooking.BaseTest;
import dbgirl.homecooking.pojo.Book;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by mengbo on 2017/6/18.
 */
public class DAOTest extends BaseTest{

    private final static Logger logger = LoggerFactory.getLogger(DAOTest.class);

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void testConnected(){

        logger.info("testing connected");

        Book book = bookMapper.selectByPrimaryKey("-1");

        Assert.assertNull(book);

    }
}
