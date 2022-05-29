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
import meroHospital.Model.DoctorModel;
import meroHospital.Model.InfoModel;

@Repository
@Transactional
public class DoctorDoaImpl implements DoctorDoa {

	@Autowired
	SessionFactory sf;
	public void save(DoctorModel doctorModel) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(doctorModel);
		tx.commit();   
		sess.close();
		
	}

	public List<DoctorModel> display() {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<DoctorModel> sl;
		@SuppressWarnings("unchecked")
		Query<DoctorModel> q = s.createQuery("from DoctorModel s");
		sl = q.getResultList();
		tx.commit();
		s.close();
		return sl;
	}

	public void delete(int id) {
		DoctorModel doctorModel = new DoctorModel();
		doctorModel.setDid(id);
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(doctorModel);;
		tx.commit();   
		sess.close();
	}

	public void edit(DoctorModel doctorModel) {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<DoctorModel> q = s.createQuery("from DoctorModel s where did = :did");
		q.setParameter("did", doctorModel.getDid());	
		s.update(doctorModel);
		tx.commit();
		s.close();
		
	}

	public DoctorModel displayByid(int id) {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<DoctorModel> q = s.createQuery("from DoctorModel s where did = :id");
		q.setParameter("id", id);
		DoctorModel doctorModel = q.uniqueResult();
		tx.commit();
		s.close();
		return doctorModel ;
	}

}
