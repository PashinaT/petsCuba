package com.company.pets.web.screens.tablelistpets2;

import com.haulmont.cuba.gui.screen.*;
import com.company.pets.entity.TableListPets2;

@UiController("pets_TableListPets2.edit")
@UiDescriptor("table-list-pets2-edit.xml")
@EditedEntityContainer("tableListPets2Dc")
@LoadDataBeforeShow
public class TableListPets2Edit extends StandardEditor<TableListPets2> {
}