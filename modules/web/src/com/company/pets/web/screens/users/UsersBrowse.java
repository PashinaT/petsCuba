package com.company.pets.web.screens.users;

import com.haulmont.cuba.gui.screen.*;
import com.company.pets.entity.Users;

@UiController("pets_Users.browse")
@UiDescriptor("users-browse.xml")
@LookupComponent("usersesTable")
@LoadDataBeforeShow
public class UsersBrowse extends StandardLookup<Users> {
}