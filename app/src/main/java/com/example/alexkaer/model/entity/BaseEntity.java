package com.example.alexkaer.model.entity;

/**
 * Auto-generated: 2017-03-10 17:45:1
 */
public class BaseEntity<T> {

    private int code;
    private T data;
    private long timestamp;
    private String message;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "code=" + code +
                ", data=" + data +
                ", timestamp=" + timestamp +
                ", message='" + message + '\'' +
                '}';
    }
}