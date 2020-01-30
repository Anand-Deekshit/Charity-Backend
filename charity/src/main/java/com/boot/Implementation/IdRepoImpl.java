package com.boot.Implementation;
import org.hibernate.Query;
import org.hibernate.Session;

import com.boot.model.MaxIdTable;
import com.boot.repository.IdRepositoryCustom;
import com.boot.utils.HibernateUtil;

public class IdRepoImpl implements IdRepositoryCustom {
	private Session session = HibernateUtil.getSessionFactory().openSession();

	public int getMaxId(String paramId) {
		Query query = session.createQuery("select m.val from " + MaxIdTable.class.getName()  +" m where m.id = '" + paramId +"'");
		MaxIdTable idObj = (MaxIdTable) query.list().get(0);
		return idObj.getVal();
	}

	public int updateMaxIds(String paramId, int newId) {
		Query query = session.createQuery("update " + MaxIdTable.class.getName() + " set val = " + newId + " where id = '" + paramId +"'");
		int result = query.executeUpdate();
		return result;
	}

}