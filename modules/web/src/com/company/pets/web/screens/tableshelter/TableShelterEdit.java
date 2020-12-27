package com.company.pets.web.screens.tableshelter;

import com.haulmont.cuba.gui.screen.*;
import com.company.pets.entity.TableShelter;

@UiController("pets_TableShelter.edit")
@UiDescriptor("table-shelter-edit.xml")
@EditedEntityContainer("tableShelterDc")
@LoadDataBeforeShow
public class TableShelterEdit extends StandardEditor<TableShelter> {
}