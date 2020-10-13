package com.tontonlaforce.restfulwebservices.services;

import com.tontonlaforce.restfulwebservices.entities.UserBean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
//Pour gerer les transactions dans chaque méthode du service.
@Transactional
//Pour dire a Spring que Cette classe est un service qui peut etre injecter dans n'importe autre bean
@Service
public class UserServiceImpl implements UserService{

    @PersistenceContext
    public EntityManager entityManager;


}
