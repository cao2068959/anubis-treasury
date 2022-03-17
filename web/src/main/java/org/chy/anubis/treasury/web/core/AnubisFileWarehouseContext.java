package org.chy.anubis.treasury.web.core;

import org.apache.commons.io.IOUtils;
import org.chy.anubis.treasury.web.entity.FileBlobDescribeInfo;
import org.chy.anubis.treasury.web.entity.FileDescribeInfo;
import org.chy.anubis.treasury.web.enums.FileType;
import org.chy.anubis.treasury.web.exception.FileWarehouseException;
import org.chy.anubis.treasury.web.property.FileWarehouseProperty;
import org.springframework.stereotype.Component;
import org.springframework.util.Base64Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AnubisFileWarehouseContext {


    private FileWarehouseProperty fileWarehouseProperty;

    File fileRoot;

    public AnubisFileWarehouseContext(FileWarehouseProperty property) {
        this.fileWarehouseProperty = property;
        String filePath = property.getPath();
        this.fileRoot = new File(filePath + "/src/main/java/org/chy/anubis/treasury");
        if (!fileRoot.exists() || !fileRoot.isDirectory()) {
            throw new FileWarehouseException("路径[" + filePath + "] 不是一个合法的anubis仓库地址 " +
                    "请指定配置 [ anubis.filewarehouse.path ] 来指定一个 anubis仓库地址");
        }
    }

    /**
     * 获取某个路径下面的文件列表
     *
     * @return
     */
    public List<FileDescribeInfo> findFileList(String path) {
        File[] files = getTargetFile(path).listFiles();
        if (files == null) {
            return new ArrayList<>(0);
        }

        String urlPathRoot = handlePath(path) + "/";
        return Arrays.stream(files).map(file -> {
            FileType fileType = file.isDirectory() ? FileType.DIRECTORY : FileType.BLOB;
            FileDescribeInfo result = new FileDescribeInfo(file.getName(), fileType);
            result.setUrl(urlPathRoot + file.getName());
            return result;
        }).collect(Collectors.toList());

    }

    public FileBlobDescribeInfo fetchFileContent(String filePath) {
        File targetFile = getTargetFile(filePath);
        if (!targetFile.exists() || targetFile.isDirectory() || !targetFile.canRead()) {
            throw new FileWarehouseException("文件 [" + filePath + "] 不能被读取");
        }

        try (FileInputStream fileInputStream = new FileInputStream(targetFile)) {
            byte[] bytes = IOUtils.toByteArray(fileInputStream);
            String data = Base64Utils.encodeToString(bytes);
            return new FileBlobDescribeInfo(targetFile.getName(), data);

        } catch (Exception e) {
            e.printStackTrace();
            throw new FileWarehouseException("文件 [" + filePath + "] 读取失败");
        }


    }

    private File getTargetFile(String path) {
        path = handlePath(path);
        String targetPath = fileRoot.getAbsolutePath() + "/" + path;
        return new File(targetPath);
    }


    private String handlePath(String path) {
        if (path == null) {
            return "";
        }
        path = path.trim();

        int startIndex = 0;
        int endIndex = path.length() - 1;

        if (path.startsWith("/")) {
            startIndex = 1;
        }
        if (path.endsWith("/")) {
            endIndex = endIndex - 1;
        }

        if (endIndex - startIndex < path.length() - 1) {
            path = path.substring(startIndex, endIndex + 1);
        }
        return path;
    }

    private String[] disassemblePath(String path) {
        if (path == null || path.equals("")) {
            return new String[0];
        }
        return path.split("/");
    }

}
