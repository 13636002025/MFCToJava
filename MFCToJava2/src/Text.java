
public class Text extends Shape{
	public Text()
	{
		/*OrgX = 400;//原点坐标
		OrgY = 400;*/
		
	}
	public Text(int x,int y,int w,int line,int r1,int g1,int b1,int r2,int b2,int g2)
	{
		/*OrgX = x;//原点坐标
		OrgY = y;
		R1=r1;
		G1=g1;
		B1=b1;
		angle=a; */ 
		
	}
	public void Draw(/*CDC*pDC*/)//绘制
	{
		/*	CFont * pNewFont=new CFont;
    	CFont * pOldFont;
		pNewFont->CreateFont(30,20,angle,0,
					      200,FALSE,1,FALSE,
     					  ANSI_CHARSET,OUT_DEFAULT_PRECIS,
						  CLIP_DEFAULT_PRECIS,DEFAULT_QUALITY,
						  DEFAULT_PITCH&FF_SWISS,
						  "Aerial");
		pOldFont=(CFont *)pDC->SelectObject(pNewFont);
		pDC->SetTextColor(RGB(R1,G1,B1));
    	pDC->TextOut(OrgX,OrgY,"Yangtze University!");*/
		
	}
	boolean IsMatched(/*CPoint pnt*/)//重载点pnt是否落在图元内
	{
		return true;
	}
	

}
