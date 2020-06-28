package com.example.biji.Pass;

public class Note {
    private long id;
    private String content;
    private String time;
    private int tag;
    private String path;
    private String vided;

    public Note(String content, String time, int tag, String path, String vided) {
        this.id = id;
        this.content = content;
        this.time = time;
        this.tag = tag;
        this.path = path;
        this.vided = vided;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getVided() {
        return vided;
    }

    public void setVided(String vided) {
        this.vided = vided;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getTime() {
        return time;
    }

    public int getTag() {
        return tag;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return content + "\n" + time.substring(5,16) + " "+ id;
    }


}
