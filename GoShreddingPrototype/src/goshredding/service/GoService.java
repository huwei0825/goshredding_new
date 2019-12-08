/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goshredding.service;

import goshredding.data.Definition;
import goshredding.vo.EventVO;
import goshredding.vo.OrganizerVO;
import goshredding.vo.ParticipantVO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SXR
 */
public class GoService {

    private static String DB_NAME = "GoshreddingDB.db";
    public static String currentUserId = "";
    public static int USER_TYPE_ORGANIZER = 1;
    public static int USER_TYPE_PARTICIPANT = 2;
    public static int currentUserType = 0;

    public static GoService getInstance() throws Exception {
        return new GoService();
    }

    public ArrayList<EventVO> getEventAll() throws Exception {
        ArrayList<EventVO> rsList = new ArrayList<EventVO>();
        String lineRead;
        String[] temp;
        try {
            FileReader fr = new FileReader(Definition.EVENTFILE);
            BufferedReader br = new BufferedReader(fr);

            while ((lineRead = br.readLine()) != null) {
                temp = lineRead.split(",");
                EventVO event = new EventVO();
                event.eventId = temp[0];
                event.eventName = temp[6];
                event.eventPicName = temp[9];
                event.eventTime = temp[4];
                event.eventDate = temp[3];
                event.eventType = temp[5];
                event.introduction = temp[7].replace("#", ",");
                event.location = temp[2];
                event.organizerId = temp[1];
                event.advertisementId = temp[8];
                rsList.add(event);
            }
        } finally {
        }
        return rsList;
    }

    public ArrayList<ParticipantVO> getEventByParticipantId(String userId) throws Exception {
        ArrayList<ParticipantVO> rsList = new ArrayList<ParticipantVO>();
        try {

        } finally {

        }
        return rsList;
    }

