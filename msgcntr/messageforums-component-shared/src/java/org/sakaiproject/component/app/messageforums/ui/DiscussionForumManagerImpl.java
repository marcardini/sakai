package org.sakaiproject.component.app.messageforums.ui;

import java.util.List;

import org.sakaiproject.api.app.messageforums.Area;
import org.sakaiproject.api.app.messageforums.AreaManager;
import org.sakaiproject.api.app.messageforums.DiscussionForum;
import org.sakaiproject.api.app.messageforums.DiscussionTopic;
import org.sakaiproject.api.app.messageforums.DummyDataHelperApi;
import org.sakaiproject.api.app.messageforums.Message;
import org.sakaiproject.api.app.messageforums.Topic;
import org.sakaiproject.api.app.messageforums.ui.DiscussionForumManager;
import org.sakaiproject.component.app.messageforums.MessageForumsMessageManager;
import org.springframework.orm.hibernate.support.HibernateDaoSupport;

public class DiscussionForumManagerImpl extends HibernateDaoSupport implements
    DiscussionForumManager
{

  private AreaManager areaManager;
  private MessageForumsMessageManager messageManager;
  private DummyDataHelperApi helper;
  private boolean usingHelper = true; // just a flag until moved to database from helper

  public void init()
  {
    ;
  }

  // start injection
  /**
   * @param helper
   */
  public void setHelper(DummyDataHelperApi helper)
  {
    this.helper = helper;
  }

  /**
   * @return
   */
  public AreaManager getAreaManager()
  {
    return areaManager;
  }

  /**
   * @param areaManager
   */
  public void setAreaManager(AreaManager areaManager)
  {
    this.areaManager = areaManager;
  }

  /**
   * @return
   */
  public MessageForumsMessageManager getMessageManager()
  {
    return messageManager;
  }

  /**
   * @param messageManager
   */
  public void setMessageManager(MessageForumsMessageManager messageManager)
  {
    this.messageManager = messageManager;
  }

  // end injection

  /*
   * (non-Javadoc)
   * 
   * @see org.sakaiproject.api.app.messageforums.ui.DiscussionForumManager#getDiscussionForumArea()
   */
  public Area getDiscussionForumArea()
  {
    if (usingHelper)
    {
      return helper.getDiscussionForumArea();
    }
    // TODO: Implement Me!
    throw new UnsupportedOperationException();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.sakaiproject.api.app.messageforums.ui.DiscussionForumManager#getMessageById(java.lang.String)
   */
  public Message getMessageById(String id)
  {
    return messageManager.getMessageById(id);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.sakaiproject.api.app.messageforums.ui.DiscussionForumManager#saveMessage(org.sakaiproject.api.app.messageforums.Message)
   */
  public void saveMessage(Message message)
  {
    messageManager.saveMessage(message);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.sakaiproject.api.app.messageforums.ui.DiscussionForumManager#deleteMessage(org.sakaiproject.api.app.messageforums.Message)
   */
  public void deleteMessage(Message message)
  {
    messageManager.deleteMessage(message);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.sakaiproject.api.app.messageforums.ui.DiscussionForumManager#getTotalNoMessages(org.sakaiproject.api.app.messageforums.Topic)
   */
  public int getTotalNoMessages(Topic topic)
  {
    // TODO: Implement
    return 20;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.sakaiproject.api.app.messageforums.ui.DiscussionForumManager#getUnreadNoMessages(org.sakaiproject.api.app.messageforums.Topic)
   */
  public int getUnreadNoMessages(Topic topic)
  {
    // TODO: Implement
    return 10;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.sakaiproject.api.app.messageforums.ui.DiscussionForumManager#getDiscussionForums()
   */
  public List getDiscussionForums()
  {
    if (usingHelper)
    {
      return helper.getDiscussionForumArea().getDiscussionForums();
    }
    // TODO: Implement Me!
    throw new UnsupportedOperationException();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.sakaiproject.api.app.messageforums.ui.DiscussionForumManager#getForumById(java.lang.String)
   */
  public DiscussionForum getForumById(String forumId)
  {
    if (usingHelper)
    {
      return helper.getForumById(forumId);
    }
    // TODO: Implement Me!
    throw new UnsupportedOperationException();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.sakaiproject.api.app.messageforums.ui.DiscussionForumManager#getMessagesByTopicId(java.lang.String)
   */
  public List getMessagesByTopicId(String topicId)
  {
    if (usingHelper)
    {
      return helper.getMessagesByTopicId(topicId);
    }
    // TODO: Implement Me!
    throw new UnsupportedOperationException();
  }

  /* (non-Javadoc)
   * @see org.sakaiproject.api.app.messageforums.ui.DiscussionForumManager#getTopicById(java.lang.String)
   */
  public DiscussionTopic getTopicById(String topicId)
  {
    if (usingHelper)
    {
      return helper.getTopicById(topicId);
    }
    // TODO: Implement Me!
    throw new UnsupportedOperationException();
  }

  /* (non-Javadoc)
   * @see org.sakaiproject.api.app.messageforums.ui.DiscussionForumManager#hasNextTopic(org.sakaiproject.api.app.messageforums.DiscussionTopic)
   */
  public boolean hasNextTopic(DiscussionTopic topic)
  {
    if (usingHelper)
    {
      return helper.hasNextTopic(topic);
    }
    // TODO: Implement Me!
    throw new UnsupportedOperationException();
  }

  /* (non-Javadoc)
   * @see org.sakaiproject.api.app.messageforums.ui.DiscussionForumManager#hasPreviousTopic(org.sakaiproject.api.app.messageforums.DiscussionTopic)
   */
  public boolean hasPreviousTopic(DiscussionTopic topic)
  {
    if (usingHelper)
    {
      return helper.hasPreviousTopic(topic);
    }
    // TODO: Implement Me!
    throw new UnsupportedOperationException();
  }

  /* (non-Javadoc)
   * @see org.sakaiproject.api.app.messageforums.ui.DiscussionForumManager#getNextTopic(org.sakaiproject.api.app.messageforums.DiscussionTopic)
   */
  public DiscussionTopic getNextTopic(DiscussionTopic topic)
  {
    if (usingHelper)
    {
      if (hasNextTopic(topic))
      {
        return helper.getNextTopic(topic);
      }
      else
      {
        return null;
      }
    }
    // TODO: Implement Me!
    throw new UnsupportedOperationException();
  }

  /* (non-Javadoc)
   * @see org.sakaiproject.api.app.messageforums.ui.DiscussionForumManager#getPreviousTopic(org.sakaiproject.api.app.messageforums.DiscussionTopic)
   */
  public DiscussionTopic getPreviousTopic(DiscussionTopic topic)
  {
    if (usingHelper)
    {
      if (hasPreviousTopic(topic))
      {
        return helper.getPreviousTopic(topic);
      }
      else
      {
        return null;
      }
     
    }
    // TODO: Implement Me!
    throw new UnsupportedOperationException();
  }

}
