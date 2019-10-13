package com.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序入口
 * 
 * @author Naij 52java.cn
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class CMSApplication
{
    public static void main(String[] args)
    {
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(CMSApplication.class, args);
        
        System.out.println("(♥◠‿◠)ﾉﾞ  CMS启动成功   ლ(´ڡ`ლ)ﾞ  \n ");
    }
}