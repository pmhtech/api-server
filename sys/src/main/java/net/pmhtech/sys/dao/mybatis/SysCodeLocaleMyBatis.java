package net.pmhtech.sys.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import net.pmhtech.configure.SysMyBatisDAO;
import net.pmhtech.sys.dao.SysCodeDAO;
import net.pmhtech.sys.dao.SysCodeLocaleDAO;
import net.pmhtech.sys.domain.SysCode;
import net.pmhtech.sys.domain.SysCodeLocale;


@Repository("sysCodeLocaleDAO")
public class SysCodeLocaleMyBatis extends SysMyBatisDAO implements SysCodeLocaleDAO{

	@Override
	public int insert(SysCodeLocale sysCode) throws Exception {
		return this.getSqlSession().update("SysCodeLocale.insert",sysCode);
	}

	@Override
	public int update(SysCodeLocale sysCode) throws Exception {
		return this.getSqlSession().update("SysCodeLocale.update",sysCode);
	}

	@Override
	public List<Map<String, ?>> select(Map<String, ?> paramMap) throws Exception { 
		return this.getSqlSession().selectList("SysCodeLocale.select",paramMap);
	}
}
