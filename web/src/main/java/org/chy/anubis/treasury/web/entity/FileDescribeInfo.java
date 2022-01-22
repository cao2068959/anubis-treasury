package org.chy.anubis.treasury.web.entity;

import org.chy.anubis.treasury.web.enums.FileType;

public class FileDescribeInfo {

    String name;
    String url;
    FileType fileType;

    public FileDescribeInfo(String name, FileType fileType) {
        this.name = name;
        this.fileType = fileType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }
}
