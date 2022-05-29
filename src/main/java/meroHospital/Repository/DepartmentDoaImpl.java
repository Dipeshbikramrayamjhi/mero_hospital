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
		Query<DepartmentModel> q = s.createQuery("from DepartmentModel s");
		sl = q.getResultList();
		tx.commit();
		s.close();
		return sl;
	}
	public void delete(int id) {
		DepartmentModel dptModel = new DepartmentModel();
		dptModel.setDid(id);
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(dptModel);;
		tx.commit();   
		sess.close();
		
	}
	public void edit(DepartmentModel departmentModel) {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<DepartmentModel> q = s.createQuery("from DepartmentModel s where did = :id");
		q.setParameter("id", departmentModel.getDid());
		s.update(departmentModel);
		tx.commit();
		s.close();
		
	}
	public DepartmentModel displayByid(int id) {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<DepartmentModel> q = s.createQuery("from DepartmentModel s where did = :id");
		q.setParameter("id", id);
		DepartmentModel departmentmodel = q.uniqueResult();
		tx.commit();
		s.close();
		return departmentmodel ;
	}
}
