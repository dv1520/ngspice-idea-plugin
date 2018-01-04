package org.ngs.idea.hlp;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

/**
 * Created by z on 18.11.17.
 */
public interface IdeaTestService extends Remote {
    Map<String, Object> autocomplete(String... filenames) throws RemoteException ;
}
