package Helper;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class MyHelper {
    // Untuk memformat angka menjadi IDR Rupiah
    public static String formatIDR(double harga) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setCurrencySymbol("Rp ");
        symbols.setGroupingSeparator('.');

        DecimalFormat df = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        df.setDecimalFormatSymbols(symbols);

        return df.format(harga);
    }
}
