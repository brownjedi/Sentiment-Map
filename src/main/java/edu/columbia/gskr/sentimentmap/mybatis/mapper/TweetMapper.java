package edu.columbia.gskr.sentimentmap.mybatis.mapper;

import edu.columbia.gskr.sentimentmap.domain.TweetSentiment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by saikarthikreddyginni on 2/27/15.
 */

public interface TweetMapper {

    public int getTweetCount();

    public TweetSentiment getTweetById(long id);

    public List<TweetSentiment> getAllTweets();

    public List<TweetSentiment> getTweetsLimit(int limit);

    public List<TweetSentiment> getTweetsByHashTag(@Param("hashTags") List<String> hashTags);

    public List<String> getAllHashTags();

    public List<String> getHashTagsLimit(int limit);

}