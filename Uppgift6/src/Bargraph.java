import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;


public class Bargraph extends JComponent{
	
	int x = 60;
	int y = 0;
	int width = getWidth();
	int height = getHeight();
	private int women;
	private int men;
	private float total;

	
	public Bargraph(int women, int men){
		this.men = men;
		this.women = women;
		
	}

	
	public void updateValues(int women, int men){
		this.women = women;
		this.men = men;
		this.total = this.men + this.women;
		this.repaint();
		width = getWidth();
		height = getHeight();
	}
	
	@Override
	public void paintComponent(Graphics graph){
	
		
		if(women > 0){
			float procent = (women/total);
			float pixelValue = (int)(height*procent);
			int bar = (int) (height-pixelValue);
			graph.setColor(Color.red);
			graph.fillRect(50, bar, 100, (int) pixelValue);
			
		}else{
			
		}
		
		
		
		if(men > 0){
			float procent = (men/total);
			float pixelValue = (int)(height*procent);
			int bar = (int)(height-pixelValue);
			graph.setColor(Color.blue);
			graph.fillRect(50+100, bar, 100, (int)pixelValue);
			
		}else{
			
		}
		if (total > 0){
			
			total = (int) total;
			graph.setColor(Color.BLACK);
			graph.drawString("Antal sškande: " + total, 5, 10);
		}
	
		super.paintComponent(graph);
		
		
	}
	
}
