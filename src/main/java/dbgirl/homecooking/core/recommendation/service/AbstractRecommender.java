package dbgirl.homecooking.core.recommendation.service;



import java.util.List;

/**
 * Created by mengbo on 2017/6/19.
 */
public abstract class AbstractRecommender extends Handler {
    abstract List<String> getBookSorted(Condition condition);
}
