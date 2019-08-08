package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.NewsContentMapper;
import com.example.demo.mapper.NewsDetailsMapper;
import com.example.demo.mapper.NewsTypeMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.Evaluate;
import com.example.demo.model.NewsContent;
import com.example.demo.model.NewsContentExample;
import com.example.demo.model.NewsDetails;
import com.example.demo.model.NewsDetailsExample;
import com.example.demo.model.NewsType;
import com.example.demo.model.NewsTypeExample;
import com.example.demo.model.User;
import com.example.demo.model.UserExample;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/news")
public class NewsController {
	//返回结果(S或F)
	private static final String KEY = "RESULT";
	//提示
	private static final String TIPS = "TIPS";
	//返回的数据（一般情况下为数组）
	private static final String ROWS = "ROWS_DETAIL";
	
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
			map.put(KEY, "S");
			map.put(ROWS, uList.get(0));
			return map;
		} else {
			map.put(KEY, "F");
			return map;
		}
	}
	
	/**
	 * 更新用户信息
	 * @param user
	 * @return
	 */
	@RequestMapping("updateUser")
	public Map<String, String> updateUser(@RequestBody User user, int userId) {
		User users = um.selectByPrimaryKey(userId);
		Map<String, String> map = new HashMap<String, String>();
		if (users == null) {
			map.put(KEY, "F");
			map.put(TIPS, "没有该用户信息！");
			return map;
		}
		try {//数据库更新异常捕获
			um.updateByExampleSelective(user, new UserExample());
		} catch (Exception e) {
			map.put(KEY, "F");
			map.put(TIPS, "更新失败！");
			return map;
		}
		map.put(KEY, "S");
		map.put(TIPS, "更新成功！");
		return map;
	}
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	@RequestMapping("/userRegister")
	public Map<String, String> userRegister(@RequestBody User user) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			//设置注册时间
			user.setUserRegisterTime(new Date());
			//插入数据
			um.insertSelective(user);
			//更新表数据
			um.updateByExampleSelective(user, new UserExample());
		} catch (Exception e) {
			map.put(KEY, "F");
			map.put(TIPS, "注册失败！");
			return map;
		}
		map.put(KEY, "S");
		map.put(TIPS, "注册成功！");
		return map;
	}
	
	/**
	 * 添加新闻类型
	 * @param newsType
	 * @return
	 */
	@RequestMapping("/addNewsType")
	public Map<String, String> addNewsType(@RequestBody NewsType newsType) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			//插入数据
			ntm.insert(newsType);
			//更新表数据
			ntm.updateByPrimaryKey(newsType);
		} catch (Exception e) {
			map.put(KEY, "F");
			map.put(TIPS, "添加失败！");
			return map;
		}
		map.put(KEY, "S");
		map.put(TIPS, "添加成功！");
		return map;
	}
	
	/**
	 * 删除指定的新闻类型标签
	 * @param typeId
	 * @return
	 */
	@RequestMapping("/deleteNewsType")
	public Map<String, String> deleteNewsType(int typeId) {
		NewsType type = ntm.selectByPrimaryKey(typeId);
		Map<String, String> map = new HashMap<String, String>();
		if (type == null) {
			map.put(KEY, "F");
			map.put(TIPS, "没有该条新闻类型！");
			return map;
		}
		try {
			ntm.deleteByPrimaryKey(typeId);
			ntm.updateByExampleSelective(type, new NewsTypeExample());
		} catch (Exception e) {
			map.put(KEY, "F");
			map.put(TIPS, "删除失败！");
			return map;
		}
		map.put(KEY, "F");
		map.put(TIPS, "删除成功！");
		return map;
	}
	
	/**
	 * 查询新闻类型数据
	 * @return
	 */
	@RequestMapping("/queryNewsType")
	public List<NewsType> queryNewsType(){
		return ntm.selectByExample(null);
	}
	
	/**
	 * 更新新闻类型数据
	 * @param newsType
	 * @param typeId
	 * @return
	 */
	@RequestMapping("/updateNewsType")
	public Map<String, String> updateNewsType(@RequestBody NewsType newsType, int typeId) {
		NewsType type = ntm.selectByPrimaryKey(typeId);
		Map<String, String> map = new HashMap<String, String>();
		if (type == null) {
			map.put(KEY, "F");
			map.put(TIPS, "没有该条新闻类型！");
			return map;
		}
		try {
			ntm.updateByExampleSelective(newsType, new NewsTypeExample());
		} catch (Exception e) {
			map.put(KEY, "F");
			map.put(TIPS, "更新失败！");
			return map;
		}
		map.put(KEY, "S");
		map.put(TIPS, "更新成功！");
		return map;
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
			newsContent.setNewsTime(new Date());
			ncm.insert(newsContent);
			//更新表数据
			ncm.updateByPrimaryKey(newsContent);
		} catch (Exception e) {
			map.put(KEY, "F");
			map.put(TIPS, "添加失败！");
			return map;
		}
		map.put(KEY, "S");
		map.put(TIPS, "添加成功！");
		return map;
	}

	/**
	 * 删除新闻信息
	 * @param newsId
	 * @return
	 */
	@RequestMapping("/deleteNewsContent")
	public Map<String, String> deleteNewsContent(int newsId) {
		NewsContent content = ncm.selectByPrimaryKey(newsId);
		Map<String, String> map = new HashMap<String, String>();
		if (content == null) {
			map.put(KEY, "F");
			map.put(TIPS, "没有该条新闻信息！");
			return map;
		}
		try {
			ncm.deleteByPrimaryKey(newsId);
			ncm.updateByExampleSelective(content, new NewsContentExample());
		} catch (Exception e) {
			map.put(KEY, "F");
			map.put(TIPS, "删除失败！");
			return map;
		}
		map.put(KEY, "S");
		map.put(TIPS, "删除成功！");
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
	 * 更新新闻内容数据
	 * @param newsContent
	 * @param newsId
	 * @return
	 */
	@RequestMapping("/updateNewsContent")
	public Map<String, String> updateNewsContent(@RequestBody NewsContent newsContent, int newsId) {
		NewsContent content = ncm.selectByPrimaryKey(newsId);
		Map<String, String> map = new HashMap<String, String>();
		if (content == null) {
			map.put(KEY, "F");
			map.put(TIPS, "没有该条新闻信息！");
			return map;
		}
		try {
			ncm.updateByExampleSelective(newsContent, new NewsContentExample());
		} catch (Exception e) {
			map.put(KEY, "F");
			map.put(TIPS, "更新失败！");
			return map;
		}
		map.put(KEY, "S");
		map.put(TIPS, "更新成功！");
		return map;
	}
	
	/**
	 * 添加新闻内容详细
	 * @param newsDetails
	 * @return
	 */
	@RequestMapping("/addNewsDetails")
	public Map<String, String> addNewsDetails(@RequestBody NewsDetails newsDetails) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			//插入数据
			ndm.insert(newsDetails);
			//更新表数据
			ndm.updateByPrimaryKey(newsDetails);
		} catch (Exception e) {
			map.put(KEY, "F");
			map.put(TIPS, "添加成功！");
			return map;
		}
		map.put(KEY, "S");
		map.put(TIPS, "添加成功！");
		return map;
	}
	
	/**
	 * 删除新闻内容详细信息
	 * @param detailsId
	 * @return
	 */
	@RequestMapping("/deleteNewsDetails")
	public Map<String, String> deleteNewsDetails(int detailsId) {
		NewsDetails details = ndm.selectByPrimaryKey(detailsId);
		Map<String, String> map = new HashMap<String, String>();
		if (details == null) {
			map.put(KEY, "F");
			map.put(TIPS, "没有该条新闻内容详细！");
			return map;
		}
		try {
			ndm.deleteByPrimaryKey(detailsId);
			ndm.updateByExampleSelective(details, new NewsDetailsExample());
		} catch (Exception e) {
			map.put(KEY, "F");
			map.put(TIPS, "删除失败！");
			return map;
		}
		map.put(KEY, "S");
		map.put(TIPS, "删除成功！");
		return map;
	}
	
	/**
	 * 更新新闻内容详细
	 * @param newsDetails
	 * @param detailsId
	 * @return
	 */
	@RequestMapping("/updateNewsDetails")
	public Map<String, String> updateNewsDetails(@RequestBody NewsDetails newsDetails, int detailsId) {
		NewsDetails details = ndm.selectByPrimaryKey(detailsId);
		Map<String, String> map = new HashMap<String, String>();
		if (details == null) {
			map.put(KEY, "F");
			map.put(TIPS, "没有该条信息！");
			return map;
		}
		try {
			//更新新闻内容详细数据
			ndm.updateByExampleSelective(newsDetails, new NewsDetailsExample());
		} catch (Exception e) {
			map.put(KEY, "F");
			map.put(TIPS, "更新失败！");
			return map;
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
	
	@RequestMapping("userComment")
	public Map<String, String> userComment(@RequestBody Evaluate evaluate, @RequestBody NewsDetails details) {
		/**
		 * 1、首先，要拿到新闻内容详细ID
		 * 2、判断是否存在改新闻内容详细ID
		 * 3、写入用户评论信息，并更新数据库
		 */
		return null;
	}
	
}
