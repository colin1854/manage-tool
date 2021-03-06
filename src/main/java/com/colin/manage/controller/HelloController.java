package com.colin.manage.controller;

import com.alibaba.fastjson.JSONObject;
import netscape.javascript.JSObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello world !";
    }

    @GetMapping("/hello2")
    public String sayHello2(){
        return "hello world !";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){

        return "index";
    }

    @RequestMapping(value = "/api/currentUser")
    @ResponseBody
    public String currentUser(){

        return "{\"success\":true,\"data\":{\"name\":\"Serati Ma\",\"avatar\":\"https://gw.alipayobjects.com/zos/antfincdn/XAosXuNZyF/BiazfanxmamNRoxxVxka.png\",\"userid\":\"00000001\",\"email\":\"antdesign@alipay.com\",\"signature\":\"海纳百川，有容乃大\",\"title\":\"交互专家\",\"group\":\"蚂蚁金服－某某某事业群－某某平台部－某某技术部－UED\",\"tags\":[{\"key\":\"0\",\"label\":\"很有想法的\"},{\"key\":\"1\",\"label\":\"专注设计\"},{\"key\":\"2\",\"label\":\"辣~\"},{\"key\":\"3\",\"label\":\"大长腿\"},{\"key\":\"4\",\"label\":\"川妹子\"},{\"key\":\"5\",\"label\":\"海纳百川\"}],\"notifyCount\":12,\"unreadCount\":11,\"country\":\"China\",\"access\":\"admin\",\"geographic\":{\"province\":{\"label\":\"浙江省\",\"key\":\"330000\"},\"city\":{\"label\":\"杭州市\",\"key\":\"330100\"}},\"address\":\"西湖区工专路 77 号\",\"phone\":\"0752-268888888\"}}";
    }

    @RequestMapping(value = "/api/spider/login")
    @ResponseBody
    public String slogin(@RequestBody String loginReq){
        System.out.println(loginReq);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status","ojbk");

        return jsonObject.toJSONString();
    }

    @RequestMapping(value = "/api/login/account")
    @ResponseBody
    public String account(@RequestBody String loginReq){
        System.out.println(loginReq);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status","ok");

        return jsonObject.toJSONString();
    }
}
