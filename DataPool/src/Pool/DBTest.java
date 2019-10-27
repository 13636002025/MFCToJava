package Pool;

import java.sql.Connection;


public class DBTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub		
		long start,end;
		
		start=System.currentTimeMillis();
		for(int i=0;i<5000;i++)
		{
			Connection cons3=MySqlDAO.getConnection();
			//System.out.println(i);
			cons3.close();
		}
		end=System.currentTimeMillis();
		System.out.println("直接连接数据库5000次耗时 "+(end-start)+"ms");
		
	
		start=System.currentTimeMillis();
		for(int i=0;i<5000;i++)
		{
			ConPool c=ConPool.getInstance();
			MyCon mycon=c.getCon();
			c.setFree(mycon);//释放	
		}
		end=System.currentTimeMillis();
		System.out.println("数据库连接池连接数据库5000次耗时 "+(end-start)+"ms");
		
							
	}

}