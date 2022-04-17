package meroHospital.Repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import meroHospital.Model.DepartmentModel;



@Repository
@Transactional
public class DepartmentDoaImpl implements DepartmentDoa {

	@Autowired
	SessionFactory sf;
	public void save(DepartmentModel departmentModel) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(departmentModel);
		tx.commit();   
		sess.close();
		
	}
	public List<DepartmentModel> display() {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<DepartmentModel> sl;
		@SuppressWarnings("unchecked")
		Query<DepartmentModel> q = s.createQuery("from DepartmentModel department");
		sl = q.getResultList();
		tx.commit();
		s.close();
		return sl;
	}
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	public void edit(DepartmentModel departmentModel) {
		// TODO Auto-generated method stub
		
	}
	public DepartmentModel displayByid() {
		// TODO Auto-generated method stub
		return null;
	}
}
