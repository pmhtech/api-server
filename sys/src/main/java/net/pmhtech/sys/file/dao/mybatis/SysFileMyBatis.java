package net.pmhtech.sys.file.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.pmhtech.sys.file.dao.SysFileDAO;
import net.pmhtech.sys.file.domain.SysFile;

@Repository
public class SysFileMyBatis implements SysFileDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int insert(SysFile sysFile) throws Exception {
		return sqlSession.insert("SysFile.insert", sysFile);
	}

	public int update(SysFile sysFile) throws Exception {
		return sqlSession.update("SysFile.update", sysFile);
	}

	public int delete(Map<String, Object> paramMap) throws Exception {
		return sqlSession.delete("SysFile.delete", paramMap);
	}

	public List<Map<String, ?>> selectList(Map<String, ?> paramMap) throws Exception {
		return sqlSession.selectList("SysFile.selectList", paramMap);
	}
}
