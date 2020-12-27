package com.company.pets.web.screens.tableshelter;

import com.haulmont.cuba.gui.screen.*;
import com.company.pets.entity.TableShelter;

@UiController("pets_TableShelter.browse")
@UiDescriptor("table-shelter-browse.xml")
@LookupComponent("tableSheltersTable")
@LoadDataBeforeShow
public class TableShelterBrowse extends StandardLookup<TableShelter> {
}