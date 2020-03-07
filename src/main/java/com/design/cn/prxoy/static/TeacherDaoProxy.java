package proxy;

public class TeacherDaoProxy implements proxy.ITeacherDao {


    private proxy.ITeacherDao iTeacherDao;

    public TeacherDaoProxy(proxy.ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void teach() {
        System.out.println("目标方法执行前");
        iTeacherDao.teach();
        System.out.println("目标方法执行后");
    }
}
