public abstract class Shape1
{
abstract void draw();
}
class Rect extends Shape1
{
	void draw()
	{
		System.out.println("draw rectangle");
	}}
	class Circle extends Shape1
	{
		void draw()
		{
			System.out.println("draw circle");
		}
	}


