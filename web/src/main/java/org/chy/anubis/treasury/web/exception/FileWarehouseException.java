package org.chy.anubis.treasury.web.exception;

public class FileWarehouseException extends RuntimeException {

    String msg;

    public FileWarehouseException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
