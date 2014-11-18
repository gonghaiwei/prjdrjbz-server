package com.gonghaiwei.prjdrjbz.api.facade;

import org.springframework.stereotype.Component;

@Component
public class ErrorCodeUtil {

  public ErrorCode box(Exception e) {
    ErrorCode code = new ErrorCode();
    code.setErrCode(ErrorCode.businessException.getErrCode());
    code.setErrMessage(e.getMessage());
    return code;
  }

}
