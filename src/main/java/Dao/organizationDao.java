package Dao;

import java.util.List;

import Bean.organization;

public interface organizationDao {
	public boolean saveOrganozation(organization organization);
	public List<organization> getAllOrganizations();
	public boolean deleteOragnization(organization organization);
	public List<organization> getOrganizationById(organization organization);
	public boolean updateOragnization(organization organization);
}
