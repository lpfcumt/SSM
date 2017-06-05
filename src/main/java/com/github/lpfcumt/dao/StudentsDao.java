package com.github.lpfcumt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.lpfcumt.pojo.Students;

/**
 * @author 林鹏飞
 * @since Jdk1.8
 * @describe 
 * @time 2017年6月1日下午5:13:20
 */
public interface StudentsDao {

	
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
	 * @method 查询总数
	 * @author 林鹏飞
	 * @return
	 */
	int count();

	/**
	 * @method 检查登录
	 * @author 林鹏飞
	 * @param students_id
	 * @param password
	 * @return List<Students>
	 */
	List<Students> checkLogin(@Param("students_id")String students_id, @Param("password")int password);

	/**
	 * @method 根据ID查询students
	 * @author 林鹏飞
	 * @param students_id
	 * @return List<Students>
	 */
	List<Students> queryById(String students_id);
	
	
}
