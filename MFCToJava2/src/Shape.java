
public abstract class Shape {
	int OrgX;
	int OrgY;
	int width;
	int high;
	int linewidth;
    int R1,R2,G1,G2,B1,B2;
	public Shape()
	{
		
	}
	public void Draw(/*CDC*pDC*/)
	{
		return;
	}
	boolean IsMatched(/*CPonit pnt*/)
	{
		return true;
	}
	public void Serialize(/*CArchive& ar*/)
	{
		
	}
	public static void main (String args[])
	{
		System.out.println(123);
	}
}
