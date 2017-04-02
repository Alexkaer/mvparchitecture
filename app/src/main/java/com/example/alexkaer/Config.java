package com.example.alexkaer;

/**
 * Created by alexkaer on 2017/3/10.
 */

public class Config {
    /**
     * debug开关
     */
    public final static boolean DEBUG = true;
    //服务器地址
    public final static String Server = "http://192.168.1.230:8080/toprank-pad-web/";
//    public final static String Server = "http://192.168.1.100:8090/toprank-pad-web/";

    /**
     * 需要验证的https主机列表,如：www.uobock.com
     */
    public static String Https_Hosts[]= {};
    /**
     * https证书列表,证书文件请放在raw目录下
     */
    public static int[] Certificate = new int[]{};
}
