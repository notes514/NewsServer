package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.NewsContentMapper;
import com.example.demo.mapper.NewsDetailsMapper;
import com.example.demo.mapper.NewsTypeMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.NewsContent;
import com.example.demo.model.NewsDetails;
import com.example.demo.model.NewsType;
import com.example.demo.model.User;
import com.example.demo.model.UserExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/news")
public class NewsController {
	
	private static final String key = "RESULT";
	private static final String rows = "ROWS_DETAIL";
	
	@Autowired
	private UserMapper um;
	@Autowired
	private NewsContentMapper ncm;
	@Autowired
	private NewsTypeMapper ntm;
	@Autowired
	private NewsDetailsMapper ndm;
	
	/**
	 * 用户登录
	 * @return
	 */
	@RequestMapping("/login")
	public Map<String, Object> login(@RequestBody User user) {
		UserExample userExample = new UserExample();
		//拼接查询
		userExample.createCriteria().andUserNameEqualTo(user.getUserName())
			.andPasswordEqualTo(user.getPassword());
		
		List<User> uList = um.selectByExample(userExample);
		Map<String, Object> map = new HashMap<String, Object>();
		
		if (uList.size() > 0) { // 判断用户是否存在
			map.put(key, "登录成功！");
			map.put(rows, uList.get(0));
			return map;
		} else {
			map.put(key, "失败！");
			return map;
		}
	}
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	@RequestMapping("/addUser")
	public Map<String, String> addUser(@RequestBody User user) {
		UserExample userExample = new UserExample();
		Map<String, String> map = new HashMap<String, String>();
		//插入数据
		try {
			um.insertSelective(user);
			//更新表数据
			um.updateByExampleSelective(user, userExample);
			map.put(key, "注册成功！");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return map;
	}
	
	/**
	 * 添加新闻类型
	 * @param newsContent
	 * @return
	 */
	@RequestMapping("/addNewsType")
	public Map<String, String> addNewsType(@RequestBody NewsType newsType) {
		Map<String, String> map = new HashMap<String, String>();
		//插入数据
		try {
			ntm.insert(newsType);
			//更新表数据
			ntm.updateByPrimaryKey(newsType);
			map.put(key, "添加成功！");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return map;
	}
	
	@RequestMapping("/queryNewsType")
	public List<NewsType> queryNewsType(){
		return ntm.selectByExample(null);
	}
	
	/**
	 * 添加新闻
	 * @param newsContent
	 * @return
	 */
	@RequestMapping("/addNewsContent")
	public Map<String, String> addNewsContent(@RequestBody NewsContent newsContent) {
		Map<String, String> map = new HashMap<String, String>();
		//插入数据
		try {
			ncm.insert(newsContent);
			//更新表数据
			ncm.updateByPrimaryKey(newsContent);
			map.put(key, "添加成功！");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return map;
	}
	
	/**
	 * 查询新闻内容数据
	 * @return
	 */
	@RequestMapping("/queryNewsContent")
	public List<NewsContent> queryNewsContent(){
		return ncm.selectByExample(null);
	}
	
	/**
	 * 添加新闻内容详细
	 * @param newsContent
	 * @return
	 */
	@RequestMapping("/addNewsDetails")
	public Map<String, String> addNewsDetails(@RequestBody NewsDetails newsDetails) {
		Map<String, String> map = new HashMap<String, String>();
		//插入数据
		try {
			ndm.insert(newsDetails);
			//更新表数据
			ndm.updateByPrimaryKey(newsDetails);
			map.put(key, "添加成功！");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return map;
	}

	/**
	 * 查询新闻内容详细数据
	 * @return
	 */
	@RequestMapping("/queryNewsDetails")
	public List<NewsDetails> queryNewsDetails(){
		return ndm.selectByExample(null);
	}
	
}
