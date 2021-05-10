package com.itmuch.usercenter.controller.content;

import com.itmuch.usercenter.domain.entity.content.User;
import com.itmuch.usercenter.service.content.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author liangbingtian
 * @date 2021/05/10 下午6:43
 */
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
  private final UserService userService;
  @GetMapping("/{id}")
  public User findById(@PathVariable Integer id) {
    return userService.findById(id);
  }
}
