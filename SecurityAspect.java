package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class SecurityAspect {
	
	@Before("execution(public * apply*(..))")
	public void securityCheckIn(JoinPoint jp) {
		System.out.println("Security checking in "+jp);
	}
}
