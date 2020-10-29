package kr.chunlima.api.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * <aop:before> : 타겟 메서드 실행 전에 advice실행
 * <aop:after-returning> : 정상적으로 메서드 실행 후에 advice실행
 * <aop:after-throwing> : 어드바이스 메서드 실행중 exception 발생 시 advice실행
 * <aop:after> : 어드바이스 타겟 메서드 실행중 exception이 발생하여도 advice실행
 * <aop:around> : 어드바이스 타겟 메서드 실행 전/후 밑 exception 발생시 advice 실행
 * */

@Aspect
@Component
public class CheckAspect {
	private static final Logger logger = LoggerFactory.getLogger(CheckAspect.class);
	
	@Before("execution(* kr.chunlima.api.controller..*.*(..))")
	public void onBeforeHandler(JoinPoint joinPoint) {
		logger.info("Before method on Controller");
	}
	
	@After("execution(* kr.chunlima.api.controller..*.*(..))")
	public void onAfterHandler(JoinPoint joinPoint) {
		logger.info("After method on Controller");
	}
}
