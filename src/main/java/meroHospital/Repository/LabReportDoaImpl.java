package meroHospital.Repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import meroHospital.Model.LabReportModel;

@Transactional
@Repository
public class LabReportDoaImpl implements LabReportDoa  {

	@Autowired
	SessionFactory sf ;
	public void save(LabReportModel lapReportModel) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(lapReportModel);
		tx.commit();
		sess.close();
		
	}

	public List<LabReportModel> display() {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<LabReportModel> sl ;
		@SuppressWarnings("unchecked")
		Query<LabReportModel> q = s.createQuery("from LabReportModel s");
		sl = q.getResultList();
		tx.commit();
		s.close();
		return sl;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		LabReportModel labReport = new LabReportModel();
		labReport.setLid(id);
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(labReport);
		tx.commit();
		sess.close();
		
	}

	public void edit(LabReportModel lapReportModel) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<LabReportModel> q = s.createQuery("from LabReportModel s where lid = lid");
		q.setParameter("lid",lapReportModel.getLid());
		s.update(lapReportModel);
		tx.commit();
		s.close();
		
	}

	public LabReportModel displayByid(int id) {
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<LabReportModel> q = s.createQuery("from InfoModel s where iid = :id");
		q.setParameter("id", id);
		LabReportModel labReportModel = q.getSingleResult();
		tx.commit();
		s.close();
		return labReportModel ;
		
	}

}
