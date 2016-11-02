package net.pmhtech.sys.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import net.pmhtech.configure.SysMyBatisDAO;
import net.pmhtech.sys.dao.SysCodeDAO;
import net.pmhtech.sys.domain.SysCode;


@Repository("sysCodeDAO")
public class SysCodeMyBatis extends SysMyBatisDAO implements SysCodeDAO{

	@Override
	public int insert(SysCode sysCode) throws Exception {
		return this.getSqlSession().update("SysCode.insert",sysCode);
	}

	@Override
	public int update(SysCode sysCode) throws Exception {
		return this.getSqlSession().update("SysCode.update",sysCode);
	}

	@Override
	public int delete(Map<String, ?> paramMap) throws Exception {
		return this.getSqlSession().delete("SysCode.delete",paramMap);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception { 
		return this.getSqlSession().selectList("SysCode.selectList",paramMap);
	}

	@Override
	public List<Map<String, ?>> selectGroupList(Map<String, ?> paramMap) throws Exception {
		return this.getSqlSession().selectList("SysCode.selectGroupList",paramMap);
	}


}
