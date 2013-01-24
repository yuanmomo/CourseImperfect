package org.yhb.dao.service;

import java.util.List;

import org.yhb.dao.IFileTableDAO;
import org.yhb.dao.impl.IFileTableDAOImpl;
import org.yhb.vo.FileTable;

public class IFileTableDAOService {
	private IFileTableDAOImpl dao;

	public void setDao(IFileTableDAOImpl dao) {
		this.dao = dao;
	}

	public boolean doDelete(int id) {
		// TODO Auto-generated method stub
		return this.dao.doDelete(id);
	}

	public boolean doInsert(FileTable file) {
		// TODO Auto-generated method stub
		return this.dao.doInsert(file);
	}

	public boolean doUpdate(FileTable file) {
		// TODO Auto-generated method stub
		return this.dao.doUpdate(file);
	}

	public List<FileTable> getAllFiles(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return this.dao.getAllFiles(currentPage, pageSize);
	}

	public List<FileTable> getFilesByRole(int currentPage, int pageSize,
			int role) {
		// TODO Auto-generated method stub
		return this.dao.getFilesByRole(currentPage, pageSize, role);
	}

	public int getAllFilesCount() {
		// TODO Auto-generated method stub
		return this.dao.getAllFilesCount();
	}

	public int getFilesCountByRole(int role) {
		// TODO Auto-generated method stub
		return this.dao.getFilesCountByRole(role);
	}

	public FileTable getFileByFileName(String fileName) {
		// TODO Auto-generated method stub
		return this.dao.getFileByFileName(fileName);
	}

	public FileTable getFileByFileId(int id) {
		// TODO Auto-generated method stub
		return this.dao.getFileByFileId(id);
	}

}
