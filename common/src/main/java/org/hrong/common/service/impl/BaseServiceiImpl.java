package org.hrong.common.service.impl;

import org.hrong.common.repository.BaseRepository;
import org.hrong.common.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class BaseServiceiImpl<T,ID extends Serializable> implements IBaseService {

//	@Autowired
//	private BaseRepository<T,ID> baseRepository;
//
//	public <T> T save(T data) {
//		T res = baseRepository.save();
//	}
}
