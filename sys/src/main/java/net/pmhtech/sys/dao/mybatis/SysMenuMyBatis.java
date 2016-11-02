package net.pmhtech.sys.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import net.pmhtech.configure.SysMyBatisDAO;
import net.pmhtech.sys.dao.SysMenuDAO;
import net.pmhtech.sys.domain.SysMenu;


@Repository("sysMenuDAO")
public class SysMenuMyBatis extends SysMyBatisDAO implements SysMenuDAO{

	@Override
	public int insert(SysMenu sysMenu) throws Exception {
		return this.getSqlSession().update("SysMenu.insert",sysMenu);
	}

	@Override
	public int update(SysMenu sysMenu) throws Exception {
		return this.getSqlSession().update("SysMenu.update",sysMenu);
	}

	@Override
	public int delete(Map<String, ?> paramMap) throws Exception {
		return this.getSqlSession().delete("SysMenu.delete",paramMap);
	}

	@Override
	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception { 
		return this.getSqlSession().selectList("SysMenu.selectList",paramMap);
	}


}
