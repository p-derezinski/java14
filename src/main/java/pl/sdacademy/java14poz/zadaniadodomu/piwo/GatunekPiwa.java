package pl.sdacademy.java14poz.zadaniadodomu.piwo;

public enum GatunekPiwa {

    LAGER, PILZNER, STOUT, PORTER, MIODOWE;

    public static String opiszPiwo(GatunekPiwa nazwaPiwa) {
        switch (nazwaPiwa) {
            case LAGER:
                return "Piwo Lager (jasne)";
            case PILZNER:
                return "Piwo Pilzner (jasne)";
            case STOUT:
                return "Piwo Stout (ciemne)";
            case PORTER:
                return "Piwo Porter (ciemne)";
            case MIODOWE:
                return "Piwo Miodowe (jasne)";
            default:
                return "To chyba nowe piwo";
        }
    }

}
