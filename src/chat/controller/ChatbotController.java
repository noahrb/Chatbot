package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatFrame;
import chat.view.ChatViewer;

public class ChatbotController
{
	private Chatbot stupidBot;
	private ChatViewer chatView;
	private ChatFrame chatFrame;
	
	public ChatbotController()
	{
		stupidBot = new Chatbot("Boaty McBoatFace");
		chatView = new ChatViewer();
	    chatFrame = new ChatFrame(this);
	}
	
	public void start()
	{
		chatFrame.getChatPanel().showMessage(stupidBot.getUserName() + " says: Welcome!");
	}
	
	public String useChatbotCheckers(String input)
	{
		String answer = "";
		
		if(!stupidBot.quitChecker(input))
		{
			if(stupidBot.contentChecker(input))
			{
				answer += "\nYou know my special secret\n";
			}		
			if(stupidBot.memeChecker(input))
			{
				answer += "\nI can has memes?\n";
			}
			if(stupidBot.politicalTopicChecker(input))
			{
				answer += "\nI love politics!\n";
			}
			if(stupidBot.inputHTMLChecker(input))
			{
				answer += "\nHTML IS LAMMMEEEEE\n";
			}
			if(input.length() == 0)
			{
				answer += "Sorry, I don't know about " + input;
			}
			
			if(!stupidBot.lengthChecker(answer))
			{
				answer += "Sorry, I don't know about " + input;
			}
			
			int canBeRandom = (int) (Math.random() * 7);
			if (canBeRandom % 7 == 0)
			{
					//answer += randomTopicGenerator();
			}	
	}
		else
		{
			chatView.displayMessage("Thanks for chatting with meeeee");
			System.exit(0);
		}	
	return answer;
	}
	
	public ChatFrame getBaseFrame() 
	{
		return chatFrame;
	}
	
	public Chatbot getChatbot() 
	{
		return this.stupidBot;
	}
}
