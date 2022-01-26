package test.dept.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import test.dept.dto.DeptDto;
import test.util.DBConnect;

public class DeptDao {
	
	public List<DeptDto> selectAll(){
		List<DeptDto> list=new ArrayList<>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn=new DBConnect().getConn();
			String sql="select deptno,dname,loc"
					+ " from dept";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				DeptDto dto=new DeptDto();
				dto.setDeptNo(rs.getInt("deptno"));
				dto.setdName(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				list.add(dto);			
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
				
			}catch(Exception e) {}
		}
		
		return list;	
	}
	
	public DeptDto select(int deptNo) {
		DeptDto dto=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn=new DBConnect().getConn();
			String sql="SELECT name,loc FROM dept"
					+ " WHERE deptno=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, deptNo);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				dto=new DeptDto();
				dto.setDeptNo(deptNo);
				dto.setdName(rs.getString("name"));
				dto.setLoc(rs.getString("loc"));
			}		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		return dto;
	}
	
	public boolean insert(DeptDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		
		try {
			conn=new DBConnect().getConn();
			String sql="insert into dept"
					+ " (deptno,dname,loc)"
					+ " values(dept_seq.nextval,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getdName());
			pstmt.setString(2, dto.getLoc());
			flag=pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean update(DeptDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			String sql="UPDATE dept"
					+ " SET dname=?, loc=?"
					+ " WHERE deptno=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getdName());
			pstmt.setString(2, dto.getLoc());
			pstmt.setInt(3, dto.getDeptNo());
			flag=pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			return true;
		}else {
			return false;
		}	
	}
	public boolean delete(int deptno) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			String sql="delete from dept where deptno=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			flag=pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//마무리 작업
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}
}
