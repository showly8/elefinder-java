package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        WebDriver webDriver=new SafariDriver();
        String url = "https://www.baidu.com";
        webDriver.get(url);
        webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        System.out.println("title:"+webDriver.getTitle());
    }
}
