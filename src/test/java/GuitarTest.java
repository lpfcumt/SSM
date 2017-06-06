


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.github.lpfcumt.dao.StudentsDao;
import com.github.lpfcumt.pojo.Students;
import com.github.lpfcumt.util.MailUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:springmvc-config.xml"})
@ActiveProfiles("mysql")//测试mysql数据库（测试sqlite是变为sqlite）
@Transactional//事务回滚，测试成功后不会持久化到数据库（如果不需要可不加）
public class GuitarTest {	
		
	@Autowired
	private StudentsDao guitarDao;	
	@Autowired
	private MailUtil mailUtil;
	
	@Test
	public void search(){		
		List<Students> list=guitarDao.queryAll();
		System.out.println(list.size());
	}
	
	@Test 
	public void sendEmail(){
		
			mailUtil.sendTextMail("1009925846@qq.com", "你好", "123");
			System.out.println("邮件已发送");
	
		
	}
	
	
}
