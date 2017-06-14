package com.example.demo.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zcl
 * @date 2017/6/14
 */
public class Response {

    private final static String MESSAGE = "msg";
    private final static String ERRCODE = "status";
    private final static String RESULT = "result";
    private final static String DATA = "data";

    public static ResponseEntity<Object> success() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put(RESULT, true);
        return getEntity(result, HttpStatus.OK);
    }

    private static ResponseEntity<Object> getEntity(Object body, HttpStatus statusCode) {
        MultiValueMap<String, String> headers = new HttpHeaders();
        List<String> contentType = new ArrayList<String>();
        contentType.add("application/json;charset=utf-8");
        headers.put("Content-Type", contentType);
        return new ResponseEntity<Object>(body, headers, statusCode);
    }

    /**
     * 请求成功
     * @param object
     * @return
     */
    public static ResponseEntity<Object> success(Object object) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put(MESSAGE, "");
        result.put(RESULT, true);
        result.put(DATA, object);
        return getEntity(result, HttpStatus.OK);
    }
}
