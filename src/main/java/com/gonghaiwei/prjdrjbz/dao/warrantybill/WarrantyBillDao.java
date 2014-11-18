package com.gonghaiwei.prjdrjbz.dao.warrantybill;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.gonghaiwei.prjdrjbz.api.WarrantyBill;
import com.gonghaiwei.prjdrjbz.dao.BaseDao;
import com.gonghaiwei.prjdrjbz.provider.CommonTX;

@Repository
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class WarrantyBillDao extends BaseDao {

  public PWarrantyBill getById(String id) {
    if (id == null)
      return null;

    Query query = em.createQuery(String.format("from %s where id=:id",
        PWarrantyBill.class.getName()));
    query.setParameter("id", id);
    List<PWarrantyBill> result = query.getResultList();
    if (result.size() == 0)
      return null;
    else
      return result.get(0);
  }

  @CommonTX
  public String saveNew(WarrantyBill bill) {
    if (bill == null)
      throw new IllegalArgumentException("参数bill不能为空");
    if (bill.getId() != null && bill.getId().isEmpty() == false)
      throw new IllegalArgumentException("参数bill.id应为空");

    PWarrantyBill p = new PWarrantyBill();
    PWarrantyBillInjecter.getInstance().injecter(p, bill);

    em.persist(p);
    em.flush();
    return p.getId();
  }

  @CommonTX
  public void saveModify(WarrantyBill bill) {
    if (bill == null)
      throw new IllegalArgumentException("参数bill不能为空");
    if (bill.getId() == null || bill.getId().isEmpty())
      throw new IllegalArgumentException("参数bill.id不能为空");

    PWarrantyBill p = getById(bill.getId());
    if (p == null)
      throw new RuntimeException(String.format("bill.id=%s的单据不存在", bill.getId()));

    PWarrantyBillInjecter.getInstance().injecter(p, bill);

    em.merge(p);
    em.flush();
  }

}
