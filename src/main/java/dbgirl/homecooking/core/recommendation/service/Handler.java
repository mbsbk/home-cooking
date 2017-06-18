package dbgirl.homecooking.core.recommendation.service;


/**
 * Created by mengbo on 2017/6/19.
 */
public abstract class Handler {


    protected Handler successor;

    abstract void obtainBooks(Context context);
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
