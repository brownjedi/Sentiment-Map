package edu.columbia.gskr.sentimentmap.websockets.decoder;

import com.owlike.genson.Genson;
import edu.columbia.gskr.sentimentmap.domain.TweetSentiment;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

/**
 * Created by saikarthikreddyginni on 3/14/15.
 */
public class TweetMessageDecoder implements Decoder.Text<TweetSentiment> {

    public TweetSentiment decode(String tweet) throws DecodeException {
        return new Genson().deserialize(tweet, TweetSentiment.class);
    }

    public boolean willDecode(String s) {
        return true;
    }

    public void init(EndpointConfig config) {

    }

    public void destroy() {

    }
}
