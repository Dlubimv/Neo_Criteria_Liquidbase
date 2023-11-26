package ru.neoflex.Spring_Boot_CRUD_App.dao;

import ru.neoflex.Spring_Boot_CRUD_App.model.User;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        CriteriaQuery<User> criteriaQuery = entityManager
                .getCriteriaBuilder()
                .createQuery(User.class);
        criteriaQuery.select(criteriaQuery.from(User.class));
        return entityManager.createQuery(criteriaQuery).getResultList();
//        return entityManager.createQuery("from User").getResultList();
    }
}