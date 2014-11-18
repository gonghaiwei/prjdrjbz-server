package com.gonghaiwei.prjdrjbz.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class BaseDao {

  @PersistenceContext(unitName = "prjdrjbz-service.persistent-unit")
  protected EntityManager em;

  public EntityManager getEm() {
    return em;
  }

}
