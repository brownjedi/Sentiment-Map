package edu.columbia.gskr.sentimentmap.mybatis.service;

import edu.columbia.gskr.sentimentmap.domain.TweetSentiment;
import edu.columbia.gskr.sentimentmap.mybatis.mapper.TweetMapper;
import edu.columbia.gskr.sentimentmap.mybatis.util.MyBatisConnectionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.TransactionIsolationLevel;

import java.util.List;

/**
 * Created by saikarthikreddyginni on 2/27/15.
 */

public class TweetService {

    public TweetSentiment getTweetById(long id) {

        SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession(TransactionIsolationLevel.READ_UNCOMMITTED);
        TweetSentiment tweet;
        try {
            TweetMapper tweetMapper = sqlSession.getMapper(TweetMapper.class);
            tweet = tweetMapper.getTweetById(id);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
        return tweet;
    }

    public List<TweetSentiment> getAllTweets() {
        SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession(TransactionIsolationLevel.READ_UNCOMMITTED);
        List<TweetSentiment> tweetList;
        try {
            TweetMapper tweetMapper = sqlSession.getMapper(TweetMapper.class);
            tweetList = tweetMapper.getAllTweets();
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
        return tweetList;
    }

    public List<TweetSentiment> getTweetsLimit(int limit) {
        SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession(TransactionIsolationLevel.READ_UNCOMMITTED);
        List<TweetSentiment> tweetList;
        try {
            TweetMapper tweetMapper = sqlSession.getMapper(TweetMapper.class);
            tweetList = tweetMapper.getTweetsLimit(limit);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
        return tweetList;
    }

    public List<TweetSentiment> getTweetsByHashTag(List<String> hashTags) {
        SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession(TransactionIsolationLevel.READ_UNCOMMITTED);
        List<TweetSentiment> tweetList;
        try {
            TweetMapper tweetMapper = sqlSession.getMapper(TweetMapper.class);
            tweetList = tweetMapper.getTweetsByHashTag(hashTags);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
        return tweetList;
    }

    public List<String> getAllHashTags() {
        SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession(TransactionIsolationLevel.READ_UNCOMMITTED);
        List<String> hashTagList;
        try {
            TweetMapper tweetMapper = sqlSession.getMapper(TweetMapper.class);
            hashTagList = tweetMapper.getAllHashTags();
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
        return hashTagList;
    }

    public List<String> getHashTagsLimit(int limit) {
        SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession(TransactionIsolationLevel.READ_UNCOMMITTED);
        List<String> hashTagList;
        try {
            TweetMapper tweetMapper = sqlSession.getMapper(TweetMapper.class);
            hashTagList = tweetMapper.getHashTagsLimit(limit);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
        return hashTagList;
    }

    public int getTweetCount() {
        SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession(TransactionIsolationLevel.READ_UNCOMMITTED);
        int count = 0;
        try {
            TweetMapper tweetMapper = sqlSession.getMapper(TweetMapper.class);
            count = tweetMapper.getTweetCount();
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
        return count;
    }
}

