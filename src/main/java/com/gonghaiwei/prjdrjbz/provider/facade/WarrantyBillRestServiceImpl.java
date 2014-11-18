package com.gonghaiwei.prjdrjbz.provider.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;

import com.gonghaiwei.prjdrjbz.api.WarrantyBill;
import com.gonghaiwei.prjdrjbz.api.WarrantyBillService;
import com.gonghaiwei.prjdrjbz.api.facade.ErrorCodeUtil;
import com.gonghaiwei.prjdrjbz.api.facade.Response;
import com.gonghaiwei.prjdrjbz.api.facade.WarrantyBillRestService;

public class WarrantyBillRestServiceImpl implements WarrantyBillRestService {

  @Autowired
  private WarrantyBillService service;

  @Autowired
  private ErrorCodeUtil errorCodeUtil;

  @Override
  @Secured({
    "ROLE_USER" })
  public Response<WarrantyBill> getById(String id) {
    Response<WarrantyBill> res = new Response<WarrantyBill>();
    try {
      WarrantyBill bill = service.getById(id);
      res.setData(bill);
    } catch (Exception e) {
      res.setError(errorCodeUtil.box(e));
    }
    return res;
  }

  @Override
  @Secured({
    "ROLE_USER" })
  public Response<String> saveNew(WarrantyBill bill) {
    Response<String> res = new Response<String>();
    try {
      String id = service.saveNew(bill);
      res.setData(id);
    } catch (Exception e) {
      res.setError(errorCodeUtil.box(e));
    }
    return res;
  }

  @Override
  @Secured({
    "ROLE_USER" })
  public Response<Void> saveModify(WarrantyBill bill) {
    Response<Void> res = new Response<Void>();
    try {
      service.saveModify(bill);
    } catch (Exception e) {
      res.setError(errorCodeUtil.box(e));
    }
    return res;
  }
}
