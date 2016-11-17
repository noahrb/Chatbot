package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatbotController;
import java.awt.Dimension;

public class ChatFrame extends JFrame
{
	private ChatbotController baseController;
	private ChatPanel basePanel;
	
	public ChatFrame(ChatbotController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new ChatPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("CHATBOT");
		this.setSize(new Dimension(600,400));
		this.setResizable(false);
		this.setVisible(true);
	}
}