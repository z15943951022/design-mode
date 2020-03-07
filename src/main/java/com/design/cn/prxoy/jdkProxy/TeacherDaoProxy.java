package com.design.cn.prxoy.jdkProxy;

public class TeacherDaoProxy implements ITeacherDao {


    private ITeacherDao iTeacherDao;

    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void teach() {
        System.out.println("目标方法执行前");
        iTeacherDao.teach();
        System.out.println("目标方法执行后");
    }
}
