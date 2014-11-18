package com.gonghaiwei.prjdrjbz.api;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 报修单
 * 
 * @author haiwei_gong@163.com
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "warranty_bill")
public class WarrantyBill {

  private String id;

  /**
   * 单据id
   * 
   * @return
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

}
