package net.pmhtech.sys.seq.service;

import net.pmhtech.sys.file.domain.SysFile;
import net.pmhtech.sys.role.domain.SysRole;

public interface SysSequenceService {
	String getSequence(SysFile sysFile) throws Exception;
	String getSequence(SysRole sysRole) throws Exception;

}
