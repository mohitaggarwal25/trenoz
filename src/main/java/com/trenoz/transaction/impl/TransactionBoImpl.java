package com.trenoz.transaction.impl;

import javax.inject.Singleton;

import org.springframework.stereotype.Service;

import com.trenoz.transaction.TransactionBo;

@Singleton
@Service
public class TransactionBoImpl implements TransactionBo {

	public String save() {

		return "Jersey + Spring example";

	}

}