package net.pmhtech.sys.seq.service;

import net.pmhtech.sys.file.domain.SysFile;

public interface SysSequenceService {
	String getSequence(SysFile sysFile) throws Exception;

}