    public ArrayList<EventVO> getEventByOrganizerId(String userId) throws Exception {
        ArrayList<EventVO> rsList = new ArrayList<EventVO>();
        String lineRead;
        String[] temp;
        try {
            FileReader fr = new FileReader(Definition.EVENTFILE);
            BufferedReader br = new BufferedReader(fr);

            while ((lineRead = br.readLine()) != null) {
                temp = lineRead.split(",");
                if (temp[1].equalsIgnoreCase(userId)) {
                    EventVO event = new EventVO();
                    event.eventId = temp[0];
                    event.eventName = temp[6];
                    event.eventPicName = temp[9];
                    event.eventTime = temp[4];
                    event.eventDate = temp[3];
                    event.eventType = temp[5];
                    event.introduction = temp[7].replace("#", ",");;
                    event.location = temp[2];
                    event.organizerId = temp[1];
                    event.advertisementId = temp[8];

                    rsList.add(event);
                }
            }

        } finally {

        }
        return rsList;
    }
    public ArrayList<EventVO> getEventsByOtherOrganizers(String currentUserId) throws Exception {
        ArrayList<EventVO> rsList = new ArrayList<EventVO>();
        String lineRead;
        String[] temp;
        try {
            FileReader fr = new FileReader(Definition.EVENTFILE);
            BufferedReader br = new BufferedReader(fr);

            while ((lineRead = br.readLine()) != null) {
                temp = lineRead.split(",");
                if(!temp[1].equalsIgnoreCase(currentUserId)){
                EventVO event = new EventVO();
                event.eventId = temp[0];
                event.eventName = temp[6];
                event.eventPicName = temp[9];
                event.eventTime = temp[4];
                event.eventDate = temp[3];
                event.eventType = temp[5];
                event.introduction = temp[7].replace("#", ",");;
                event.location = temp[2];
                event.organizerId = temp[1];
                event.advertisementId = temp[8];
                rsList.add(event);
                }
            }
        } finally {
        }
        return rsList;
    }
    public void AddEvent(EventVO eventVO) throws Exception {
        String id = String.valueOf(getNextMaxID(Definition.EVENTFILE));
        String introduction = eventVO.introduction.replace(",", "#");//in case that introduction is split by the "," when store the event informaiton into an array
        String record = id + "," + eventVO.organizerId + "," + eventVO.location + "," + eventVO.eventDate + "," + eventVO.eventTime + "," + eventVO.eventType + "," + eventVO.eventName
                + "," + introduction + "," + eventVO.advertisementId + "," + eventVO.eventPicName;

        try {
            FileWriter writer = new FileWriter(Definition.EVENTFILE, true);
            // write the string record to file plus end of line
            writer.write(record + System.getProperty("line.separator"));
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public void editEvent(EventVO eventVO) throws Exception {
        String introduction = eventVO.introduction.replace(",", "#");
        String record = eventVO.eventId + "," + eventVO.organizerId + "," + eventVO.location + "," + eventVO.eventDate + "," + eventVO.eventTime + "," + eventVO.eventType + "," + eventVO.eventName
                + "," + introduction + "," + eventVO.advertisementId + "," + eventVO.eventPicName;
        String[] temp;//array holds last line read
        String lineRead;
        try {
            //create a file reader object
            FileReader fr = new FileReader(Definition.EVENTFILE);
            FileWriter w = new FileWriter("new.txt", true);
            BufferedReader br = new BufferedReader(fr);
            //loop through file until EOF or we find it
            while ((lineRead = br.readLine()) != null) {

                temp = lineRead.split(",");
                //if search item found then...
                if (eventVO.eventId.equalsIgnoreCase(temp[0])) {

                    w.write(record + System.getProperty("line.separator"));
                } else {
                    w.write(lineRead + System.getProperty("line.separator"));
                }

            }
            fr.close();// close the file
            w.close();//close file
            br.close();
            File file = new File(Definition.EVENTFILE);
            file.delete();
            File newfile = new File("new.txt");
            newfile.renameTo(file);
            JOptionPane.showMessageDialog(null, "successful changed");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error saving with: " + ex);
        }
    }

    public void deleteEvent(EventVO eventVO) throws Exception {
        String[] temp;
        String lineRead;
        String eventId = eventVO.eventId;
        try {
            FileReader fr = new FileReader(Definition.EVENTFILE);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("new.txt", true);

            while ((lineRead = br.readLine()) != null) {
                temp = lineRead.split(",");
                if (!eventId.equalsIgnoreCase(temp[0])) {
                    fw.write(lineRead + System.getProperty("line.separator"));
                }
            }
            fr.close();
            br.close();
            fw.close();
            File f = new File(Definition.EVENTFILE);
            f.delete();
            File nf = new File("new.txt");
            nf.renameTo(f);

        } finally {

        }
    }

    public ArrayList<OrganizerVO> getOrganizerAll() throws Exception {
        ArrayList<OrganizerVO> rsList = new ArrayList<OrganizerVO>();
        String lineRead;
        String[] temp;
        try {
            FileReader fr = new FileReader(Definition.ORGANIZERFILE);
            BufferedReader br = new BufferedReader(fr);

            while ((lineRead = br.readLine()) != null) {
                temp = lineRead.split(",");
                OrganizerVO organizer = new OrganizerVO();
                organizer.organizerId = temp[0];
                organizer.username = temp[1];
                organizer.password = temp[2];
                organizer.forename = temp[3];
                organizer.surname = temp[4];
                organizer.dob = temp[5];
                organizer.add1 = temp[6];
                organizer.add2 = temp[7];
                organizer.postcode = temp[8];
                organizer.num = temp[9];
                organizer.email = temp[10];
                organizer.income = temp[11];
                rsList.add(organizer);
            }

        } finally {

        }
        return rsList;
    }

    public ArrayList<OrganizerVO> getOrganizerByUsername(String username) throws Exception {
        ArrayList<OrganizerVO> rsList = new ArrayList<OrganizerVO>();
        String lineRead;
        String[] temp;
        try {
            FileReader fr = new FileReader(Definition.ORGANIZERFILE);
            BufferedReader br = new BufferedReader(fr);

            while ((lineRead = br.readLine()) != null) {
                temp = lineRead.split(",");
                if (temp.length == 12) {
                    if (temp[1].equalsIgnoreCase(username)) {
                        OrganizerVO organizer = new OrganizerVO();
                        organizer.organizerId = temp[0];
                        organizer.username = temp[1];
                        organizer.password = temp[2];
                        organizer.forename = temp[3];
                        organizer.surname = temp[4];
                        organizer.dob = temp[5];
                        organizer.add1 = temp[6];
                        organizer.add2 = temp[7];
                        organizer.postcode = temp[8];
                        organizer.num = temp[9];
                        organizer.email = temp[10];
                        organizer.income = temp[11];
                        rsList.add(organizer);
                    }
                }
            }
        } finally {

        }
        return rsList;
    }

    public void addOrganizer(OrganizerVO organizerVO) throws Exception {
        String id = String.valueOf(getNextMaxID(Definition.ORGANIZERFILE));
        String record = id + "," + organizerVO.username + "," + organizerVO.password + "," + organizerVO.forename + "," + organizerVO.surname
                + "," + organizerVO.dob + "," + organizerVO.add1 + "," + organizerVO.add2 + "," + organizerVO.postcode + "," + organizerVO.num
                + "," + organizerVO.email + "," + organizerVO.income;
        try {
            FileWriter writer = new FileWriter(Definition.ORGANIZERFILE, true);
            // write the string record to file plus end of line
            writer.write(record + System.getProperty("line.separator"));
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public void editOrganizer(OrganizerVO organizerVO) throws Exception {
        String record = organizerVO.organizerId + "," + organizerVO.username + "," + organizerVO.password + "," + organizerVO.forename + "," + organizerVO.surname
                + "," + organizerVO.dob + "," + organizerVO.add1 + "," + organizerVO.add2 + "," + organizerVO.postcode + "," + organizerVO.num
                + "," + organizerVO.email + "," + organizerVO.income;
        String[] temp;//array holds last line read
        String lineRead;
        try {
            //create a file reader object
            FileReader fr = new FileReader(Definition.ORGANIZERFILE);
            FileWriter w = new FileWriter("new.txt", true);
            BufferedReader br = new BufferedReader(fr);
            //loop through file until EOF or we find it
            while ((lineRead = br.readLine()) != null) {

                temp = lineRead.split(",");
                //if search item found then...
                if (organizerVO.organizerId.equalsIgnoreCase(temp[0])) {

                    w.write(record + System.getProperty("line.separator"));
                } else {
                    w.write(lineRead + System.getProperty("line.separator"));
                }

            }
            fr.close();// close the file
            w.close();//close file
            br.close();
            File file = new File(Definition.ORGANIZERFILE);
            file.delete();
            File newfile = new File("new.txt");
            newfile.renameTo(file);
            JOptionPane.showMessageDialog(null, "successful changed");
        } finally {

        }

    }

    public void deleteOrganizer(OrganizerVO organizerVO) throws Exception {
        String[] temp;
        String lineRead;
        String organizerId = organizerVO.organizerId;
        try {
            FileReader fr = new FileReader(Definition.ORGANIZERFILE);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("new.txt", true);

            while ((lineRead = br.readLine()) != null) {
                temp = lineRead.split(",");
                if (!organizerId.equalsIgnoreCase(temp[0])) {
                    fw.write(lineRead + System.getProperty("line.separator"));
                }
            }
            fr.close();
            br.close();
            fw.close();
            File f = new File(Definition.ORGANIZERFILE);
            f.delete();
            File nf = new File("new.txt");
            nf.renameTo(f);

        } finally {

        }
    }

    public ArrayList<ParticipantVO> getParticipantByUsername(String username) throws Exception {
        ArrayList<ParticipantVO> rsList = new ArrayList<ParticipantVO>();
        String lineRead;
        String[] temp;
        try {
            FileReader fr = new FileReader(Definition.PARTICIPANTFILE);
            BufferedReader br = new BufferedReader(fr);

            while ((lineRead = br.readLine()) != null) {
                temp = lineRead.split(",");
                if (temp.length == 11) {
                    if (temp[1].equalsIgnoreCase(username)) {
                        ParticipantVO participant = new ParticipantVO();
                        participant.participantId = temp[0];
                        participant.username = temp[1];
                        participant.password = temp[2];
                        participant.forename = temp[3];
                        participant.surname = temp[4];
                        participant.dob = temp[5];
                        participant.add1 = temp[6];
                        participant.add2 = temp[7];
                        participant.postcode = temp[8];
                        participant.num = temp[9];
                        participant.email = temp[10];

                        rsList.add(participant);
                    }
                }
            }
        } finally {

        }
        return rsList;
    }

    public void addParticipant(ParticipantVO participantVO) throws Exception {
        String id = String.valueOf(getNextMaxID(Definition.PARTICIPANTFILE));
        String record = id + "," + participantVO.username + "," + participantVO.password + "," + participantVO.forename + "," + participantVO.surname
                + "," + participantVO.dob + "," + participantVO.add1 + "," + participantVO.add2 + "," + participantVO.postcode + "," + participantVO.num
                + "," + participantVO.email;
        try {
            FileWriter writer = new FileWriter(Definition.PARTICIPANTFILE, true);
            // write the string record to file plus end of line
            writer.write(record + System.getProperty("line.separator"));
            writer.close();
        } finally {

        }
    }

    public void updateParticipant(ParticipantVO participantVO) throws Exception {

    }

    public void deleteParticipant(ParticipantVO participantVO) throws Exception {

    }

    public int getNextMaxID(String fileName) throws Exception {
        int strMaxId = 100;
        String line;
        String[] savedData;
        try {
            File directory = new File("");
            FileReader fileReader = new FileReader(directory.getCanonicalPath() + "/" + fileName);
            BufferedReader bufferRead = new BufferedReader(fileReader);

            while ((line = bufferRead.readLine()) != null) {
                savedData = line.split(",");
                if (Integer.parseInt(savedData[0]) > strMaxId) {
                    strMaxId = Integer.parseInt(savedData[0]);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return strMaxId + 1;
    }
    
}
