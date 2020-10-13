package com.tontonlaforce.restfulwebservices.repositories;

import com.tontonlaforce.restfulwebservices.entities.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//public interface UserRepository extends CrudRepository<UserBean, Long> {
//}

//pour preciser à Spring que cette interface est un referentiel JPA
@Repository
public interface UserRepository extends JpaRepository<UserBean , Long>{

}
