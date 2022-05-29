package meroHospital.Repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



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
		OthersModel othersModel = new OthersModel();
		othersModel.setOid(id);
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(othersModel);;
		tx.commit();   
		sess.close();
		
	}

	public void edit(OthersModel othersmodel) {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<OthersModel> q = s.createQuery("from OthersModel s where oid = :oid");
		q.setParameter("oid", othersmodel.getOid());	
		s.update(othersmodel);
		tx.commit();
		s.close();
		
		
	}

	public OthersModel displayByid(int id) {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<OthersModel> q = s.createQuery("from OthersModel s where oid = :id");
		q.setParameter("id", id);
		OthersModel othersModel = q.getSingleResult();
		tx.commit();
		s.close();
		return othersModel ;
	}

}
