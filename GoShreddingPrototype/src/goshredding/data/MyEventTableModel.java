/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goshredding.data;

import goshredding.vo.EventVO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author syp386
 */
public class MyEventTableModel extends AbstractTableModel{
    private ArrayList eventList=null;
    public MyEventTableModel(ArrayList eventList){
        this.eventList=eventList;
    }
    @Override
    public int getRowCount() {
         return eventList.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EventVO eventVO=(EventVO)eventList.get(rowIndex);
        if(columnIndex == 0){
            return eventVO.eventName;
        }else if(columnIndex == 1){
            return eventVO.eventDate;
        }else if(columnIndex == 2){
            return eventVO.eventType;
        }else{
            return "";
        }
    }
    
}
