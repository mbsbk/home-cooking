package dbgirl.homecooking.core.recommendation.service;

import dbgirl.homecooking.core.recommendation.IRecommenderService;
import dbgirl.homecooking.dao.BookMapper;
import dbgirl.homecooking.exception.RecommendException;
import dbgirl.homecooking.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mengbo on 2017/6/19.
 */
@Service
@Scope("prototype")
public class RecommendService implements IRecommenderService{
    @Autowired
    private BookMapper bookMapper;
    @Override
    public Book getBook(String userId) throws RecommendException {


        ChainManager chainManager = new ChainManager();
        Context context = new Context();
        List<Handler> handlers = chainManager.getChain(context);

        for (int i=0;i<handlers.size()-1;i++) {
            handlers.get(i).setSuccessor(handlers.get(i+1));
        }

        handlers.get(0).obtainBooks(context);

        String id = context.getBookIds().get(0);

        return bookMapper.selectByPrimaryKey(id);
    }
}
