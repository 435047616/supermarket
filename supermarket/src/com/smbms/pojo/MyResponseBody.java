package com.smbms.pojo;

/**
 * 响应信息
 */
public class MyResponseBody {

    //状态码    001  参数缺失    002  参数非法   003 服务器异常    004操作成功
    private  String  status;
    //操作信息提示
    private String message;
    //是否操作成功
    private boolean operation;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isOperation() {
        return operation;
    }

    public void setOperation(boolean operation) {
        this.operation = operation;
    }


    public MyResponseBody() {

    }

    public MyResponseBody(String status, String message, boolean operation) {
        this.status = status;
        this.message = message;
        this.operation = operation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
