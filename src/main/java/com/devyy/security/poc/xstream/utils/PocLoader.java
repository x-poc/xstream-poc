package com.devyy.security.poc.xstream.utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public final class PocLoader {

    public static String getPoc(String poc) {
        URL url = PocLoader.class.getClassLoader().getResource(poc);
        if (Objects.isNull(url)) {
            return "";
        }
        File pocFile = new File(url.getFile());
        try {
            return FileUtils.readFileToString(pocFile, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
