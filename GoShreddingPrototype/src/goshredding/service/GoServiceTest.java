/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goshredding.service;

import goshredding.vo.EventVO;
import goshredding.vo.OrganizerVO;
import java.util.ArrayList;

/**
 *
 * @author SXR
 */
public class GoServiceTest {

    public static void main(String args[]) {
        try {
            ///------------demo1 query----------------
//            ArrayList<EventVO> eventList = GoService.getInstance().getEventAll();
//            for (EventVO eventObj : eventList) {
//                System.out.println(eventObj.eventId);
//                System.out.println(eventObj.eventName);
//
//            }

            ///-----------demo2 insert------------
//            EventVO eventVO = new EventVO();
//            eventVO.eventName = "2019 bike xxxxx";
//            GoService.getInstance().insertEvent(eventVO);
            //----------demo3  delete -----------------
//            EventVO eventVO = new EventVO();
//            eventVO.eventId = "asas";
//            GoService.getInstance().deleteEvent(eventVO);
            //----------demo4  update -----------------
//            EventVO eventVO = new EventVO();
//            eventVO.eventId = "fc9959ac-de48-46a0-9393-986ebd702db1";
//            eventVO.eventName="2020 bike xxxxx UPDATE";
//            GoService.getInstance().updateEvent(eventVO);
            
        } catch (Exception e) {

        }
        try {
            ///------------demo1 query----------------
            ArrayList<OrganizerVO> eventList = GoService.getInstance().getOrganizerAll();
            for (OrganizerVO organizerObj : eventList) {
                System.out.println(organizerObj.organizerId);
                System.out.println(organizerObj.username);
                System.out.println(organizerObj.forename);
                System.out.println(organizerObj.surname);
                System.out.println(organizerObj.password);
                System.out.println(organizerObj.dob);
                System.out.println(organizerObj.num);
                System.out.println(organizerObj.add1);
                System.out.println(organizerObj.add2);
                
            }
            OrganizerVO org=new OrganizerVO();
            org.add1="sdsds";
            org.username="sdsdsd";
            GoService.getInstance().insertOrganizer(org);
        } catch (Exception e) {
            e.printStackTrace();
    }
    }
}
