package com.juan;/**
 * @author admin
 * @date 2020/4/1
 */

import com.juan.service.TestService;
import com.juan.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author admin
 * @date 2020/4/1
 * @decription:
 */

public class AppTest {
	public static void main(String[] args) {
		//初始化Spring容器
		AnnotationConfigApplicationContext applicationContext
				= new AnnotationConfigApplicationContext(  );
		applicationContext.register( TestService.class );
		applicationContext.refresh();
		applicationContext.getBean( UserService.class ).hashCode();

	}
}
