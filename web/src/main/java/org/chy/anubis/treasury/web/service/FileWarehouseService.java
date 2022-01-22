package org.chy.anubis.treasury.web.service;

import org.chy.anubis.treasury.web.entity.FileDescribeInfo;
import org.chy.anubis.treasury.web.property.FileWarehouseProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileWarehouseService {

    @Autowired
    FileWarehouseProperty fileWarehouseProperty;

    public List<FileDescribeInfo> findFilePath(String path){
        fileWarehouseProperty.getPath();

        return null;
    }

}
