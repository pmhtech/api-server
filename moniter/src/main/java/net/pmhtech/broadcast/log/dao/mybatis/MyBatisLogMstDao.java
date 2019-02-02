package net.pmhtech.broadcast.log.dao.mybatis;

import com.farota.mybatis.mapper.FarotaMyBatisMapper;

import net.pmhtech.broadcast.log.domain.LogMst;

@FarotaMyBatisMapper
public interface MyBatisLogMstDao {
	public int insert(LogMst logMst);
}
