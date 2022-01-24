package com.jlu.lmsweb.utils;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.util.FileCopyUtils;

import java.io.*;

public class FileUtils {

    public static File findMatchingFile(String fileName) throws IOException{
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource resource = resolver.getResource("classpath:" + fileName);
        return resource.getFile();
    }

    public static String fileToString(File file) throws IOException{
        byte[] bytes = FileCopyUtils.copyToByteArray(file);
        return new String(bytes);
    }

    public static String findAndToString(String fileName) {
        String ret = null;
        try {

            File matchingFile = findMatchingFile(fileName);
            ret = fileToString(matchingFile);
        }catch (IOException e) {
            e.printStackTrace();
        }
        return ret;
    }
}
