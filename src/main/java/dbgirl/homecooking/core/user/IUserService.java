package dbgirl.homecooking.core.user;

import dbgirl.homecooking.common.exception.UserException;
import dbgirl.homecooking.pojo.User;

public interface IUserService {
    User login(String username,String pwd) throws UserException;
}
