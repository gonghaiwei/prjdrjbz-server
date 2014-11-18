package com.gonghaiwei.prjdrjbz.dao.warrantybill;

import com.gonghaiwei.prjdrjbz.api.WarrantyBill;

public class PWarrantyBillInjecter {

  private static PWarrantyBillInjecter instance = null;

  private PWarrantyBillInjecter() {
  }

  public static PWarrantyBillInjecter getInstance() {
    if (instance == null)
      instance = new PWarrantyBillInjecter();
    return instance;
  }

  public void injecter(PWarrantyBill target, WarrantyBill source) {
    if (target == null || source == null)
      return;
    // TODO
  }

}
