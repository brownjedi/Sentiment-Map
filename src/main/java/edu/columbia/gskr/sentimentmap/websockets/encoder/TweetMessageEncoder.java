package edu.columbia.gskr.sentimentmap.websockets.encoder;

import com.owlike.genson.Genson;
import edu.columbia.gskr.sentimentmap.domain.TweetSentiment;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

/**
 * Created by saikarthikreddyginni on 3/14/15.
 */
public class TweetMessageEncoder implements Encoder.Text<TweetSentiment> {

    public String encode(final TweetSentiment tweet) throws EncodeException {
        return new Genson().serialize(tweet);
    }

    public void init(EndpointConfig config) {

    }

    public void destroy() {

    }
}
