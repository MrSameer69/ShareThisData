import java.awt.*;
import java.awt.event.*;
class f1 extends Frame
{
	f1(String s)
	{
		super(s);
		setSize(300,200);
		setLayout(new FlowLayout());
		for(int i = 1; i <= 9 ; i++)
			add(new Button ("No "+ i));
			setVisible(true);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		}
		);
	}
}
class FlowLayoutEg
{
	public static void main(String args[])
	{
		f1 f = new f1("Flow Layout");
	}
}