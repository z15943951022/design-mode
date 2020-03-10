package com.design.cn.memorandum;

import java.util.ArrayList;
import java.util.List;

public class Archive {

    private Role role;

    private List<Role> roles;

    public Archive() {
        roles=new ArrayList<>();
    }

    public void lastArchive(Role role){
        this.role=role;
    }

    public void addArchive(int index,Role role){
        roles.add(0,role);
    }

    public Role getArchive(int index){
        return roles.get(index);
    }

    public Role getLastArchive(){
        return role;
    }

}
