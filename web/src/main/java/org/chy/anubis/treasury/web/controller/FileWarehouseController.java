package org.chy.anubis.treasury.web.controller;

import org.chy.anubis.treasury.web.entity.FileBlobDescribeInfo;
import org.chy.anubis.treasury.web.entity.FileDescribeInfo;
import org.chy.anubis.treasury.web.entity.JsonResult;
import org.chy.anubis.treasury.web.exception.FileWarehouseException;
import org.chy.anubis.treasury.web.property.FileWarehouseProperty;
import org.chy.anubis.treasury.web.service.FileWarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/anubis/filewarehouse")
public class FileWarehouseController {

    @Autowired
    FileWarehouseService service;

    /**
     * 获取对应路径下面的所有 文件/文件夹 列表
     *
     * @param path
     * @return
     */
    @GetMapping("filelist")
    public JsonResult findFileList(String path) {
        return JsonResult.success(service.findFileList(path));
    }

    /**
     * 获取对应路径下面的所有 文件/文件夹, 如果是文件,那么还会取出对应的内容
     *
     * @param path
     * @return
     */
    @GetMapping("/content/list")
    public JsonResult findFileContents(String path) {
        try {
            return JsonResult.success(service.findFileContents(path));
        } catch (FileWarehouseException fileWarehouseException) {
            return JsonResult.fail(fileWarehouseException.getMsg());
        }
    }

}
