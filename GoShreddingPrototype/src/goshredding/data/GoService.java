/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goshredding.data;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author SXR
 */
public class GoService extends SqliteHelper {

    private static String DB_NAME = "huwei_demo.db";

    public GoService(String dbFilePath) throws ClassNotFoundException, SQLException {
        super(dbFilePath);
    }
    public static GoService getInstance(){
        GoService goService=null;
        try{
            goService=new GoService(DB_NAME);
        }catch(Exception e){
            e.printStackTrace();
        }
        return goService ;
    }
    public List<EventVO> getAllEvent() {
        List<EventVO> rsList = new ArrayList<EventVO>();
        try {
            resultSet = getStatement().executeQuery("select * from event_table");
            while (resultSet.next()) {
                EventVO event=new EventVO();
                event.eventId=resultSet.getString("event_id");
                event.eventName=resultSet.getString("event_name");
                rsList.add(event);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        finally {
            destroyed();
        }
        return rsList;
    }
}
