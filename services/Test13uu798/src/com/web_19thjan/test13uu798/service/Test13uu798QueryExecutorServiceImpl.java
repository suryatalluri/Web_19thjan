/*Generated by WaveMaker Studio*/


package com.web_19thjan.test13uu798.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wavemaker.runtime.data.model.CustomQuery;
import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

@Service
public class Test13uu798QueryExecutorServiceImpl implements Test13uu798QueryExecutorService {
	private static final Logger LOGGER = LoggerFactory.getLogger(Test13uu798QueryExecutorServiceImpl.class);

	@Autowired
	@Qualifier("Test13uu798WMQueryExecutor")
	private WMQueryExecutor queryExecutor;


	@Transactional(value = "Test13uu798TransactionManager")
	@Override
	public Page<Object> executeWMCustomQuerySelect(CustomQuery query, Pageable pageable) {
	    return queryExecutor.executeCustomQuery(query, pageable);
	}

	@Transactional(value = "Test13uu798TransactionManager")
    @Override
    public int executeWMCustomQueryUpdate(CustomQuery query) {
        return queryExecutor.executeCustomQueryForUpdate(query);
    }
}

