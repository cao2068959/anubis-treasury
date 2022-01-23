package org.chy.anubis.treasury.web.entity;

import org.chy.anubis.treasury.web.enums.FileType;

import static org.chy.anubis.treasury.web.enums.FileType.BLOB;

public class FileBlobDescribeInfo extends FileDescribeInfo {

    String blobData;

    public FileBlobDescribeInfo(String name, String blobData) {
        super(name, BLOB);
        this.blobData = blobData;
    }

    public String getBlobData() {
        return blobData;
    }
}
