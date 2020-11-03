package com.weilf.design.singleton;

/**
 * @author admin
 */
public class XXStudent {

    private static XXStudent instant = null;

    private String name;
    private String url;
    private String addr;

    private XXStudent() {
    }

    public static XXStudent getInstant(){
        if(instant!= null){
            return instant;
        }else {
            instant = new XXStudent();
            return instant;
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }


}
