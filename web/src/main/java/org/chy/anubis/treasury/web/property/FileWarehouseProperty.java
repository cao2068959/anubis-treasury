package org.chy.anubis.treasury.web.property;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

@ConfigurationProperties("anubis.filewarehouse")
@Configuration
public class FileWarehouseProperty {

    String path;

    public String getPath() {
        if (path == null){
            setPathDefault();
        }
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private void setPathDefault(){
        URL resource = Thread.currentThread().getContextClassLoader().getResource("");
        String projectPath = resource.getPath();
        int suffixIndex = projectPath.lastIndexOf("/web/target/classes");
        if (suffixIndex == -1){
            throw new RuntimeException("路径: [" + resource + "] 不能找到 FileWarehouse path, 请指定配置 [ anubis.filewarehouse.path ]");
        }
        this.path = projectPath.substring(0, suffixIndex);
    }

}
