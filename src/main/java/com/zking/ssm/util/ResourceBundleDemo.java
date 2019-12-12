package com.zking.ssm.util;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String[] args) {
        String path="i18n";

        ResourceBundle rb=ResourceBundle.getBundle(path);
        String name= rb.getString("name");
        System.out.println(name);

        ResourceBundle rb2=ResourceBundle.getBundle(path, Locale.US);
        String name2= rb2.getString("name");
        System.out.println(name2);

        String message=rb.getString("message");
        message= MessageFormat.format(message,"露丝","杰克");
        System.out.println(message);

        String message2=rb2.getString("message");
        message2= MessageFormat.format(message2,"rose","jeck");
        System.out.println(message2);
    }
}
