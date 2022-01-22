package org.chy.anubis.treasury.web.enums;

public enum FileType {

    BLOB("blob", 1),
    DIRECTORY("directory", 2);

    String name;
    int code;

    FileType(String name, int code) {
        this.name = name;
        this.code = code;
    }
}
