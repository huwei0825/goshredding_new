/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPRD;

import goshredding.vo.EventVO;
import goshredding.data.PictureViewPanel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author syp386
 */
public class EventCellRender3 implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
         EventVO eventObj = (EventVO) value;
        EventCellPanel eventCellPanel=new EventCellPanel(eventObj);
       return  eventCellPanel;
    }
    
}
