package com.gonghaiwei.prjdrjbz.api.facade;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 错误码
 * 
 * @author haiwei_gong@163.com
 * 
 */
@XmlRootElement(name = "error_code")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorCode {

  private int errCode;
  private String errMessage;

  public ErrorCode() {
  }

  public ErrorCode(int errCode, String errMessage) {
    this.errCode = errCode;
    this.errMessage = errMessage;
  }

  /** 错误码 */
  public int getErrCode() {
    return errCode;
  }

  public void setErrCode(int errCode) {
    this.errCode = errCode;
  }

  /** 错误信息 */
  public String getErrMessage() {
    return errMessage;
  }

  public void setErrMessage(String errMessage) {
    this.errMessage = errMessage;
  }

  @JsonIgnore
  public boolean isOk() {
    return ok.getErrCode() == getErrCode();
  }

  @Override
  protected ErrorCode clone() {
    ErrorCode code = new ErrorCode();
    code.setErrCode(errCode);
    code.setErrMessage(errMessage);
    return code;
  }

  public static final ErrorCode ok = new ErrorCode(0, "ok");
  public static final ErrorCode businessException = new ErrorCode(-1, "业务异常");

}
