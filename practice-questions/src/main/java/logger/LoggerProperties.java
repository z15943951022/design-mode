package logger;

/**
 * 日志信息配置
 */
public class LoggerProperties {

    /**
     * 默认读取路径
     */
    private String filepath = "loggercfg";

    /**
     * 默认持久化位置
     */
    private DbType dbsource = DbType.TXT;

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public DbType getDbsource() {
        return dbsource;
    }

    public void setDbsource(DbType dbsource) {
        this.dbsource = dbsource;
    }
}
