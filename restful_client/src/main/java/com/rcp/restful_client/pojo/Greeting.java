package com.rcp.restful_client.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @auther Stiles-JKY
 * @date 2020/9/10-21:54
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Greeting {
    private long id;
    private String content;

    public Greeting() {
    }

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

    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
