package com.company.pets.web.screens.users;

import com.haulmont.cuba.gui.screen.*;
import com.company.pets.entity.Users;

@UiController("pets_Users.edit")
@UiDescriptor("users-edit.xml")
@EditedEntityContainer("usersDc")
@LoadDataBeforeShow
public class UsersEdit extends StandardEditor<Users> {
}