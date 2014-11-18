package com.gonghaiwei.prjdrjbz.provider;

import com.gonghaiwei.prjdrjbz.api.WarrantyBill;
import com.gonghaiwei.prjdrjbz.dao.warrantybill.PWarrantyBill;

public class WarrantyBillConvertor {

  private static WarrantyBillConvertor instance = null;

  private WarrantyBillConvertor() {
  }

  public static WarrantyBillConvertor getInstance() {
    if (instance == null)
      instance = new WarrantyBillConvertor();
    return instance;
  }

  public WarrantyBill convert(PWarrantyBill source) {
    if (source == null)
      return null;

    WarrantyBill target = new WarrantyBill();
    target.setId(source.getId());
    // TODO

    return target;
  }

}
