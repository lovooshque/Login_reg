package ru.belka.forum_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.belka.forum_system.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    User findByUsername(String username);

}
