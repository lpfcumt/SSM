/**
 * @author 林鹏飞
 * @since JDK1.8
 * @describe 
 * @time 2017年6月1日下午6:44:44
 */
package com.github.lpfcumt.service;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.github.lpfcumt.pojo.Students;

/**
 * @author 林鹏飞
 * @since Jdk1.8
 * @describe 
 * @time 2017年6月1日下午6:44:44
 */
public interface StudentsService {
	
	/**
	 * @method 根据id删除student
	 * @author 林鹏飞
	 * @param id
	 */
	void deleteById(String id);
	
	/**
	 * @method 查询所有students
	 * @author 林鹏飞
	 * @return List<Students>
	 */
	List<Students> queryAll();
	
	
	/**
	 * @method 分页查询
	 * @author 林鹏飞
	 * @param pageNumber 当前页码
	 * @param pageSize   每页数量
	 * @return List<Students>
	 */
	List<Students> queryByPage(int pageNumber,int pageSize);
	
	/**
	 * @method 查询总页数
	 * @author 林鹏飞
	 * @return
	 */
	int count();

	/**
	 * @method 登录验证
	 * @author 林鹏飞
	 * @param students_id
	 * @param password
	 * @return Boolean
	 */
	Boolean checkLogin(String students_id, int password);

	/**
	 * @method 登录
	 * @author 林鹏飞
	 * @param students_id
	 * @return ModelAndView
	 */
	ModelAndView sendLogin(String students_id);
	
	/**
	 * @method 根据ID查询students
	 * @author 林鹏飞
	 * @param students_id
	 * @return List<Students>
	 */
	List<Students> queryById(String students_id);

	/**
	 * @method 添加学生
	 * @author 林鹏飞
	 * @param students
	 */
	void addStudents(Students students);

}
