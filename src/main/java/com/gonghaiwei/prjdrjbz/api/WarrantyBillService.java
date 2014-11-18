package com.gonghaiwei.prjdrjbz.api;

public interface WarrantyBillService {

  WarrantyBill getById(String id);

  String saveNew(WarrantyBill bill);

  void saveModify(WarrantyBill bill);

}
