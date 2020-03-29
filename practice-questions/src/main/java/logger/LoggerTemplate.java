package logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 具体日志模板实现
 */
public class LoggerTemplate extends AbstractloggerTemplate {


    @Override
    public LoggerProperties before() {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("G:\\ideaSpace\\designmode\\practice-questions\\src\\main\\resources\\日志文件配置.properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        LoggerProperties loggerProperties = new LoggerProperties();

        String dbsource = properties.getProperty("dbsource");
        loggerProperties.setDbsource(DbType.valueOf(dbsource));
        loggerProperties.setFilepath("G:\\ideaSpace\\designmode\\practice-questions\\src\\main\\resources\\日志文件配置.properties");
        return loggerProperties;
    }
}
