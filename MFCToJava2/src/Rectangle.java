
public class Rectangle extends Shape{
	public Rectangle()
	{
		/*OrgX = 400;//原点坐标
		OrgY = 400;
		linewidth= 1;//线宽
		width = 100;
		high=50;*/
		
	}
	public Rectangle(int x,int y,int w,int line,int r1,int g1,int b1,int r2,int b2,int g2)
	{
		/*OrgX = x;//原点坐标
		OrgY = y;
    	linewidth=line;
		width = w;
		high=h;
		R1=r1;
		R2=r2;
		G1=g1;
		G2=g2;
		B1=b1;
		B2=b2; */ 
		
	}
	public void Draw(/*CDC*pDC*/)//绘制
	{
		/*	CPen pen, *pOldPen;
		pen.CreatePen(PS_SOLID, linewidth,RGB(R1,G1,B1));
		pOldPen = (CPen*)pDC->SelectObject(&pen);
		CBrush brush, *pOldBrush;
		brush.CreateHatchBrush(HS_DIAGCROSS, RGB(R2,G2,B2));
		pOldBrush = (CBrush*)pDC->SelectObject(&brush);
		pDC->Rectangle(OrgX - width / 2, OrgY - high / 2, OrgX + width / 2, OrgY +high / 2);
		pDC->SelectObject(pOldPen);
		pDC->SelectObject(pOldBrush);*/
		
	}
	boolean IsMatched(/*CPoint pnt*/)//重载点pnt是否落在图元内
	{
		return true;
	}
	public void Serialize(/*CArchive& ar */)//序列化正方形图元
	{
		/*if (ar.IsStoring())
	{
		ar <<OrgX<< OrgY;//原点坐标
		ar <<width;
		ar <<high;
		ar<< linewidth;//线宽

	}
	else
	{
		ar >> OrgX >>OrgY;//原点坐标
		ar >>width;
		ar >>high;
		ar >> linewidth;//线宽
	}*/
	}


}
