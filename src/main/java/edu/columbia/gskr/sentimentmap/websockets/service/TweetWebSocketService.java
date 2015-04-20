package edu.columbia.gskr.sentimentmap.websockets.service;

import edu.columbia.gskr.sentimentmap.domain.TweetSentiment;
import edu.columbia.gskr.sentimentmap.websockets.encoder.TweetMessageEncoder;
import edu.columbia.gskr.sentimentmap.websockets.globalvariables.GlobalVariables;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by saikarthikreddyginni on 3/14/15.
 */

@ServerEndpoint(value = "/websockets", encoders = TweetMessageEncoder.class)
@SuppressWarnings("unused")
public class TweetWebSocketService {

    private static final Logger LOGGER = Logger.getLogger(TweetWebSocketService.class.getClass().getCanonicalName());

    @OnOpen
    public void onOpen(final Session session) {
        LOGGER.log(Level.INFO, session.getId() + " has opened a connection");
        GlobalVariables.sessions.add(session);

    }

    @OnMessage
    public void onMessage(final String message, final Session session) {
        // Do Nothing
    }

    @OnClose
    public void onClose(Session session) {
        LOGGER.log(Level.INFO, session.getId() + " has ended");
        GlobalVariables.sessions.remove(session);
    }

    @OnError
    public void onError(Throwable t, Session session) {
        LOGGER.log(Level.SEVERE, session.getId() + " Returned an Error (Probably force closed)...!!!", t);
        GlobalVariables.sessions.remove(session);
    }

}
