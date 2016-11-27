package net.pmhtech.sys.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import net.pmhtech.configure.SysMyBatisDAO;
import net.pmhtech.sys.dao.SysCodeDAO;
import net.pmhtech.sys.dao.SysCodeGroupDAO;
import net.pmhtech.sys.domain.SysCode;
import net.pmhtech.sys.domain.SysCodeGroup;


@Repository("sysCodeGroupDAO")
public class SysCodeGroupMyBatis extends SysMyBatisDAO implements SysCodeGroupDAO{

	@Override
	public int insert(SysCodeGroup sysCode) throws Exception {
		return this.getSqlSession().update("SysCodeGroup.insert",sysCode);
	}

	@Override
	public int update(SysCodeGroup sysCode) throws Exception {
		return this.getSqlSession().update("SysCodeGroup.update",sysCode);
	}

	@Override
	public List<Map<String, ?>> select(Map<String, ?> paramMap) throws Exception { 
		return this.getSqlSession().selectList("SysCodeGroup.select",paramMap);
	}


}
