package be.pxl.vraag1;

/*
    Daan Vankerkom
    1 TIN J
 */
public enum Land {

    LYONESSE,
    DAHOUT,
    POMPEROL,
    BLALOC,;

    @Override
    public String toString() {
        String value = super.toString();
        return value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase();
    }
}
