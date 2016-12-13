package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatbotController;
import java.awt.Dimension;

public class ChatFrame extends JFrame
{
	private ChatbotController baseController;
	private ChatPanel chatPanel;
	
	public ChatFrame(ChatbotController baseController)
	{
		super();
		this.baseController = baseController;
		this.chatPanel = new ChatPanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(chatPanel);
		this.setTitle("CHATBOT");
		this.setSize(new Dimension(600,400));
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public ChatPanel getChatPanel()
	{
		return this.chatPanel;
	}
}