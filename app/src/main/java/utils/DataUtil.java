package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataUtil {

    public static final String DIA_E_MES = "dd/MM";

    public static String periodoEmTexto(int dias) {
        Calendar dataIda = Calendar.getInstance();
        Calendar dataVolta = Calendar.getInstance();
        dataVolta.add(Calendar.DATE, dias);
        SimpleDateFormat formatoBrasileiro = new SimpleDateFormat(DIA_E_MES);
        String dataFormatadaIda = formatoBrasileiro.format(dataIda.getTime());
        String dataFormatadaVolda = formatoBrasileiro.format(dataVolta.getTime());
        return dataFormatadaIda + " - " + dataFormatadaVolda + " de " + dataVolta.get(Calendar.YEAR);
    }
}
