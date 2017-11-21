package com.ca.uim.field;

import com.nimsoft.nimbus.*;

public class ProbeMain {
    private MyNimProbe nimProbe;
    static private NimLog logger = NimLog.getLogger(ProbeMain.class);

    public static final  String PROBE_NAME = "my_probe_name";
    public static final  String PROBE_VERSION = "1.00";
    public static final  String PROBE_VENDOR = "com.ca";


    public static void main(final String[] args) {
        try {
           ProbeMain pm = new ProbeMain(args);
           pm.executeUntilHalt();
        } catch (final Exception e) {
            logger.fatal(e.getMessage());
        }
    }

    public ProbeMain(final String[] args)throws NimException{
        nimProbe = new MyNimProbe(PROBE_NAME, PROBE_VERSION, PROBE_VENDOR, args);
        nimProbe.login();
    }

    private void executeUntilHalt() throws NimException{
        do {
            // TODO - insert your code here
        } while (nimProbe.doForever());
    }

}
