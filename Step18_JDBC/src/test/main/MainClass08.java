package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.member.dto.MemberDto;
import test.util.DBConnect;

/*
 *  member 테이블에 있는 회원 목록을 SELECT 하고  
 *  num 에 대해서 오름차순 정렬을 해서
 *  List<MemberDto> 형태로 만들어 보세요.
 */
public class MainClass08 {
	public static void main(String[] args) {
		List<MemberDto> list=new ArrayList<>();
		
	//필요한 객체를 담을 지역변수 미리 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn=new DBConnect().getConn();
			String sql = "select num, name, addr"
					+ " from member"
					+ " order by num asc";
		pstmt=conn.prepareStatement(sql);
		//select 문 수행하고 결과를 resultSet 객체에 담기
		rs=pstmt.executeQuery();
		//반복문 돌면서 ResultSet에 담긴 내용 추출
		while(rs.next()) {
			int num=rs.getInt("num");
			String name=rs.getString("name");
			String addr=rs.getString("addr");
			
			MemberDto dto=new MemberDto();
			dto.setNum(num);
			dto.setName(name);
			dto.setAddr(addr);
			//MemberDto 객체의 참조값을 ArrayList 객체에 누적시키기
			list.add(dto);
		}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		
		}
	}
}





