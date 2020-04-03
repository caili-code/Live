package cn.jerryshell.liveteaching.util;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class Util {
    public static String getFileTypeByFilename(String filename) {
        String[] split = filename.split("\\.");
        return split[split.length - 1];
    }
    public static String fileUpload(CommonsMultipartFile file,String path) {
    	 File newFile=new File(path);
         //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
         try {
			file.transferTo(newFile);
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
    	
    }
}
