package dbgirl.homecooking.core.user;

import dbgirl.homecooking.common.exception.UserException;
import dbgirl.homecooking.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class WXUserService implements IUserService {
    @Override
    public User login(String username, String pwd) throws UserException {

        return null;
    }
}
