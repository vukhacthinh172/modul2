package business.util;

import java.text.NumberFormat;
import java.util.Locale;

public class Formatter {
    public  static NumberFormat getNumberFomatterVND(){
        Locale locale = new Locale("vi","VN");
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
        return numberFormat;
    }
}
