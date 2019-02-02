package net.pmhtech.broadcast.log.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.pmhtech.broadcast.log.dao.mybatis.MyBatisLogMstDao;
import net.pmhtech.broadcast.log.domain.LogMst;

@Service
public class LogMstDao implements MyBatisLogMstDao{

	@Autowired
	private MyBatisLogMstDao myBatisLogMstDao;
	
	public int insert(LogMst logMst) {
		return myBatisLogMstDao.insert(logMst);
	}
	
}
