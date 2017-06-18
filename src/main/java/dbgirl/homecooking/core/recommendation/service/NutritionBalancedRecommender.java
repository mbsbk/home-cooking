package dbgirl.homecooking.core.recommendation.service;



import java.util.List;

/**
 * Created by mengbo on 2017/6/19.
 */
public class NutritionBalancedRecommender extends AbstractRecommender {
    @Override
    void obtainBooks(Context context) {
        context.setBookIds(getBookSorted(context.getCondition()));
        if (successor != null)
            successor.obtainBooks(context);
    }

    @Override
    List<String> getBookSorted(Condition condition) {
//        TODO
        return null;
    }
}
