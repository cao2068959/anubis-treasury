package org.chy.anubis.treasury.web.service;

import org.apache.commons.io.IOUtils;
import org.chy.anubis.treasury.web.core.AnubisFileWarehouseContext;
import org.chy.anubis.treasury.web.entity.FileBlobDescribeInfo;
import org.chy.anubis.treasury.web.entity.FileDescribeInfo;
import org.chy.anubis.treasury.web.enums.FileType;
import org.chy.anubis.treasury.web.property.FileWarehouseProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FileWarehouseService {

    @Autowired
    FileWarehouseProperty fileWarehouseProperty;

    @Autowired
    AnubisFileWarehouseContext warehouseContext;

    public List<FileDescribeInfo> findFileList(String path) {
        return warehouseContext.findFileList(path);
    }

    public List<FileBlobDescribeInfo> findFileContents(String path) {

        //先获取这个目录下所有的文件列表
        List<FileDescribeInfo> fileList = warehouseContext.findFileList(path);

        return fileList.stream().filter(fileDescribeInfo -> fileDescribeInfo.getFileType() == FileType.BLOB)
                .map(fileDescribeInfo -> warehouseContext.fetchFileContent(fileDescribeInfo.getUrl()))
                .collect(Collectors.toList());
    }


    public FileBlobDescribeInfo findFileContent(String path) {
        return warehouseContext.fetchFileContent(path);
    }
}
