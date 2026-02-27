package my.project.RestJava.domain.service;

import my.project.RestJava.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);


}
