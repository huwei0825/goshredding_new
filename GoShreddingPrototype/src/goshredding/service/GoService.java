/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goshredding.service;

import goshredding.vo.EventVO;
import goshredding.vo.OrganizerVO;
import goshredding.vo.ParticipantVO;
import goshredding.vo.UserVO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author SXR
 */
public class GoService extends SqliteHelper {

    private static String DB_NAME = "GoshreddingDB.db";

    public GoService(String dbFilePath) throws ClassNotFoundException, SQLException {
        super(dbFilePath);
    }

    public static GoService getInstance() throws Exception {

        return new GoService(DB_NAME);
    }

    public ArrayList<EventVO> getEventAll() throws Exception {
        ArrayList<EventVO> rsList = new ArrayList<EventVO>();
        try {
            resultSet = this.getStatement().executeQuery("select * from event_table");
            while (resultSet.next()) {
                EventVO event = new EventVO();
                event.eventId = resultSet.getString("EventID");
                event.eventName = resultSet.getString("EventName");
                event.eventPicName = resultSet.getString("ImageName");
                event.eventTime = resultSet.getString("EventTime");
                event.eventDate = resultSet.getString("EventDate");
                event.eventType = resultSet.getString("EventType");
                event.eventTypePicName = resultSet.getString("EventTypeImageName");
                event.introduction = resultSet.getString("EventIntroduction");
                event.location = resultSet.getString("EventLocatoin");
                event.organizerId = resultSet.getString("OrganizerID");
                event.advertisementId = resultSet.getString("advertisementID");
                rsList.add(event);
            }
        } finally {
            this.destroyed();
        }
        return rsList;
    }

    public ArrayList<EventVO> getEventByUserId(String userId) throws Exception {
        ArrayList<EventVO> rsList = new ArrayList<EventVO>();
        try {
            resultSet = this.getStatement().executeQuery("select * from organizer_table");

        } finally {
            this.destroyed();
        }
        return rsList;
    }

    public void insertEvent(EventVO eventVO) throws Exception {
        String strNewId = getNextMaxID("event_table", "EventID");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("EventID", strNewId);
        map.put("OrganizerID", eventVO.organizerId);
        map.put("Location", eventVO.location);
        map.put("Date", eventVO.eventDate);
        map.put("Time", eventVO.eventTime);
        map.put("EventType", eventVO.eventType);
        map.put("EventName", eventVO.eventName);
        map.put("EventIntroduction", eventVO.introduction);
        map.put("AdvertisementID", eventVO.advertisementId);
        map.put("ImageName", eventVO.eventPicName);
        map.put("EventTypeImageName", eventVO.eventTypePicName);

        this.executeInsert("event_table", map);

    }

    public void updateEvent(EventVO eventVO) throws Exception {
        StringBuffer updSql = new StringBuffer();
        updSql.append("UPDATE ");
        updSql.append("event_table");
        updSql.append(" SET ");
        updSql.append(" event_name = '");
        updSql.append(eventVO.eventName);
        updSql.append("' WHERE event_id='");
        updSql.append(eventVO.eventId);
        updSql.append("'");

        this.executeUpdate(updSql.toString());

    }

    public void deleteEvent(EventVO eventVO) throws Exception {
        this.executeUpdate("delete from event_table where event_id='" + eventVO.eventId + "'");
    }

    public UserVO getUser(String userName, String userPassword) throws Exception {
        UserVO userVO = null;
        return userVO;
    }

    public ArrayList<OrganizerVO> getOrganizerAll() throws Exception {
        ArrayList<OrganizerVO> rsList = new ArrayList<OrganizerVO>();
        try {
            resultSet = this.getStatement().executeQuery("select * from organizer_table");
            while (resultSet.next()) {
                OrganizerVO organizer = new OrganizerVO();
                organizer.organizerId = resultSet.getInt("OrganizerID");
                organizer.username = resultSet.getString("Username");
                organizer.password = resultSet.getString("Password");
                organizer.forename = resultSet.getString("Forename");
                organizer.surname = resultSet.getString("Surname");
                organizer.dob = resultSet.getString("DOB");
                organizer.add1 = resultSet.getString("Address1");
                organizer.add2 = resultSet.getString("Address2");
                organizer.postcode = resultSet.getString("Postcode");
                organizer.num = resultSet.getString("ContactNumber");
                organizer.email = resultSet.getString("Email");
                organizer.income = resultSet.getString("Income");
                rsList.add(organizer);
            }
        } finally {
            this.destroyed();
        }
        return rsList;
    }

