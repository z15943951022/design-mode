package com.design.cn.test;

import com.design.cn.memorandum.Archive;
import com.design.cn.memorandum.Role;

public class TestMain {

    public static void main(String[] args) throws CloneNotSupportedException, IllegalAccessException {
        Archive archive = new Archive();

        Role role = new Role();
        role.setPower(100);
        role.setSeed(100);

        System.out.println("大战前"+role);
        archive.lastArchive(role.createMemento());
        System.out.println("存档");

        role.setPower(50);
        role.setSeed(50);

        System.out.println("大战够"+role);
        role.recoverGameRoleFromMemento(archive.getLastArchive());
        System.out.println("回档后"+role);


    }

}