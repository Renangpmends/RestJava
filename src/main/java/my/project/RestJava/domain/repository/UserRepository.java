package my.project.RestJava.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  my.project.RestJava.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
