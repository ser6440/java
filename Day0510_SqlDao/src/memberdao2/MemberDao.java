package memberdao2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import commons.Constant;

public class MemberDao implements IMemberDao{
	//연결 객체를 가지고 sql 전달해야 하니까
	//연결 객체는 메서드 호출 할때마다 ConnectionProvider로 부터 얻어 오겠습니다.
	private Connection connection;
	
	//insertMember(Member) : void
	
	//번호 정보를 기준으로 나머지 모든 정보를 수정
	//updateMember(Member) : void
	
	//번호를 기준으로 회원정보 테이블에서 삭제
	//deleteMember(int) :void
	
	//번호를 기준으로 회원 한명의 정보를 조회
	//selectOne(int) : Member
	
	//모든 회원 정보 조회
	//selectAll :List<Member>
	
	//DB프로그래밍 순서
	//드라이버 로딩-연결생성-구문객체생성 및 sql 작성-구문객체를 통한 sql 실행-결과처리
	
	public int insertMember(Member member) {
		//회원가입 처리를 위해서 int로 바꿈
		String sql = "insert into member values(" + " member_seq.nextval,?,?,?,?,sysdate)";
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			connection = ConnectionProvider.getConnection();
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getEmail());
			
			result = pstmt.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(pstmt != null)pstmt.close();
					if(connection != null)connection.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return result;
	}

	
	public void updateMember(Member member) {
		String sql = "update member"
				+ " set     id =?,"
				+ "         pw =?,"
				+ "       name =?,"
				+ "      email =?,"
				+ "    regDate =? "
				+ "  where num =? ";
		PreparedStatement pstmt = null;
		
		try {
			connection = ConnectionProvider.getConnection();
			pstmt = connection.prepareStatement(sql);
			
			//java.sql.Date
			//java.util.Date
			//sql Date가 util Date를 상속받아서 만든 클래스
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getEmail());
			pstmt.setDate(5, (java.sql.Date)member.getRegDate());
			pstmt.setInt(6, member.getNum());
			
			pstmt.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(pstmt != null)pstmt.close();
					if(connection != null)connection.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}

	
	public void deleteMember(int num) {
		String sql = "delete from member where num = ?";
		PreparedStatement pstmt = null;
		
		try {
			connection = ConnectionProvider.getConnection();
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			pstmt.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(pstmt != null)pstmt.close();
					if(connection != null)connection.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	
	public Member selectOne(int num) {
		String sql = "select * from member where num = ?";
		PreparedStatement pstmt = null;
		Member member = null;
		ResultSet rs = null;
		
		try {
			connection = ConnectionProvider.getConnection();
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setInt(1,num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
//				member = new Member();
//				member.setNum(rs.getInt("num"));
//				member.setId(rs.getString("id"));
//				member.setPw(rs.getString("pw"));
//				member.setName(rs.getString("name"));
//				member.setEmail(rs.getString("email"));
//				member.setRegDate(rs.getDate("regDate"));;
				
				 member = new Member();
	             member.setNum(rs.getInt(Constant.Member.NUM));
	             member.setId(rs.getString(Constant.Member.ID));
	             member.setPw(rs.getString(Constant.Member.PASS));
	             member.setName(rs.getString(Constant.Member.NAME));
	             member.setEmail(rs.getString(Constant.Member.EMAIL));
	             member.setRegDate(rs.getDate(Constant.Member.REG_DATE));

			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(pstmt != null) pstmt.close();
					if(connection != null) connection.close();
					if(rs != null) rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return member;
	}
	public Member selectOne(String id) {
		String sql = "select * from member where id = ?";
		PreparedStatement pstmt = null;
		Member member = null;
		ResultSet rs = null;
		
		try {
			connection = ConnectionProvider.getConnection();
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setString(1,id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member = new Member();
				member.setNum(rs.getInt("num"));
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				member.setEmail(rs.getString("email"));
				member.setRegDate(rs.getDate("regDate"));;
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(pstmt != null) pstmt.close();
					if(connection != null) connection.close();
					if(rs != null) rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return member;
	}


	public List<Member> selectAll() {
		String sql = "select * from member";
		PreparedStatement pstmt = null;
		Member member = null;
		List<Member> memberList = new ArrayList<Member>();
		ResultSet rs = null;
		
		try {
			connection = ConnectionProvider.getConnection();
			pstmt = connection.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member = new Member();
				member.setNum(rs.getInt("num"));
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				member.setEmail(rs.getString("email"));
				member.setRegDate(rs.getDate("regDate"));;
				
				
				
				memberList.add(member);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(pstmt != null) pstmt.close();
					if(connection != null) connection.close();
					if(rs != null) rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return memberList;
		
	}

}
