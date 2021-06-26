//package com.easy.archiecture.controller;
//
//import com.easy.archiecture.entity.User;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiImplicitParam;
//import io.swagger.annotations.ApiImplicitParams;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.*;
//
//@RestController
//@Api(tags = "用户模块")
//public class HelloController {
//
//    static Map<String, User> userMap = Collections.synchronizedMap(new HashMap<>());
//
//    static {
//        userMap.put("111", new User("111", 11, "aaa"));
//        userMap.put("222", new User("222", 22, "bbb"));
//        userMap.put("333", new User("333", 33, "ccc"));
//        userMap.put("444", new User("444", 44, "ddd"));
//        userMap.put("555", new User("555", 55, "eee"));
//        userMap.put("666", new User("666", 66, "fff"));
//
//    }
//
//
//    @ApiOperation(value = "获取用户列表", notes = "")
//    @RequestMapping(value = {""}, method = RequestMethod.GET)
//    public List<User> getUserList() {
//        List<User> r = new ArrayList<>(userMap.values());
//        return r;
//    }
//
//    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
////    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, )
//    @RequestMapping(value = "", method = RequestMethod.POST)
//    public String postUser(@RequestBody User user) {
//        userMap.put(user.getId(), user);
//        return "success";
//    }
//
//    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
//    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String")
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public User getUser(@PathVariable String id) {
//        return userMap.get(id);
//    }
//
//    @ApiOperation(value = "更新用户详细信息", notes = "根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
////    @ApiImplicitParams({
////            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String"),
////            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "com.easy.archiecture.entity.User")
////    })
//    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//    public String putUser(@PathVariable String id, @RequestBody User user) {
//        User u = userMap.get(id);
//        u.setName(user.getName());
//        u.setAge(user.getAge());
//        userMap.put(id, u);
//        return "success";
//    }
//
//    @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
//    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String")
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    public String deleteUser(@PathVariable String id) {
//        userMap.remove(id);
//        return "success";
//    }
//
//    @RequestMapping("/hello")
//    public String index() {
//        return "Hello World";
//    }
//
//}