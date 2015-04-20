package edu.columbia.gskr.sentimentmap.websockets.globalvariables;

import javax.websocket.Session;
import java.util.HashSet;

/**
 * Created by saikarthikreddyginni on 4/20/15.
 */
public class GlobalVariables {
    public static final HashSet<Session> sessions = new HashSet<Session>();
}
