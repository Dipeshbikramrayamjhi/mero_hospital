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
import meroHospital.Model.OthersModel;

@Repository
@Transactional
public class OthersDoaImpl implements OthersDoa {

	@Autowired
	SessionFactory sf;
	
	public void save(OthersModel othersmodel) {
		// TODO Auto-generated method stub
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(othersmodel);
		tx.commit();   
		sess.close();
		
		
	}

	public List<OthersModel> display() {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<OthersModel> sl;
		@SuppressWarnings("unchecked")
		Query<OthersModel> q = s.createQuery("from OthersModel s");
		sl = q.getResultList();
		tx.commit();
		s.close();
		return sl;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public void edit(OthersModel othersmodel) {
		// TODO Auto-generated method stub
		
	}

	public OthersModel displayByid() {
		// TODO Auto-generated method stub
		return null;
	}

}
