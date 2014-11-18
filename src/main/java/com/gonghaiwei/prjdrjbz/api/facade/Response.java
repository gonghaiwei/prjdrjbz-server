package com.gonghaiwei.prjdrjbz.api.facade;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 响应
 * 
 * @author haiwei_gong@163.com
 * 
 * @param <T>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "response")
public class Response<T> {

  private ErrorCode error = ErrorCode.ok;
  private T data;

  /**
   * 响应数据
   * 
   * @return
   */
  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  /**
   * 错误码
   * 
   * @return
   */
  public ErrorCode getError() {
    return error;
  }

  public void setError(ErrorCode error) {
    this.error = error;
  }

}
