package meroHospital.Repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import meroHospital.Model.InfoModel;

@Repository
@Transactional
public class InfoDoaImpl implements InfoDoa{

	
	@Autowired
	SessionFactory sf;
	public void save(InfoModel info) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(info);
		tx.commit();   
		sess.close();
		
	}

	public List<InfoModel> display() {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<InfoModel> sl;
		@SuppressWarnings("unchecked")
		Query<InfoModel> q = s.createQuery("from InfoModel s");
		sl = q.getResultList();
		tx.commit();
		s.close();
		return sl;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public void edit(InfoModel info) {
		// TODO Auto-generated method stub
		
	}

	public InfoModel displayByid() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
