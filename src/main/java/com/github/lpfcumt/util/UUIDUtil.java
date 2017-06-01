package com.github.lpfcumt.util;

import java.util.UUID;

/**
 * @author 林鹏飞
 * @since Jdk1.8
 * @describe 
 * @time 2017年6月1日下午7:00:43
 */
public class UUIDUtil {
	
	/**
	 * @method 生成UUID
	 * @author 林鹏飞
	 * @return String
	 */
	public static String generate(){
		String uuid=UUID.randomUUID().toString();
		String uuidString=uuid.replace("-", "");
		return uuidString;
		
	}

}
