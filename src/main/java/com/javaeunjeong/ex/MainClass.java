package com.javaeunjeong.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//컨테이너 객체를 ApplicationConfig 클래스로 설정하여 생성
		
		Student student1 = ctx.getBean("student1",Student.class);
		Student student2 = ctx.getBean("student2",Student.class);
		
		System.out.println(student1.getName());//홍길동
		System.out.println(student2.getName());//이순신
	
		ctx.close();
	
	
	}

}
