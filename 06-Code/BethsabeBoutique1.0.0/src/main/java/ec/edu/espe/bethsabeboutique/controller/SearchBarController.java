package ec.edu.espe.bethsabeboutique.controller;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author caeta
 */
public class SearchBarController {
    public TableRowSorter<DefaultTableModel> searchOnTable(TableRowSorter<DefaultTableModel> tableRowSorter, 
           String searchText) {
        if (searchText.length() == 0) {
            tableRowSorter.setRowFilter(null);
        } else {
            RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter(searchText);
            tableRowSorter.setRowFilter(rowFilter);
        }
        
        return tableRowSorter;
    }
}
