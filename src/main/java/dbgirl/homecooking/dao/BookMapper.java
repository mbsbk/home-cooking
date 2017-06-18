package dbgirl.homecooking.dao;

import dbgirl.homecooking.pojo.Book;
import dbgirl.homecooking.pojo.BookExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BOOK
     *
     * @mbggenerated Sun Jun 18 16:50:35 CST 2017
     */
    int countByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BOOK
     *
     * @mbggenerated Sun Jun 18 16:50:35 CST 2017
     */
    int deleteByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BOOK
     *
     * @mbggenerated Sun Jun 18 16:50:35 CST 2017
     */
    int deleteByPrimaryKey(String bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BOOK
     *
     * @mbggenerated Sun Jun 18 16:50:35 CST 2017
     */
    int insert(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BOOK
     *
     * @mbggenerated Sun Jun 18 16:50:35 CST 2017
     */
    int insertSelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BOOK
     *
     * @mbggenerated Sun Jun 18 16:50:35 CST 2017
     */
    List<Book> selectByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BOOK
     *
     * @mbggenerated Sun Jun 18 16:50:35 CST 2017
     */
    Book selectByPrimaryKey(String bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BOOK
     *
     * @mbggenerated Sun Jun 18 16:50:35 CST 2017
     */
    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BOOK
     *
     * @mbggenerated Sun Jun 18 16:50:35 CST 2017
     */
    int updateByExample(@Param("record") Book record, @Param("example") BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BOOK
     *
     * @mbggenerated Sun Jun 18 16:50:35 CST 2017
     */
    int updateByPrimaryKeySelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BOOK
     *
     * @mbggenerated Sun Jun 18 16:50:35 CST 2017
     */
    int updateByPrimaryKey(Book record);
}