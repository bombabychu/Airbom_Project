package com.app.airbom.service;

import org.springframework.stereotype.Service;

@Service
@FunctionalInterface
public interface IGetService {
	public Object execute(Object o);
}
