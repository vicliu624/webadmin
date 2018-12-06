package com.inesanet.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @Auther: liuweikai
 * @Date: 2018/12/3 15:46
 * @Description:
 */
public class FileUtil {
    private static Logger LOG = LogManager.getLogger(FileUtil.class.getName());

    public static String upload(MultipartFile file, String path) throws IOException {

        String uuidFileName = Utils.generateUUID();
        String fileName = file.getOriginalFilename();
        String extensionName = fileName.substring(fileName.lastIndexOf(".") + 1);
        String newFileName = fileName + "_" + uuidFileName + "." + extensionName;
        File targetFile = new File(path);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        Files.copy(file.getInputStream(), Paths.get(path, newFileName));
        //System.out.println(path);
        //Runtime.getRuntime().exec("chmod 755 goodsimage/" + newFileName);
        return targetFile.getAbsolutePath() + File.separator + newFileName;
    }

    public static void delete(String path, String fileName) throws IOException {
        File delete = new File(path + "\\" + fileName);
        boolean b = delete.delete();
        if (b) {
            LOG.info("删除文件 {}",path + "\\" + fileName);
        }
    }

    public static boolean deleteDir(File file) {
        if (file.isFile() || file.list().length == 0) {
            file.delete();
            // return  false;
        } else {
            File[] files = file.listFiles();
            for (File f : files) {
                deleteDir(f);//递归删除每一个文件
                f.delete();//删除该文件夹
            }
        }
        //删除子文件成功，全部删除文件
        return  file.delete();
    }
}
