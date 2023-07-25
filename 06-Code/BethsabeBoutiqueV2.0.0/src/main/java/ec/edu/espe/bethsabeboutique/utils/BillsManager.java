package ec.edu.espe.bethsabeboutique.utils;

/**
 *
 * @author caeta
 */
public class BillsManager {
    public float calculateIva(float price, float ivaPersentage) {
        float iva = price*(ivaPersentage/100);
        float roundedIva = Math.round(iva * 100) / 100.0f;
        return roundedIva;
    }
}
