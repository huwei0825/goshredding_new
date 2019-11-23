/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goshredding.data;

import java.util.List;

/**
 *
 * @author SXR
 */
public class GoServiceDemo {

    public static void main(String args[]) {
        List<EventVO> eventList = GoService.getInstance().getAllEvent();
        for (EventVO eventObj : eventList) {
            System.out.println(eventObj.eventId);
            System.out.println(eventObj.eventName);

        }
    }
}
