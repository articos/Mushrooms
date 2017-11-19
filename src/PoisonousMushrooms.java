public enum PoisonousMushrooms {
    AMANITA_MUSCARIA(false),
    AMANITA_PANTHERINA(true),
    CHLOROPHYLLUM_MOLYBDITES(false),
    ENTOLOMA(true),
    INOCYBE(true),
    WHITE_CLITOCYBE(true),
    TRICHOLOMA_PARDINUM(true),
    TRICHOLOMA_EQUESTRE(true),
    HYPHOLOMA_FASCICULARE(false),
    PAXILLUS_INVOLUTUS(true),
    RUBROBOLETUS_SATANAS(true),
    HEBELOMA_CRUSTULINIFORME(false),
    AGARICUS_CALIFORNICUS(true),
    LACTIFLUUS_PIPERATUS(true),
    LACTARIUS_VINACEORUFESCENS(true),
    RAMARIA_GELATINOSA(false),
    GOMPHUS_FLOCCOSUS(true);

    private boolean deadly;

    PoisonousMushrooms(boolean deadly) {
        this.deadly = deadly;
    }

    public boolean isDeadly() {
        return deadly;
    }

    public void setDeadly(boolean deadly) {
        this.deadly = deadly;
    }
}
