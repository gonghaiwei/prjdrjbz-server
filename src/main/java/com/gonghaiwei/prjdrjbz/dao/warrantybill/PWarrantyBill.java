package com.gonghaiwei.prjdrjbz.dao.warrantybill;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "WARRANTYBILL")
public class PWarrantyBill {

  /** 属性{@link #getUuid()}长度限制，单位byte。 */
  public static final int LENGTH_UUID = 38;

  private String id;

  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  @Column(name = "id", length = LENGTH_UUID, nullable = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

}
