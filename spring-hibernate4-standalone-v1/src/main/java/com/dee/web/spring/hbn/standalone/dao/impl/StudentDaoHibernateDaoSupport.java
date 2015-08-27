package com.dee.web.spring.hbn.standalone.dao.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dee.web.spring.hbn.standalone.dao.StudentDao;
import com.dee.web.spring.hbn.standalone.model.StudentModel;

/**
 * @author dien.nguyen
 **/

@Repository("studentDaoHibernateDaoSupport")
public class StudentDaoHibernateDaoSupport extends HibernateDaoSupport implements StudentDao{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @PostConstruct
    public void init() {
        setSessionFactory(sessionFactory);
    }
    
    @Override
    public List<StudentModel> findAll() {
        return (List<StudentModel>) getHibernateTemplate().find("from student");
    }

    @Override
    public StudentModel findById(Long id) {
        return getHibernateTemplate().get(StudentModel.class, id);
    }

    @Override
    @Transactional(readOnly = false)
    public void save(StudentModel studentModel) {
        getHibernateTemplate().save(studentModel);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(StudentModel studentModel) {
        getHibernateTemplate().update(studentModel);
    }

    @Override
    @Transactional(readOnly = false)
    public boolean delete(Long id) {
        StudentModel student = findById(id);
        if (student != null) {
            getHibernateTemplate().delete(student);
            return true;
        }
        return false;
    }
    
    
    
}
