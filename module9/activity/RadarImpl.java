package sef.module9.activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Implementation of a Radar 
 * 
 *
 */
public class RadarImpl implements Radar{

	List<RadarContact> contacts;
	
	/**
	 *  Constructs a new Radar 
	 */
	public RadarImpl(){
		contacts = new ArrayList();
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#addContact(sef.module8.activity.RadarContact)
	 */
	public RadarContact addContact(RadarContact contact) {
		if(contact!=null)
		{
			for (RadarContact c:contacts) {
				if(c.getContactID()==contact.getContactID())
				{
					c.setDistance(contact.getDistance());
					c.setBearing(contact.getBearing());
					return  c;
				}
			}
			contacts.add(contact);
			return contact;
		}
		else {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#getContact(java.lang.String)
	 */
	public RadarContact getContact(String id) {
		for (RadarContact c: contacts){
			if(c.getContactID()==id)
			{
				return c;
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#getContactCount()
	 */
	public int getContactCount() {
		return contacts.size();
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#removeContact(java.lang.String)
	 */
	public RadarContact removeContact(String id) {
		for (RadarContact c:contacts) {
			if(c.getContactID()==id)
			{
				RadarContact tempContact = c;
				contacts.remove(c);
				return tempContact;
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#returnContacts()
	 */
	public List<RadarContact> returnContacts() {
		return contacts;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.Radar#returnContacts(java.util.Comparator)
	 */
	public List<RadarContact> returnContacts(Comparator<RadarContact> comparator) {
		//return contacts;
		return Collections.sort(contacts, new DistanceComparator());
	}
}
