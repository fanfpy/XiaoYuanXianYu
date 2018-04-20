package top.fanfpy.xiaoyuanxianyu.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import top.fanfpy.xiaoyuanxianyu.domain.User;

import java.util.List;

/**
 * @author fanfp
 * @date 2018/4/19
 * */
public interface UserRepository extends JpaRepository<User, Integer> {

    /**
     * 通过name查询
     * @param username 用户名
     * @return 用户列表
     * */
    List<User> findByUsername(String username);

}
