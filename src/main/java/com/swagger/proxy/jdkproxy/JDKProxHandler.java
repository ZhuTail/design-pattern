package com.swagger.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK�Ķ�̬����
 * 		InvocationHandler ����
 * @author Administrator
 *
 */
public class JDKProxHandler implements InvocationHandler {

	private InterfaceImpl impl;
	
	public JDKProxHandler(InterfaceImpl impl) {
		this.impl = impl;
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		String methodName = method.getName();
		System.out.println("��������"+methodName);
		Object object = method.invoke(impl, args);
		System.out.println("���Ϊ:"+object);
		return object;
	}

}
