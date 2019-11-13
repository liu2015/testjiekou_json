package com.example.demo.Ulit;

import org.junit.Test;
import org.springframework.util.DigestUtils;

/**
 * @ProjectName: demo1112
 * @Package: com.example.demo.Ulit
 * @ClassName: MD5Utils
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/11/13 15:36
 * @Version: 1.0
 */

public class MD5Utils {


    @Test
    public void getMD5Utils() {
        String MD5Utils=null;

        String md5String="15927529577";
        MD5Utils=(String) DigestUtils.md5DigestAsHex(md5String.getBytes()  );
      String   MD5Utils1=  MD5Utils.toUpperCase();
        System.out.println( MD5Utils1 );
        System.out.println( MD5Utils );
    }
//大写
    public String getMD5Utils(String args){
        /**
         * @Method getMD5Utils 大写
         * @Author ZHY
         * @Version  1.0
         * @Description
         * @param args
         * @Return java.lang.String
         * @Exception
         * @Date 2019/11/13 16:00
         */
        String MD5Utils=DigestUtils.md5DigestAsHex( args.getBytes() );
        String MD5UtilsDM5= MD5Utils.toUpperCase();
        System.out.println( MD5UtilsDM5 );

        return MD5UtilsDM5;
    }

}
