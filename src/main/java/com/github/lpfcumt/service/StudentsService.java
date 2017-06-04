/**
 * @author 林鹏飞
 * @since JDK1.8
 * @describe 
 * @time 2017年6月1日下午6:44:44
 */
package com.github.lpfcumt.service;

import java.util.List;

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
	void deleteById(int id);
	
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
	Boolean checkLogin(int students_id, int password);

}
