/*******************************************************************************
 * Copyright (c) 2021, 2021 Hirain Technologies Corporation.
 ******************************************************************************/
package com.alex.demo.reflect;

/**
 * @Author alex
 * @Created Feb 8, 2021 2:09:49 PM
 * @Description
 *              <p>
 */
public class TestReflect {

	public static void main(String[] args) {
		try {
			// 创建对象
			ReflectUtil.reflectNewInstance();

			// 反射私有的构造方法
			ReflectUtil.reflectPrivateConstructor();

			// 反射私有属性
			ReflectUtil.reflectPrivateField();

			// 反射私有方法
			ReflectUtil.reflectPrivateMethod();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
