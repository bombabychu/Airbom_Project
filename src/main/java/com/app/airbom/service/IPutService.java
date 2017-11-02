package com.app.airbom.service;

import org.springframework.stereotype.Service;

@Service
@FunctionalInterface
public interface IPutService {
	public void execute(Object o);
}
