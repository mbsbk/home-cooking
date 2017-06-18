package dbgirl.homecooking.core.recommendation.service;

import java.util.List;

/**
 * Created by mengbo on 2017/6/19.
 */
public class Context {
    private List<String> bookIds;
    private Condition condition;

    public List<String> getBookIds() {
        return bookIds;
    }

    public void setBookIds(List<String> bookIds) {
        this.bookIds = bookIds;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
}
