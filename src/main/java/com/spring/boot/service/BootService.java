package com.spring.boot.service;

import org.springframework.stereotype.Service;

@Service
public class BootService  {
	public boolean addBoot(String ss) {
		if (ss.isEmpty()) {
			System.out.println("Oblect what ever you passed is empty");
			return false;

		} else {
			System.out.println("Object Added Successfully in DB " + ss.toString());
			return true;
		}

	}
}
