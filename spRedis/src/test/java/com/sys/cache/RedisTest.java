package com.sys.cache;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.odao.model.TdUser;
import com.odao.service.TdUserService;

/**
 * 测试
 * 
 * @author http://blog.csdn.net/java2000_wl
 * @version <b>1.0</b>
 */
@ContextConfiguration(locations = { "classpath*:spring-mvc.xml" })
public class RedisTest extends AbstractJUnit4SpringContextTests {

	// @Autowired
	// private TdUserService tdUserService;

	ApplicationContext context = null;

	@Before
	public void initContext() {
		this.context = new FileSystemXmlApplicationContext("classpath:spring-mybatis.xml");
	}

	@Test
	public void testAdd() {
		TdUserService tdUserService = (TdUserService) context.getBean("tdUserService");
		TdUser a = new TdUser(34l, "one");
		System.out.println(1 / 0);
		TdUser b = new TdUser(34l, "one");
		tdUserService.insertSelective(a, b);
	}
}