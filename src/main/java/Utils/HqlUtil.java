package Utils;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

@SuppressWarnings("unchecked")
public class HqlUtil {

	public boolean saveData(SessionFactory session,Object obj) {
		boolean status = false;
		try {
			session.getCurrentSession().save(obj);
			status = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;
	}
	
	public List<Object> getAllData(SessionFactory session,Object obj){
		Query query = session.getCurrentSession().createSQLQuery("");
		return query.list();
	}
	
	public boolean deleteData(SessionFactory session, Object obj) {
		boolean status = false;
		try {
			session.getCurrentSession().delete(obj);
			status = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;
	}
	
	public List<Object> getDataById(SessionFactory session , Object object,String nameOfParameter,int paramaterValue){
		Query query = session.getCurrentSession().createQuery("from "+object.getClass().getName()+" where "+nameOfParameter+"=:id");
		query.setParameter("id", paramaterValue);
		return query.list();
	}
	
	public boolean updateData(SessionFactory session ,Object obj) {
		boolean status = false;
		try {
			session.getCurrentSession().update(obj);
			status = true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;
		
	}
	
}