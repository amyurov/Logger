package Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    // Храним ссылку на единственный экземпляр класса
    private static Logger logger;

    //Скрываем конструктор
    private Logger() {
    }

    //Метод для доступа к объекту
    public static Logger getInstance() {
        if (logger == null)
            logger = new Logger();
        return logger;
    }

    private int num = 1;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy HH.mm.ss");
    private StringBuilder sb = new StringBuilder();

    public void log(String msg) {
        System.out.println("[" + sdf.format(new Date()) + " " + num + "] " + msg);
        num++;
    }
}
