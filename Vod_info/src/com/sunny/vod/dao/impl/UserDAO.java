package com.sunny.vod.dao.impl;
// default package

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.sunny.vod.hibernate.sessionfactory.BaseHibernateDAO;

import com.sunny.vod.bean.User;

/**
 	* A data access object (DAO) providing persistence and search support for User entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see .User
  * @author MyEclipse Persistence Tools 
 */
public class UserDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(UserDAO.class);
		//property constants
	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";
	public static final String SEX = "sex";
	public static final String CITYS = "citys";
	public static final String SCHOOLTYPE = "schooltype";
	public static final String SCHOOL = "school";
	public static final String EMAIL = "email";
	public static final String IDENTIFICATION = "identification";
	public static final String NAME = "name";
	public static final String CREATETIME = "createtime";
	public static final String PRIVILEGE_ID = "privilegeId";
	public static final String STATUS = "status";
	public static final String USER_MD5 = "userMd5";
	public static final String GROUP_NAME = "groupName";
	public static final String HEAD_SCULPTURE = "headSculpture";
	public static final String SCHOOL_ID = "schoolId";
	public static final String CITY_ID = "cityId";
	public static final String IDENTITY = "identity";
	public static final String LAST_LOGIN_TIME = "lastLoginTime";
	public static final String THIS_LOGIN_TIME = "thisLoginTime";
	public static final String CREATE_IP = "createIp";



    
    public void save(User transientInstance) {
        log.debug("saving User instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(User persistentInstance) {
        log.debug("deleting User instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public User findById( java.lang.Integer id) {
        log.debug("getting User instance with id: " + id);
        try {
            User instance = (User) getSession()
                    .get("User", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<User> findByExample(User instance) {
        log.debug("finding User instance by example");
        try {
            List<User> results = (List<User>) getSession()
                    .createCriteria("User")
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
      log.debug("finding User instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from User as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List<User> findByUsername(Object username
	) {
		return findByProperty(USERNAME, username
		);
	}
	
	public List<User> findByPassword(Object password
	) {
		return findByProperty(PASSWORD, password
		);
	}
	
	public List<User> findBySex(Object sex
	) {
		return findByProperty(SEX, sex
		);
	}
	
	public List<User> findByCitys(Object citys
	) {
		return findByProperty(CITYS, citys
		);
	}
	
	public List<User> findBySchooltype(Object schooltype
	) {
		return findByProperty(SCHOOLTYPE, schooltype
		);
	}
	
	public List<User> findBySchool(Object school
	) {
		return findByProperty(SCHOOL, school
		);
	}
	
	public List<User> findByEmail(Object email
	) {
		return findByProperty(EMAIL, email
		);
	}
	
	public List<User> findByIdentification(Object identification
	) {
		return findByProperty(IDENTIFICATION, identification
		);
	}
	
	public List<User> findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}
	
	public List<User> findByCreatetime(Object createtime
	) {
		return findByProperty(CREATETIME, createtime
		);
	}
	
	public List<User> findByPrivilegeId(Object privilegeId
	) {
		return findByProperty(PRIVILEGE_ID, privilegeId
		);
	}
	
	public List<User> findByStatus(Object status
	) {
		return findByProperty(STATUS, status
		);
	}
	
	public List<User> findByUserMd5(Object userMd5
	) {
		return findByProperty(USER_MD5, userMd5
		);
	}
	
	public List<User> findByGroupName(Object groupName
	) {
		return findByProperty(GROUP_NAME, groupName
		);
	}
	
	public List<User> findByHeadSculpture(Object headSculpture
	) {
		return findByProperty(HEAD_SCULPTURE, headSculpture
		);
	}
	
	public List<User> findBySchoolId(Object schoolId
	) {
		return findByProperty(SCHOOL_ID, schoolId
		);
	}
	
	public List<User> findByCityId(Object cityId
	) {
		return findByProperty(CITY_ID, cityId
		);
	}
	
	public List<User> findByIdentity(Object identity
	) {
		return findByProperty(IDENTITY, identity
		);
	}
	
	public List<User> findByLastLoginTime(Object lastLoginTime
	) {
		return findByProperty(LAST_LOGIN_TIME, lastLoginTime
		);
	}
	
	public List<User> findByThisLoginTime(Object thisLoginTime
	) {
		return findByProperty(THIS_LOGIN_TIME, thisLoginTime
		);
	}
	
	public List<User> findByCreateIp(Object createIp
	) {
		return findByProperty(CREATE_IP, createIp
		);
	}
	

	public List findAll() {
		log.debug("finding all User instances");
		try {
			String queryString = "from User";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public User merge(User detachedInstance) {
        log.debug("merging User instance");
        try {
            User result = (User) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(User instance) {
        log.debug("attaching dirty User instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(User instance) {
        log.debug("attaching clean User instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}