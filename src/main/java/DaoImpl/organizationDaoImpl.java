package DaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Bean.organization;
import Dao.organizationDao;
import Utils.HqlUtil;

@Repository
public class organizationDaoImpl implements organizationDao{
	
	@Autowired
	private SessionFactory session;
	
	@Autowired
	private HqlUtil hqlUtil;
	
	{
		Class className = organization.class;
	}

	@Override
	public boolean saveOrganozation(organization organization) {
		return hqlUtil.saveData(session, organization);
	}

	@Override
	public List<organization> getAllOrganizations() {
		return null;
	}

	@Override
	public boolean deleteOragnization(organization organization) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<organization> getOrganizationById(organization organization) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateOragnization(organization organization) {
		// TODO Auto-generated method stub
		return false;
	}

}
