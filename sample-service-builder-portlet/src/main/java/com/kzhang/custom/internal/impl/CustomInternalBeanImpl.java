package com.kzhang.custom.internal.impl;

import com.kzhang.custom.internal.CustomInternalBean;

public class CustomInternalBeanImpl implements CustomInternalBean {

	@Override
	public void internal() {
		System.out.println("I am CustomInternalBeanImpl!");
	}
}
