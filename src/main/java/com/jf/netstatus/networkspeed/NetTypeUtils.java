package com.jf.netstatus.networkspeed;

public class NetTypeUtils {
    /**
     * 设置默认速率kbs
     */
    private static int DEFAULT_POOR_BANDWIDTH = 150;
    private static int DEFAULT_MODERATE_BANDWIDTH = 550;
    private static int DEFAULT_GOOD_BANDWIDTH = 2000;



    public static void setDefaultPoorBandwidth(int defaultPoorBandwidth) {
        DEFAULT_POOR_BANDWIDTH = defaultPoorBandwidth;
    }

    public static void setDefaultModerateBandwidth(int defaultModerateBandwidth) {
        DEFAULT_MODERATE_BANDWIDTH = defaultModerateBandwidth;
    }

    public static void setDefaultGoodBandwidth(int defaultGoodBandwidth) {
        DEFAULT_GOOD_BANDWIDTH = defaultGoodBandwidth;
    }

    public static ConnectionQuality mapBandwidthQuality(double average) {
        if (average < 0) {
            return ConnectionQuality.UNKNOWN;
        }
        if (average < DEFAULT_POOR_BANDWIDTH) {
            return ConnectionQuality.POOR;
        }
        if (average < DEFAULT_MODERATE_BANDWIDTH) {
            return ConnectionQuality.MODERATE;
        }
        if (average < DEFAULT_GOOD_BANDWIDTH) {
            return ConnectionQuality.GOOD;
        }
        return ConnectionQuality.EXCELLENT;
    }
}
