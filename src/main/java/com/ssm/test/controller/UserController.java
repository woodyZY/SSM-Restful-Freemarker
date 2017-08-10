package com.ssm.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.test.entity.User;
import com.ssm.test.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource(name="userService")
	private UserService userService;
	
	@RequestMapping("/add")
	public String addUserPage(){
		return "addUser";
	}
	
	/**
	 * restful风格的增方法，_method='post'
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/{userid}",method=RequestMethod.POST )
	@ResponseBody
	public Map<String, Object> addUser(User user){
		userService.insert(user);
		Map<String, Object> requestMap = new HashMap<String, Object>();
		requestMap.put("success", "success");
		return requestMap;
	}
	
	/**
	 * restful风格的删方法 _method='delete'
	 * @param userid
	 * @return
	 */
	@RequestMapping(value="/{userid}",method=RequestMethod.DELETE)
	@ResponseBody
	public Map<String, Object>deleteUser(@PathVariable Integer userid){
		Map<String, Object>requestMap = new HashMap<String, Object>();
		userService.deleteByPrimaryKey(userid);
		requestMap.put("userid", userid);
		return requestMap;
	}
	
	@RequestMapping("/{userid}/update")
	public String updateUserPage(@PathVariable Integer userid,Model model){
		User user = userService.selectByPrimaryKey(userid);
		model.addAttribute("user",user);
		return "updateUser";
	}
	
	/**
	 * restful风格的改方法 _method='put'
	 * @param userid
	 * @param username
	 * @return
	 */
	@RequestMapping(value="/{userid}",method=RequestMethod.PUT)
	public String updateUser(@PathVariable Integer userid,String username){
		User user_t = userService.selectByPrimaryKey(userid);
		user_t.setUsername(username);
		userService.updateByPrimaryKey(user_t);
		return "redirect:/user";
	}
	
	/**
	 * 未设置子路径表示，访问“/user“时则为查询所有user
	 * restful风格的查方法 _method='get'
	 * @param model
	 * @return 
	 */
	@RequestMapping(method=RequestMethod.GET)
	public String getUsers(Model model){
		List<User>users = userService.selectAll();
		model.addAttribute("users", users);
		return "user";
	}
	
	/**
	 * 访问具体的user
	 * @param userid
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/{userid}",method=RequestMethod.GET)
	public String getUser(@PathVariable Integer userid,Model model){
		User user = userService.selectByPrimaryKey(userid);
		List<User>users = new ArrayList<User>();
		users.add(user);
		model.addAttribute("users",users);
		return "user";
	}
}
