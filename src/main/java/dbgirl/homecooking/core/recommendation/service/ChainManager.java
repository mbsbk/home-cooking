package dbgirl.homecooking.core.recommendation.service;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mengbo on 2017/6/19.
 */
public class ChainManager {
    List<Handler> getChain(Context context){

        List<Handler> handlers = new ArrayList<>();


        Handler scoreRecommender = new ScoreRecommender();

        Handler frequencyHandler = new FrequencyHandler();

        Handler periodHandler = new PeriodHandler();


        handlers.add(scoreRecommender);
        handlers.add(frequencyHandler);
        handlers.add(frequencyHandler);



//        TODO
        return null;


    }
}
