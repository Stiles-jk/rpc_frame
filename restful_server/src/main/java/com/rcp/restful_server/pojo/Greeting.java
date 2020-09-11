package com.rcp.restful_server.pojo;

/**
 * @auther Stiles-JKY
 * @date 2020/9/10-21:54
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
