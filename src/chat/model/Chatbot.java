package chat.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Base version of the 2015 Chatbot class. Only stub methods are provided. Students will complete methods as part
 * of the project.
 * @author Cody Henrichsen
 * @version 1.0 10/14/15
 * @param <Meme>
 */
public class Chatbot
{
	private List<String> memesList;
	private ArrayList<String> politicalTopicList;
	private ArrayList<String> HTMLList;
	private String userName;
	private String content;
	
	/**
	 * Creates an instance of the Chatbot with the supplied username.
	 * @param userName The username for the chatbot.
	 */
	public Chatbot(String userName)
	{		
		this.politicalTopicList = new ArrayList<String>();
		this.memesList = new ArrayList<String>();
		this.HTMLList = new ArrayList<String>();
		this.userName = userName;
		this.content = new String("Sample");
		this.buildMemesList();
		this.buildPoliticalTopicsList();
		this.buildHTMLList();
		
	}
	
	private void buildMemesList()
	{
		memesList.add("doge");
		memesList.add("pupper");
		memesList.add("cute animals");
		memesList.add("grumpy cat");
		memesList.add("dat boi");
		memesList.add("willy wonka");
		memesList.add("harambe");
		memesList.add("john cena");
		memesList.add("doggo");
		memesList.add("troll face");
		memesList.add("drake");
		memesList.add("ken bone");
		memesList.add("vaporwave");
		memesList.add("facepalm");
		memesList.add("furries");
		memesList.add("anime");
		memesList.add("pen pineapple apple pen");
		memesList.add("loss comic");
		memesList.add("slender man");
		memesList.add("pewdiepie");
		memesList.add("bad luck brian");
	}
	
	private void buildPoliticalTopicsList()
	{	
		politicalTopicList.add("Democrat");
		politicalTopicList.add("Republican");
		politicalTopicList.add("11/8/16");
		politicalTopicList.add("liberal");
		politicalTopicList.add("conservative");
		politicalTopicList.add("Clinton");
		politicalTopicList.add("Hillary");
		politicalTopicList.add("Trump");
		politicalTopicList.add("Kaine");
		politicalTopicList.add("Pence");
		politicalTopicList.add("Stein");
		politicalTopicList.add("Johnson");
		politicalTopicList.add("election");
		politicalTopicList.add("James Falls");
		politicalTopicList.add("Ken Bone");
		politicalTopicList.add("Jim Fell");
		politicalTopicList.add("Jimmy Fellen");
		politicalTopicList.add("Misty K Snow");
		politicalTopicList.add("Here come dat Garry Johnson");
		politicalTopicList.add("nukes");
		politicalTopicList.add("islamaphobia");
		politicalTopicList.add("foreign policy");
		politicalTopicList.add("United Nations");
		politicalTopicList.add("UN");
		politicalTopicList.add("America");
	}
	
	private void buildHTMLList()
	{
		HTMLList.add("<>");
		HTMLList.add("< >");
		HTMLList.add("<B> </B>");
		HTMLList.add("<B> ");
		HTMLList.add("<I> sdadas </i>");
		HTMLList.add("<P>");
		HTMLList.add("<A HREF=\"sdfs.html\"> </a>");
		HTMLList.add("<A HREF> </a>");
	}
	
	private void buildContent()
	{
		
	}
	
	/**
	 * Checks the length of the supplied string. Returns false if the supplied String is empty or null,
	 * otherwise returns true. 
	 * @param currentInput
	 * @return A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		
		if (currentInput != null && currentInput.length() > 0)
		{
			hasLength = true;
		}
		
		return hasLength;
	}
	
	/**
	 * Checks if the supplied String matches the content area for this Chatbot instance.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether it matches the content area.
	 */
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;
		
		String temp = "↷";
		System.out.println(temp + temp.toLowerCase());
		
		if (currentInput.toLowerCase().contains(content.toLowerCase()))
		{
			hasContent = true;
		}
		return hasContent;
	}
	
	/**
	 * Checks if supplied String matches ANY of the topics in the politicalTopicsList. Returns
	 * true if it does find a match and false if it does not match.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the String is contained in the ArrayList.
	 */
	public boolean politicalTopicChecker(String currentInput)
	{
		boolean hasTopic = false;
		
		for(int index = 0; index < politicalTopicList.size(); index++)
		{
			if(currentInput.equals(politicalTopicList.get(index)))
			{
				hasTopic = true;
			}
		}
		return hasTopic;
	}
		
	/**
	 * Checks to see that the supplied String value is in the current memesList variable.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean hasMeme = false;
		
		for(int index = 0; index < memesList.size(); index++)
		{
			if(currentInput.equals(memesList.get(index)))
			{
				hasMeme = true;
			}
		}
		return hasMeme;
	}
	
	public boolean inputHTMLChecker(String currentInput)
	{
		boolean hasHTML = false;
		
		for(int index = 0; index < HTMLList.size(); index++)
		{
			if(currentInput.equals(HTMLList.get(index)))
			{
				hasHTML = true;
			}
		}
		return hasHTML;
	}

	
	/**
	 * Returns the username of this Chatbot instance.
	 * @return The username of the Chatbot.
	 */
	public String getUserName()
	{
		return userName;
	}
	
	/**
	 * Returns the content area for this Chatbot instance.
	 * @return The content area for this Chatbot instance.
	 */
	public String getContent()
	{
	return content;
	}
	
	/**
	 * Getter method for the memesList object.
	 * @return The reference to the meme list.
	 */
	public List<String> getMemesList()
	{
		return memesList;
	}
	
	/**
	 * Getter method for the politicalTopicList object.
	 * @return The reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList()
	{
		return politicalTopicList;
	}
	
	/**
	 * Updates the content area for this Chatbot instance.
	 * @param content The updated value for the content area.
	 */
	public void setContent(String content)
	{
		this.content = content;
	}

}
