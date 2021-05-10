package com.itmuch.usercenter.service.content;

import com.itmuch.usercenter.dao.content.UserMapper;
import com.itmuch.usercenter.domain.entity.content.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService
 *
 * @author liangbingtian
 * @date 2021/05/10 下午6:39
 */
@Service
@RequiredArgsConstructor(onConstructor =  @__(@Autowired) )
public class UserService {
  private final UserMapper userMapper;

  public User findById(Integer id) {
    return this.userMapper.selectByPrimaryKey(id);
  }
}
