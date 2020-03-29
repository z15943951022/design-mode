package logger;

/**
 * 模板方法模式
 */
public abstract class AbstractloggerTemplate {

    LoggerProperties loggerProperties;


    /**
     * 模板方法
     */
    public final void execute(){
        this.loggerProperties=before();
        if (null == loggerProperties) loggerProperties = new LoggerProperties();
        exFilepath();
        exdb();
        aflter();
    }

    /**
     * 设置配置文件路径
     */
    public abstract LoggerProperties before();

    public void exFilepath(){
        System.out.println("读取配置文件:"+loggerProperties.getFilepath());
    }

    public void exdb(){
        System.out.println("存储位置为:"+loggerProperties.getDbsource());
    }

    public void aflter(){
        System.out.println("执行结束");
    }




}
