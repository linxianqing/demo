//package com.demo.web;
//
//import com.demo.exception.MyException;
//import org.springframework.stereotype.controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//
///**
// *
// * @author 程序猿DD
// * @version 1.0.0
// * @blog http://blog.didispace.com
// *
// */
//@controller
//public class HelloController {
//
//    @RequestMapping("/hello")
//    public String hello() throws Exception {
//        throw new Exception("发生错误");
//    }
//
//    @RequestMapping("/json")
//    public String json() throws MyException {
//        throw new MyException("发生错误2");
//    }
//
//    @RequestMapping("/index")
//    public String index(ModelMap map) {
//        map.addAttribute("host", "http://blog.didispace.com");
//        return "index";
//    }
//
//}