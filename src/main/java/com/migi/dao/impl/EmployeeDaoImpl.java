package com.migi.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.migi.dao.EmployeeDao;
import com.migi.entity.Employee;
 

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao{
	 
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addEmp(Employee emp) {
		sessionFactory.getCurrentSession().save(emp);
	}

	@Override
	public void updateEmp(Employee emp) {
		sessionFactory.getCurrentSession().merge(emp);
		
	}

	@Override
	public void deleteEmp(String id) {
		 sessionFactory.getCurrentSession().delete(getEmpById(id));
		
	}
	@Override
	public Employee getEmpById(String id) {
		 return (Employee)sessionFactory.getCurrentSession().get(Employee.class,id);
	}

	@Override
	public List<Employee> getAllEmps() {
		//Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Employee.class);
	 	CriteriaQuery<Employee> cq = sessionFactory.openSession().getCriteriaBuilder().createQuery(Employee.class);	 
		cq.from(Employee.class);
		List<Employee> empList = sessionFactory.openSession().createQuery(cq).getResultList(); 
		 
		 
		return empList;
	
	}
	
}
