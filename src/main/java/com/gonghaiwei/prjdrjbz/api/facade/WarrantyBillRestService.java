package com.gonghaiwei.prjdrjbz.api.facade;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.gonghaiwei.prjdrjbz.api.WarrantyBill;

@Path("warranty_bill")
@Consumes({
  MediaType.APPLICATION_JSON })
@Produces({
  MediaType.APPLICATION_JSON })
public interface WarrantyBillRestService {

  /**
   * 根据单据id查询单据信息
   * 
   * @param id
   *          单据id
   * @return 单据信息
   */
  @GET
  @Path("{id}")
  Response<WarrantyBill> getById(@PathParam("id")
  String id);

  /**
   * 新增单据
   * 
   * @param bill
   *          单据信息，要求单据id为空
   * @return 单据id
   */
  @POST
  @Path("saveNew")
  Response<String> saveNew(WarrantyBill bill);

  /**
   * 编辑单据
   * 
   * @param bill
   *          单据信息，要求单据id不能为空
   * @return
   */
  @POST
  @Path("saveModify")
  Response<Void> saveModify(WarrantyBill bill);

}
