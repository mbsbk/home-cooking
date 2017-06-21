package dbgirl.homecooking.core.recommendation;

import dbgirl.homecooking.common.exception.RecommendException;
import dbgirl.homecooking.pojo.Book;

/**
 * Created by mengbo on 2017/6/19.
 */
public interface IRecommenderService {
    Book getBook(String userId) throws RecommendException;
}
