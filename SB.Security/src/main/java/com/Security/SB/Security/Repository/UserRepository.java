package com.Security.SB.Security.Repository;

import com.Security.SB.Security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String dfadfsdfsfsaf);
}
