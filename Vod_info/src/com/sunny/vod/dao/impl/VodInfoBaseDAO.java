package com.sunny.vod.dao.impl;
// default package

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.sunny.vod.hibernate.sessionfactory.BaseHibernateDAO;

import com.sunny.vod.bean.VodInfo;

/**
 	* A data access object (DAO) providing persistence and search support for VodInfo entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .VodInfo
  * @author MyEclipse Persistence Tools 
 */
public class VodInfoBaseDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(VodInfoBaseDAO.class);
		//property constants
	public static final String CLASSROOM = "classroom";
	public static final String MANAGER = "manager";
	public static final String TELEPHONE = "telephone";
	public static final String LBIP = "lbip";
	public static final String SKIP = "skip";
	public static final String HDIP = "hdip";
	public static final String ZBIP = "zbip";



    
    public void save(VodInfo transientInstance) {
        log.debug("saving VodInfo instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(VodInfo persistentInstance) {
        log.debug("deleting VodInfo instance");
        try {
            getSession().delete(persistentInstance);
            getSession().flush();
            System.out.println("delete successful");
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public VodInfo findById( java.lang.String id) {
    	
    	System.out.println("id----"+id);
        log.debug("getting VodInfo instance with id: " + id);
        try {
            VodInfo instance = (VodInfo) getSession()
                    .get("com.sunny.vod.bean.VodInfo", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<VodInfo> findByExample(VodInfo instance) {
        log.debug("finding VodInfo instance by example");
        try {
            List<VodInfo> results = (List<VodInfo>) getSession()
                    .createCriteria("VodInfo")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding VodInfo instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from VodInfo as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List<VodInfo> findByClassroom(Object classroom
	) {
		return findByProperty(CLASSROOM, classroom
		);
	}
	
	public List<VodInfo> findByManager(Object manager
	) {
		return findByProperty(MANAGER, manager
		);
	}
	
	public List<VodInfo> findByTelephone(Object telephone
	) {
		return findByProperty(TELEPHONE, telephone
		);
	}
	
	public List<VodInfo> findByLbip(Object lbip
	) {
		return findByProperty(LBIP, lbip
		);
	}
	
	public List<VodInfo> findBySkip(Object skip
	) {
		return findByProperty(SKIP, skip
		);
	}
	
	public List<VodInfo> findByHdip(Object hdip
	) {
		return findByProperty(HDIP, hdip
		);
	}
	
	public List<VodInfo> findByZbip(Object zbip
	) {
		return findByProperty(ZBIP, zbip
		);
	}
	

	public List findAll() {
		log.debug("finding all VodInfo instances");
		try {
			String queryString = "from VodInfo";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public VodInfo merge(VodInfo detachedInstance) {
        log.debug("merging VodInfo instance");
        try {
            VodInfo result = (VodInfo) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(VodInfo instance) {
        log.debug("attaching dirty VodInfo instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(VodInfo instance) {
        log.debug("attaching clean VodInfo instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}