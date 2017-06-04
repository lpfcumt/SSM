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
	void deleteById(int id); 
	
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

	List<Students> checkLogin(@Param("students_id")int students_id, @Param("password")int password);
	
	
}
