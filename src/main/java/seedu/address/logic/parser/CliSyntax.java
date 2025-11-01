package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_ADDRESS = new Prefix("a/");
    public static final Prefix PREFIX_STUDENTID = new Prefix("s/");
    public static final Prefix PREFIX_DATE = new Prefix("d/");
    public static final Prefix PREFIX_NOTE = new Prefix("pn/");
    public static final Prefix PREFIX_CLASSTAG = new Prefix("t/");
    public static final Prefix PREFIX_MONTH = new Prefix("m/");

    public static final Prefix[] ALL_PREFIXES = new Prefix[] {
        PREFIX_NAME, PREFIX_PHONE, PREFIX_EMAIL, PREFIX_ADDRESS,
        PREFIX_STUDENTID, PREFIX_DATE, PREFIX_NOTE, PREFIX_CLASSTAG, PREFIX_MONTH
    };

}