    public ArrayList<OrganizerVO> getOrganizerByUsername(String username) throws Exception {
        ArrayList<OrganizerVO> rsList = new ArrayList<OrganizerVO>();
        try {
            resultSet = this.getStatement().executeQuery("select * from organizer_table where Username = '" + username + "'");
            while (resultSet.next()) {
                OrganizerVO organizer = new OrganizerVO();
                organizer.organizerId = resultSet.getInt("OrganizerID");
                organizer.username = resultSet.getString("Username");
                organizer.password = resultSet.getString("Password");
                organizer.forename = resultSet.getString("Forename");
                organizer.surname = resultSet.getString("Surname");
                organizer.dob = resultSet.getString("DOB");
                organizer.add1 = resultSet.getString("Address1");
                organizer.add2 = resultSet.getString("Address2");
                organizer.postcode = resultSet.getString("Postcode");
                organizer.num = resultSet.getString("ContactNumber");
                organizer.email = resultSet.getString("Email");
                organizer.income = resultSet.getString("Income");
                rsList.add(organizer);
            }
        } 
        finally {
            this.destroyed();
        }
        return rsList;
    }

    public String getNextMaxID(String tableName, String primaryFieldName) throws Exception {
        String strMaxId = "0";

        try {
            resultSet = this.getStatement().executeQuery("select max(" + primaryFieldName + ") as maxid from " + tableName);
            while (resultSet.next()) {
                strMaxId = resultSet.getString("maxid");

            }
            if (strMaxId != null) {
                strMaxId = String.valueOf(Integer.parseInt(strMaxId) + 1);
            } else {
                strMaxId = "101";
            }
        } finally {
            this.destroyed();
        }
        return strMaxId;
    }

    public void insertOrganizer(OrganizerVO organizerVO) throws Exception {

        String strNewId = getNextMaxID("organizer_table", "OrganizerID");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("OrganizerID", strNewId);
        map.put("Username", organizerVO.username);
        map.put("Password", organizerVO.password);
        map.put("Forename", organizerVO.forename);
        map.put("Surname", organizerVO.surname);
        map.put("DOB", organizerVO.dob);
        map.put("Address1", organizerVO.add1);
        map.put("Address2", organizerVO.add2);
        map.put("Postcode", organizerVO.postcode);
        map.put("ContactNumber", organizerVO.num);
        map.put("Email", organizerVO.email);
        map.put("Income", organizerVO.income);
        this.executeInsert("organizer_table", map);
    }

    public void updateOrganizer(OrganizerVO organizerVO) throws Exception {
        StringBuffer updSql = new StringBuffer();
        updSql.append("UPDATE ");
        updSql.append("organizer_table");
        updSql.append(" SET ");
        updSql.append(" Username = '");
        updSql.append(organizerVO.username);
        updSql.append("',");
        updSql.append(" Password = '");
        updSql.append(organizerVO.password);
        updSql.append("',");
        updSql.append(" Forename = '");
        updSql.append(organizerVO.forename);
        updSql.append("',");
        updSql.append(" Surname = '");
        updSql.append(organizerVO.surname);
        updSql.append("',");
        updSql.append(" DOB = '");
        updSql.append(organizerVO.dob);
        updSql.append("',");
        updSql.append(" Address1 = '");
        updSql.append(organizerVO.add1);
        updSql.append("',");
        updSql.append(" Address2 = '");
        updSql.append(organizerVO.add2);
        updSql.append("',");
        updSql.append(" Postcode = '");
        updSql.append(organizerVO.postcode);
        updSql.append("',");
        updSql.append(" Contact number = '");
        updSql.append(organizerVO.num);
        updSql.append("',");
        updSql.append(" Email = '");
        updSql.append(organizerVO.email);
        updSql.append("',");
        updSql.append(" Income = '");
        updSql.append(organizerVO.income);
        updSql.append("' WHERE OrganizerID='");
        updSql.append(organizerVO.organizerId);
        updSql.append("'");

        this.executeUpdate(updSql.toString());
    }

    public void deleteOrganizer(OrganizerVO organizerVO) throws Exception {
        this.executeUpdate("delete from organizer_table where OrganizerID='" + organizerVO.organizerId + "'");
    }

    public void insertParticipant(ParticipantVO participantVO) throws Exception {

    }

    public void updateParticipant(ParticipantVO participantVO) throws Exception {

    }

    public void deleteParticipant(ParticipantVO participantVO) throws Exception {

    }
}
