package pankova;

public class Diagnosis {

    private final double Q = 0.785;
    private final double Q1 = 35.68;
    private final double RU = 17.85;
    private final double RY = 10.2;
    private final double M = 400;

    public String calculate(double d, double d1, double v) {
        double ad = Q * (Math.pow(d, 2) - Math.pow(d1, 2));
        double ak = Math.pow(d, 2) * Q;
        double pk = v * (Math.pow(d, 4) - Math.pow(d1, 4)) / Math.pow(d, 4);
        double sp = pk / v;
        double sm = M / (Math.pow(d1, 2) - (Math.pow(d, 2) - Math.pow(d1, 2)));
        double hnu = pk / RU;
        double hny = pk / Q1;

        if (hnu > 1) {
            return "Межпозвоночный диск разрушается";
        }
        if (hny > 1) {
            return "Позвонок разрушается";
        }

//        if (pg1 < -15) {
//            return  "Межпозвоночная грыжа приблизительно равна 0.6 см";
//        }
//        if (pg1 < -30) {
//            return  "Межпозвоночная грыжа приблизительно равна 1 см";
//        }
//        if (pg1 < -90) {
//            return  "Межпозвоночный диск не существует";
//        }
//
//        if (pg2 < -15) {
//            return  "Межпозвоночная грыжа приблизительно равна 0.6 см";
//        }
//        if (pg2 < -30) {
//            return  "Межпозвоночная грыжа приблизительно равна 1 см";
//        }
//        if (pg2 < -90) {
//            return  "Межпозвоночный диск не существует";
//        }
        return "Не удалось произвести расчет";
    }
}
