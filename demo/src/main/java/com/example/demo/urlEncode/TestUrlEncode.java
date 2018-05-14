package com.example.demo.urlEncode;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class TestUrlEncode {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(URLEncoder.encode("https://a1-weixin.wowschool.com/init/entry", "UTF-8"));
        System.out.println(URLEncoder.encode("https://external-weixin.wowschool.com/init/entry", "UTF-8"));
    }
}
