package org.chy.anubis.treasury.web.entity;

public class JsonResult {

    private boolean success;
    private String msg;
    private Object data;

    public JsonResult(boolean success, String msg, Object data) {
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public static JsonResult success(Object data) {
        return new JsonResult(true, "成功", data);
    }

    public static JsonResult fail(String msg) {
        return new JsonResult(false, msg, null);
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }
}
