package org.distrib.emulator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Comparator;

import org.distrib.key.Key;
import org.distrib.server.*;

public class NodeComparator implements Comparator<EventualServer>{
	
	private MessageDigest md = null;
	
	public NodeComparator(){
	}
	
	
	@Override
	public int compare(EventualServer s1, EventualServer s2){
		//return compareKeys(s1.myId, s2.myId);
		return Key.compare(s1.myId, s2.myId);
	}
}
