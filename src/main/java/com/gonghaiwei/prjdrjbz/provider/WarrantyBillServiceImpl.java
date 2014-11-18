package com.gonghaiwei.prjdrjbz.provider;

import org.springframework.stereotype.Service;

import com.gonghaiwei.prjdrjbz.api.WarrantyBill;
import com.gonghaiwei.prjdrjbz.api.WarrantyBillService;
import com.gonghaiwei.prjdrjbz.dao.warrantybill.PWarrantyBill;
import com.gonghaiwei.prjdrjbz.dao.warrantybill.WarrantyBillDao;

@Service
public class WarrantyBillServiceImpl extends BaseService implements WarrantyBillService {

  @Override
  public WarrantyBill getById(String id) {
    PWarrantyBill bill = getBean(WarrantyBillDao.class).getById(id);
    return WarrantyBillConvertor.getInstance().convert(bill);
  }

  @Override
  @CommonTX
  public String saveNew(WarrantyBill bill) {
    return getBean(WarrantyBillDao.class).saveNew(bill);
  }

  @Override
  @CommonTX
  public void saveModify(WarrantyBill bill) {
    getBean(WarrantyBillDao.class).saveModify(bill);
  }

}
