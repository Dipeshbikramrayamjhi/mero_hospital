package meroHospital.Repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import meroHospital.Model.DoctorModel;
import meroHospital.Model.EquireModel;
@Repository
@Transactional
public class EquireDaoImpl implements EquireDoa {
	@Autowired
	SessionFactory sf;
	public void save(EquireModel equireModel) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(equireModel);
		tx.commit();   
		sess.close();
	}

	public List<EquireModel> display() {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<EquireModel> sl;
		@SuppressWarnings("unchecked")
		Query<EquireModel> q = s.createQuery("from EquireModel s");
		sl = q.getResultList();
		tx.commit();
		s.close();
		return sl;
	}

	public void delete(int id) {
		EquireModel equireModel = new EquireModel();
		equireModel.setEid(id);
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(equireModel);;
		tx.commit();   
		sess.close();
	}

	public void edit(EquireModel equireModel) {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<DoctorModel> q = s.createQuery("from EquireModel s where eid = :eid");
		q.setParameter("eid", equireModel.getEid());	
		s.update(equireModel);
		tx.commit();
		s.close();
		
	}

	public EquireModel displayByid(int id) {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<EquireModel> q = s.createQuery("from EquireModel s where eid = :id");
		q.setParameter("id", id);
		EquireModel equireModel = q.uniqueResult();
		tx.commit();
		s.close();
		return equireModel ;
	}

}
