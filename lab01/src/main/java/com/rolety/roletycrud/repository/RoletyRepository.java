package com.rolety.roletycrud.repository;

import com.rolety.roletycrud.domain.Rolety;
import java.util.List;

public interface RoletyRepository {
    public List<Rolety> getAll();
    public void initDatabase();
    public Rolety getById(Long id);
    public void addRolety(Rolety rolety);
    public void deleteRolety(Rolety rolety);
    public void updateRolety(long oldId, Rolety newRolety);

}