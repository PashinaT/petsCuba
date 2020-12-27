package com.company.pets.web.screens.tablelistpets2;

import com.haulmont.cuba.gui.screen.*;
import com.company.pets.entity.TableListPets2;

@UiController("pets_TableListPets2.browse")
@UiDescriptor("table-list-pets2-browse.xml")
@LookupComponent("tableListPets2sTable")
@LoadDataBeforeShow
public class TableListPets2Browse extends StandardLookup<TableListPets2> {
}