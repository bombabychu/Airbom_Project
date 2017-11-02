package com.app.airbom.service;

import org.springframework.stereotype.Service;

@Service
@FunctionalInterface
public interface IPostService {
	public void execute(Object o);
}
