package com.hsl.service;

import com.hsl.model.Role;

public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
}