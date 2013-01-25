package org.yhb.dao.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.yhb.dao.IFileTableDAO;
import org.yhb.util.BasicSqlSupport;
import org.yhb.vo.FileTable;

public class IFileTableDAOImpl extends BasicSqlSupport implements IFileTableDAO {
	public boolean doDelete(int id) {
		boolean flag=false;
		int count=this.session.delete("org.yhb.dao.mapper.File.doDelete",id);
		if(count>0){
			flag=true;
		}
		return flag;
	}

	public boolean doInsert(FileTable file) {
		boolean flag=false;
		int count=this.session.insert("org.yhb.dao.mapper.File.doInsert",file);
		if(count>0){
			flag=true;
		}
		return flag;
	}

	public boolean doUpdate(FileTable file) {
		boolean flag=false;
		int count=this.session.update("org.yhb.dao.mapper.File.doUpdate",file);
		if(count>0){
			flag=true;
		}
		return flag;
	}

	@SuppressWarnings("unchecked")
	public List<FileTable> getAllFiles(int currentPage, int pageSize) {
		List<FileTable> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.File.getAllFiles",null,new RowBounds((currentPage-1)*pageSize,pageSize));
		return res;
	}

	@SuppressWarnings("unchecked")
	public List<FileTable> getFilesByRole(int currentPage, int pageSize,
			int roleId) {
		List<FileTable> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.File.getFilesByRole",roleId,new RowBounds((currentPage-1)*pageSize,pageSize));
		return res;
	}

	public int getAllFilesCount() {
		// TODO Auto-generated method stub
		int count=0;
		count=(Integer)this.session.selectOne("org.yhb.dao.mapper.File.getAllFilesCount");
		return count;
	}

	public int getFilesCountByRole(int role) {
		// TODO Auto-generated method stub
		int count=0;
		count=(Integer)this.session.selectOne("org.yhb.dao.mapper.File.getFilesCountByRole",role);
		return count;
	}

	@SuppressWarnings("unchecked")
	public FileTable getFileByFileName(String fileName) {
		List<FileTable> res=this.session.selectList("org.yhb.dao.mapper.File.getFileByFileName",fileName);
		if(res!=null && res.size()>0){
			return res.get(0);
		}else{
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public FileTable getFileByFileId(int id) {
		List<FileTable> res=this.session.selectList("org.yhb.dao.mapper.File.getFileByFileId",id);
		if(res!=null && res.size()>0){
			return res.get(0);
		}else{
			return null;
		}
	}
	
}
