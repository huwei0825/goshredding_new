/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goshredding.service;

import goshredding.data.EventVO;
import goshredding.vo.UserVO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author SXR
 */
public class GoService extends SqliteHelper {

    private static String DB_NAME = "huwei_demo.db";

    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

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
                event.eventId = resultSet.getString("event_id");
                event.eventName = resultSet.getString("event_name");
                rsList.add(event);
            }
        } finally {
            this.destroyed();
        }
        return rsList;
    }

    public ArrayList<EventVO> getEventByUserId(String userId) throws Exception {
        ArrayList<EventVO> rsList = new ArrayList<EventVO>();
        return rsList;
    }

    public void insertEvent(EventVO eventVO) throws Exception {
        String UUID = this.getUUID();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("event_id", UUID);
        map.put("event_name", eventVO.eventName);
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

    public ArrayList<UserVO> getUserAll() throws Exception {
        ArrayList<UserVO> rsList = new ArrayList<UserVO>();
        return rsList;
    }

    public void insertUser(UserVO userVO) throws Exception {

    }

    public void updateUser(UserVO userVO) throws Exception {

    }

    public void deleteUser(UserVO userVO) throws Exception {

    }
}
