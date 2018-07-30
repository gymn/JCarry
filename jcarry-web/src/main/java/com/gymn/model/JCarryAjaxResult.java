package com.gymn.model;

/**
 * @Author hunan
 * @Date 2018/6/29
 * @Time 下午8:45
 */
public class JCarryAjaxResult {
    private static final int SUCCESS_CODE = 200;
    private static final int FAILED_CODE = 500;

    private int code;
    private Object data;

    private JCarryAjaxResult(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public static JCarryAjaxResult succeed(Object data) {
        return new JCarryAjaxResult(SUCCESS_CODE, data);
    }

    public static JCarryAjaxResult failed(Object data) {
        return new JCarryAjaxResult(FAILED_CODE, data);
    }

    public int getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }
}
